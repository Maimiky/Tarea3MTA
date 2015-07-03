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
 * @author Nixia
 */
public class PersistenciaMascota {
     public static  void SaveData(ArrayList<Mascota> listmMascotas){
        try {
            FileOutputStream file=new FileOutputStream("mascota.ser");
            ObjectOutputStream stream=new ObjectOutputStream(file);
            stream.writeObject(listmMascotas);
            stream.close();
        } catch (Exception e) {
//           e.printStackTrace();
        }
    }
    public static ArrayList<Mascota> LoadData(){
        ArrayList<Mascota> listmMascotas=null;
        try {
            FileInputStream file =new FileInputStream("mascota.ser");
            ObjectInputStream stream=new ObjectInputStream(file);
            listmMascotas=(ArrayList<Mascota>)stream.readObject();
            stream.close();
        } catch (Exception e) {
//       e.printStackTrace();
            listmMascotas=null;
        }
        return (listmMascotas!=null)? listmMascotas:new ArrayList<Mascota>();
    }
    
}
