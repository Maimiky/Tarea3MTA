/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.*;

/**
 *
 * @author -Katerin-
 */
public abstract class Cita {
   private String nombreMascota;
   private int NumeroCita;
   private String Enfermedad;
   private String Pago;
   private int Fecha;

    public Cita(String nombreMascota, int NumeroCita, String Enfermedad, String Pago, int Fecha) {
        this.nombreMascota = nombreMascota;
        this.NumeroCita = NumeroCita;
        this.Enfermedad = Enfermedad;
        this.Pago = Pago;
        this.Fecha = Fecha;
    }
   
   
  
    
    //INSERTAR CONSTRUCTOR}

    /**
     * @return the nombreMascota
     */
    public String getNombreMascota() {
        return nombreMascota;
    }

    /**
     * @param nombreMascota the nombreMascota to set
     */
    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    /**
     * @return the NumeroCita
     */
    public int getNumeroCita() {
        return NumeroCita;
    }

    /**
     * @param NumeroCita the NumeroCita to set
     */
    public void setNumeroCita(int NumeroCita) {
        this.NumeroCita = NumeroCita;
    }

    /**
     * @return the Enfermedad
     */
    public String getEnfermedad() {
        return Enfermedad;
    }

    /**
     * @param Enfermedad the Enfermedad to set
     */
    public void setEnfermedad(String Enfermedad) {
        this.Enfermedad = Enfermedad;
    }

    /**
     * @return the Pago
     */
    public String getPago() {
        return Pago;
    }

    /**
     * @param Pago the Pago to set
     */
    public void setPago(String Pago) {
        this.Pago = Pago;
    }

    /**
     * @return the Fecha
     */
    public int getFecha() {
        return Fecha;
    }

    /**
     * @param Fecha the Fecha to set
     */
    public void setFecha(int Fecha) {
        this.Fecha = Fecha;
    }
}