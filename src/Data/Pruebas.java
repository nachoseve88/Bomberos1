/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Entidades.Bombero;
import Entidades.Brigada;
import Entidades.Cuartel;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author gassani
 */
public class Pruebas {
      public static void main(String[] args) throws SQLException {

          BrigadaData brig = new BrigadaData();
          CuartelData cuart = new CuartelData();
          BomberoData bombData = new BomberoData();
          
          Cuartel cuartel = cuart.buscarCuartel(1);          
          Brigada bri = brig.buscarBrigada(1);
          
          Bombero eladio = new Bombero("39.550.789","Mauricio Galarza","A",LocalDate.of(1991, Month.OCTOBER, 8),"1171626610",bri);
          bombData.guardarBomero(eladio);
      }
}
