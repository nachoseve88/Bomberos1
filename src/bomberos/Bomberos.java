/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bomberos;

import Data.BomberoData;
import Data.CuartelData;
import Entidades.Bombero;
import Entidades.Brigada;
import Entidades.Cuartel;
import java.time.LocalDate;
import java.time.Month;
import javax.swing.JOptionPane;

/**
 *
 * @author nacho
 */
public class Bomberos {
    /**
    private static int opcion = 0;
    private static String menu;
    
    public static void mostrarMenu(){
        /**
        menu = "";
        menu += "*************************************************************" + "\n";
        menu += "*                       PLANO CARTECIANO                     *" + "\n";
        menu += "*************************************************************" + "\n";
        menu += "*         CALCULAR DISTANCIA ENTRE DOS PUNTOS       *" + "\n";
        menu += "*************************************************************" + "\n";
        menu += "1. Crear puntos 1 = (x1, y1) y p2 = (x2, y2)"  + "\n";
        menu += "2. calcular distancia" + "\n";
        menu += "3. Salir" + "\n" + "\n";
        menu += "4. Seleccione una opcion" + "\n";
    
    }    
    */    
    
    
    public static void main(String[] args) {
    
    /**    
        int x = 0, y = 0;
        String x1= "SELECT coord_X FROM `cuartel` WHERE 1", y1 = "SELECT coord_Y FROM `cuartel` WHERE 1";
        String x2= "SELECT coord_X FROM `cuartel` WHERE 1", y2 = "SELECT coord_Y FROM `cuartel` WHERE 1";
        puntoXY p1 = new puntoXY(x, y);
        puntoXY p2 = new puntoXY(x, y);
        
        do{
            mostrarMenu();
            try{
                opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
                
                switch(opcion){
                    case 1:
                        x1 = JOptionPane.showInputDialog("Introdusca lacordenada X1: ");
                        x = Integer.parseInt(x1);
                        y1 = JOptionPane.showInputDialog("Introdusca lacordenada Y1: ");
                        y = Integer.parseInt(y1);
                        p1.setX(x);
                        p1.setY(y);
                        JOptionPane.showMessageDialog(null, "\n" + "El punto se encuentra en: " + p1.getX() + "," + p1.getY() + "\n");
                        
                        x2 = JOptionPane.showInputDialog("Introdusca lacordenada X2: ");
                        x = Integer.parseInt(x2);
                        y2 = JOptionPane.showInputDialog("Introdusca lacordenada Y2: ");
                        y = Integer.parseInt(y2);
                        p2.setX(x);
                        p2.setY(y);
                        JOptionPane.showMessageDialog(null, "\n" + "El punto se encuentra en: " + p2.getX() + "," + p2.getY() + "\n");
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "\n" + "La distancia desde el punto " + p1.getX() + "," + p1.getY() + " al punto " + p2.getX() + "," + p2.getY() + " es: " + p1.calcularDistancia(p2));
                        break;
                }
                
            } catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null,"opcion incorrecta!!!");
            }
        } while(opcion != 3);
    
    **/
        Cuartel cua = new Cuartel();
        CuartelData cuaDat = new CuartelData();
        Cuartel cuartelverde = new Cuartel("Cuartel verde","Viamonte 333",55,22,"4544548","cuartelverde96@hotmi.com");
        cuaDat.guardarCuartel(cua);
        
        //Brigada bri = new Brigada(); 
        //Bombero juan = new Bombero("33696717", "Juan Rodolfi", "AB", LocalDate.of(1995, Month.JANUARY, 15),"0291543234",);
        //BomberoData bomDat = new BomberoData();
        
    }    
        
 }
