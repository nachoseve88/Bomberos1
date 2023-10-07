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
     
     public BrigadaData(){
           con = miConexion.getConexion();
    }
     
     public void guardarBrigada(Brigada brigada){
        String sql = "INSERT INTO brigada(nombre_br, especialidad, libre, codCuartel) VALUES (?,?,?,?)";
        try{
           PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
           ps.setString(1, brigada.getNombreBr());
           ps.setString(2, brigada.getEspecialidad());
           ps.setBoolean(3, brigada.isLibre());
           ps.setInt(4, brigada.getCuartel().getcodCuartel());//codbrigada
           
           ps.executeUpdate();
           
          ResultSet rs = ps.getGeneratedKeys();
          if(rs.next()){
              brigada.setcodBrigada(rs.getInt("codBrigada"));
          }else{
              System.out.println("No se pudo obtener ID");
        }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a brigada "+ex.getMessage());
    }
 }
     
    public Brigada buscarBrigada(int id){
        Brigada brigada = null;
        String sql = "SELECT codBrigada, nombre_br, especialidad, libre, codCuartel FROM `brigada` WHERE codBrigada = ?";
        PreparedStatement ps = null;
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1,id);
            
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
            brigada = new  Brigada();
            
            ps.setInt(1, brigada.getcodBrigada());
            ps.setString(2, brigada.getNombreBr());
            ps.setString(3, brigada.getEspecialidad());
            ps.setBoolean(4, brigada.isLibre());
            ps.setInt(5, brigada.getCuartel().getcodCuartel());
            
            JOptionPane.showMessageDialog(null,brigada.toString());
        }else {
                JOptionPane.showMessageDialog(null, "No existe la brigada");
                }
        ps.close();
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Brigada "+ex.getMessage());
        }
        return brigada;
    }
}
