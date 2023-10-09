/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Entidades.Brigada;
import Entidades.Cuartel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
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
     
    public List<Brigada> listarBrigada(){
        ArrayList <Brigada> brigadas = new ArrayList<>() ;
        String sql = "SELECT * FROM `brigada`";
     
        try{
             PreparedStatement ps = con.prepareStatement(sql);
           
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
            Brigada brigada = new Brigada();
            brigada.setcodBrigada(rs.getInt("codBrigada"));
            Cuartel cua = cuaData.buscarCuartel(rs.getInt("codCuartel"));

            brigada.setNombreBr(rs.getString("nombre_br"));
            brigada.setEspecialidad(rs.getString("especialidad"));
           brigada.setLibre(rs.getBoolean("libre"));
            brigada.setCuartel(cua);
            brigadas.add(brigada);
            JOptionPane.showMessageDialog(null,brigada.toString());
   
                }
        ps.close();
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Brigada "+ex.getMessage());
        }
        return brigadas;
    }
       public Brigada buscarBrigada(int id){
         Brigada brigada = null;
        String sql = "SELECT * FROM brigada";
        PreparedStatement ps = null;
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1,id);
            
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
            brigada = new  Brigada();
            brigada.setcodBrigada(id);
            brigada.setNombreBr(rs.getString("nombre_br"));
            brigada.setEspecialidad(rs.getString("especialidad"));
            brigada.setLibre(rs.getBoolean("libre"));
            Cuartel cua = cuaData.buscarCuartel(rs.getInt("codCuartel"));
            brigada.setCuartel(cua);
            
     
       }else {
                JOptionPane.showMessageDialog(null, "No existe el cuartel");
                }
        ps.close();
                } catch (SQLException ex){
     JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Cuartel "+ex.getMessage());
        }
        return brigada;
}    
}
