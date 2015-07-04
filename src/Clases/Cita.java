/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.Serializable;

/**
 *
 * @author Lenovo
 */
public class Cita implements Serializable {
    String nombreMascota;
    String Cliente;
    String DNI;
    String DiaDeCita;
    String HoraDeCita;
    String EspecieMascota;

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public String getCliente() {
        return Cliente;
    }

    public void setCliente(String Cliente) {
        this.Cliente = Cliente;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getDiaDeCita() {
        return DiaDeCita;
    }

    public void setDiaDeCita(String DiaDeCita) {
        this.DiaDeCita = DiaDeCita;
    }

    public String getHoraDeCita() {
        return HoraDeCita;
    }

    public void setHoraDeCita(String HoraDeCita) {
        this.HoraDeCita = HoraDeCita;
    }

    public String getEspecieMascota() {
        return EspecieMascota;
    }

    public void setEspecieMascota(String EspecieMascota) {
        this.EspecieMascota = EspecieMascota;
    }
    
    
    
}
