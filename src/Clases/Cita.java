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
    ArrayList Nombre;
    ArrayList Apelllido;
    ArrayList HistorialClinico;
    ArrayList Telefono;
    ArrayList Sintomas;
    ArrayList Correo;
    ArrayList NombreMascota;
    ArrayList Especie;
    
    //INSERTAR CONSTRUCTOR

    public Cita(ArrayList Nombre, ArrayList Apelllido, ArrayList HistirialClinico, ArrayList Telefono, ArrayList Sintomas, ArrayList Correo, ArrayList NombreMascota, ArrayList Especie) {
        this.Nombre = Nombre;
        this.Apelllido = Apelllido;
        this.HistorialClinico = HistorialClinico;
        this.Telefono = Telefono;
        this.Sintomas = Sintomas;
        this.Correo = Correo;
        this.NombreMascota = NombreMascota;
        this.Especie = Especie;
        
        
        
        
    }

    public ArrayList getNombre() {
        return Nombre;
    }

    public void setNombre(ArrayList Nombre) {
        this.Nombre = Nombre;
    }

    public ArrayList getApelllido() {
        return Apelllido;
    }

    public void setApelllido(ArrayList Apelllido) {
        this.Apelllido = Apelllido;
    }

    public ArrayList getHistorialClinico() {
        return HistorialClinico;
    }

    public void setHistorialClinico(ArrayList HistorialClinico) {
        this.HistorialClinico = HistorialClinico;
    }

    public ArrayList getTelefono() {
        return Telefono;
    }

    public void setTelefono(ArrayList Telefono) {
        this.Telefono = Telefono;
    }

    public ArrayList getSintomas() {
        return Sintomas;
    }

    public void setSintomas(ArrayList Sintomas) {
        this.Sintomas = Sintomas;
    }

    public ArrayList getCorreo() {
        return Correo;
    }

    public void setCorreo(ArrayList Correo) {
        this.Correo = Correo;
    }

    public ArrayList getNombreMascota() {
        return NombreMascota;
    }

    public void setNombreMascota(ArrayList NombreMascota) {
        this.NombreMascota = NombreMascota;
    }

    public ArrayList getEspecie() {
        return Especie;
    }

    public void setEspecie(ArrayList Especie) {
        this.Especie = Especie;
    }
    
    //INGRESAMOS LOS METODOS QUE VAMOS A CREAR
    
    public abstract void IngresarNombre(String Nombres);
    public abstract void IngresarApellidos(String Apellidos);
    public abstract void IngresarHistorialClinico(String Historial);
    public abstract void IngresarTelefono(int Telefono);
    public abstract void IngresarSintomas(String Sintomas);
    public abstract void IngresarCorreo(String Correo);
    public abstract void IngresarNombreMascota(String NombreMascota);
    public abstract void IngresarEspecie(String Especie);
    public abstract void EliminarNombre(String Nombres);
    public abstract void EliminarApellidos(String Apellidos);
    public abstract String BuscarNombre(String Nombre);
    public abstract String BuscarApellidos(String Apellidos); 
    
}
