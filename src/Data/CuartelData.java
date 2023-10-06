/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Entidades.Cuartel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author nacho
 */
public class CuartelData {
     private Connection con = null;
     
     public void guardarCuartel(Cuartel cuartel){
        String sql = "INSERT INTO `cuartel`(nombre_cuartel, direccion, coord_X, coord_Y, teléfono, correo) VALUES (?,?,?,?,?,?)";
        try{
           PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
           ps.setString(1, cuartel.getNombre_Cuartel());
           ps.setString(2, cuartel.getDireccion());
           ps.setInt(3, cuartel.getCoord_X());
           ps.setInt(4, cuartel.getCoord_Y());
           ps.setString(5, cuartel.getTelefono());
           ps.setString(6, cuartel.getCorreo());
           
           ps.executeUpdate();
           
          ResultSet rs = ps.getGeneratedKeys();
          if(rs.next()){
                cuartel.setcodCuartel(rs.getInt("codCuartel"));
          }else{
              System.out.println("No se pudo obtener ID");
        }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a Alumno"+ex.getMessage());
    }
 }
}