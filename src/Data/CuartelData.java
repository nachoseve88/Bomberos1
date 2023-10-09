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
     
     public CuartelData(){
           con = miConexion.getConexion();
    }
     
     public void guardarCuartel(Cuartel cuartel)throws SQLException{
        String sql = "INSERT INTO `cuartel`(nombre_cuartel, direccion, coord_X, coord_Y, teléfono, correo) VALUES (?,?,?,?,?,?)";
        try{
           PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
           ps.setString(1, cuartel.getNombre_cuartel());
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
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a Cuartel"+ex.getMessage());
    }
 }
     public Cuartel buscarCuartel(int id){
         Cuartel cuartel = null;
        String sql = "SELECT nombre_cuartel,direccion,coord_X,coord_Y,teléfono,correo FROM cuartel";
        PreparedStatement ps = null;
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1,id);
            
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
            cuartel = new  Cuartel();
            cuartel.setcodCuartel(id);
            cuartel.setNombre_cuartel(rs.getString("nombre_cuartel"));
            cuartel.setDireccion(rs.getString("direccion"));
            cuartel.setCoord_X(rs.getInt("coord_X"));
            cuartel.setCoord_Y(rs.getInt("coord_Y"));
            cuartel.setTelefono(rs.getString("teléfono"));
     
            JOptionPane.showMessageDialog(null,cuartel.toString());
        }else {
                JOptionPane.showMessageDialog(null, "No existe el cuartel");
                }
        ps.close();
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Cuartel "+ex.getMessage());
        }
        return cuartel;
}    
}
