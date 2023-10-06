/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bomberos;

/**
 *
 * @author nacho
 */
public class puntoXY extends coordenadas {
    
    public static double distancia = 0;
    
    public puntoXY(int x, int y) {
        super(x, y);
    }

    public double calcularDistancia(puntoXY p) {
        distancia = Math.sqrt(Math.pow(x - p.getX(), 2) + Math.pow(y - p.getY(), 2));
        return distancia;
    }
    
    @Override
    public double calcularDistancia() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public void finalize() throws Throwable {
        distancia--;
    }
}
