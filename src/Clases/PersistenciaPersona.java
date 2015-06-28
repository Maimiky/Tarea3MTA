/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


/**
 *
 * @author lokitta
 */
public class PersistenciaPersona {

    public static void SaveData(ArrayList<Persona> listado) {
       
try {
            FileOutputStream file=new FileOutputStream("Persona.ser");
            ObjectOutputStream stream=new ObjectOutputStream(file);
            stream.writeObject(listado);
            stream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
}
    public static ArrayList<Persona> LoadData(){
        ArrayList<Persona> listado=null;
        try {
            FileInputStream file =new FileInputStream("Persona.ser");
            ObjectInputStream stream=new ObjectInputStream(file);
            listado=(ArrayList<Persona>)stream.readObject();
            stream.close();
        } catch (Exception e) {
            e.printStackTrace();
            listado=null;
        }
        return (ArrayList<Persona>) ((listado!=null)? listado:new ArrayList<Persona>());
    }}
    

