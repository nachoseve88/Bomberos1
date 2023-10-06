/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author nacho
 */
public class Brigada {
    private int idBrigada;
    private String nombreBr;
    private String especialidad;
    private boolean libre;
    private Cuartel cuartel;
    
    public Brigada(){
    }

    public Brigada(int idBrigada, String nombreBr, String especialidad, boolean libre, Cuartel cuartel) {
        this.idBrigada = idBrigada;
        this.nombreBr = nombreBr;
        this.especialidad = especialidad;
        this.libre = libre;
        this.cuartel = cuartel;
    }

    public Brigada(String nombreBr, String especialidad, boolean libre, Cuartel cuartel) {
        this.nombreBr = nombreBr;
        this.especialidad = especialidad;
        this.libre = libre;
        this.cuartel = cuartel;
    }
    
    
    public int getIdBrigada() {
        return idBrigada;
    }

    public void setIdBrigada(int idBrigada) {
        this.idBrigada = idBrigada;
    }

    public String getNombreBr() {
        return nombreBr;
    }

    public void setNombreBr(String nombreBr) {
        this.nombreBr = nombreBr;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public boolean isLibre() {
        return libre;
    }

    public void setLibre(boolean libre) {
        this.libre = libre;
    }

    public Cuartel getCuartel() {
        return cuartel;
    }

    public void setCuartel(Cuartel cuartel) {
        this.cuartel = cuartel;
    }
    
}
