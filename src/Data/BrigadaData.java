/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Entidades.Brigada;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class BrigadaData {
     private Connection con = null;
     private CuartelData cuaData = new CuartelData();
     
     public void guardarBrigada(Brigada brigada){
        String sql = "INSERT INTO brigada(nombre_br, especialidad, libre, codCuartel) VALUES (?,?,?,?)";
        try{
           PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
           ps.setString(1, brigada.getNombreBr());
           ps.setString(2, brigada.getEspecialidad());
           ps.setBoolean(3, brigada.isLibre());
           ps.setInt(6, brigada.getCuartel().getcodCuartel());//codbrigada
           
           ps.executeUpdate();
           
          ResultSet rs = ps.getGeneratedKeys();
          if(rs.next()){
              brigada.setIdBrigada(rs.getInt("idBrigada"));
          }else{
              System.out.println("No se pudo obtener ID");
        }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a Alumno"+ex.getMessage());
    }
 }
}
