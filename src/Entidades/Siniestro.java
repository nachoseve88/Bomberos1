/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Date;

/**
 *
 * @author nacho
 */
public class Siniestro {
    private int idSiniestro;
    private String tipo;
    private Date fechaSiniestro;
    private int coordX;
    private int coordY;
    private String detalles;
    private Date fechaResol;
    private int puntuacion;
    private Brigada brigada;
    
    public Siniestro(){
    }

    public Siniestro(int idSiniestro, String tipo, Date fechaSiniestro, int coordX, int coordY, String detalles, Date fechaResol, int puntuacion, Brigada brigada) {
        this.idSiniestro = idSiniestro;
        this.tipo = tipo;
        this.fechaSiniestro = fechaSiniestro;
        this.coordX = coordX;
        this.coordY = coordY;
        this.detalles = detalles;
        this.fechaResol = fechaResol;
        this.puntuacion = puntuacion;
        this.brigada = brigada;
    }

    public Siniestro(String tipo, Date fechaSiniestro, int coordX, int coordY, String detalles, Date fechaResol, int puntuacion, Brigada brigada) {
        this.tipo = tipo;
        this.fechaSiniestro = fechaSiniestro;
        this.coordX = coordX;
        this.coordY = coordY;
        this.detalles = detalles;
        this.fechaResol = fechaResol;
        this.puntuacion = puntuacion;
        this.brigada = brigada;
    }
    
    
    public int getIdSiniestro() {
        return idSiniestro;
    }

    public void setIdSiniestro(int idSiniestro) {
        this.idSiniestro = idSiniestro;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getFechaSiniestro() {
        return fechaSiniestro;
    }

    public void setFechaSiniestro(Date fechaSiniestro) {
        this.fechaSiniestro = fechaSiniestro;
    }

    public int getCoordX() {
        return coordX;
    }

    public void setCoordX(int coordX) {
        this.coordX = coordX;
    }

    public int getCoordY() {
        return coordY;
    }

    public void setCoordY(int coordY) {
        this.coordY = coordY;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public Date getFechaResol() {
        return fechaResol;
    }

    public void setFechaResol(Date fechaResol) {
        this.fechaResol = fechaResol;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public Brigada getBrigada() {
        return brigada;
    }

    public void setBrigada(Brigada brigada) {
        this.brigada = brigada;
    }
    
    
}
