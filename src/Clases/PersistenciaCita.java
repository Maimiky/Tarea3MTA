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
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class PersistenciaCita {
 public static  void SaveData(ArrayList<Cita> listCita){
        try {
            FileOutputStream file=new FileOutputStream("cita.ser");
            ObjectOutputStream stream=new ObjectOutputStream(file);
            stream.writeObject(listCita);
            stream.close();
        } catch (Exception e) {
//           e.printStackTrace();
        }
    }
    public static ArrayList<Cita> LoadData(){
        ArrayList<Cita> listCita=null;
        try {
            FileInputStream file =new FileInputStream("cita.ser");
            ObjectInputStream stream=new ObjectInputStream(file);
            listCita=(ArrayList<Cita>)stream.readObject();
            stream.close();
        } catch (Exception e) {
//       e.printStackTrace();
            listCita=null;
        }
        return (listCita!=null)? listCita:new ArrayList<Cita>();
    }
    

    
}
