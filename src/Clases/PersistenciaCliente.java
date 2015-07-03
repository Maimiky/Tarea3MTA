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
 * @author Lenovo
 */
public class PersistenciaCliente {

    public static void SaveData(ArrayList<Cliente> listCliente) {
        try {
            FileOutputStream file = new FileOutputStream("cliente.ser");
            ObjectOutputStream stream = new ObjectOutputStream(file);
            stream.writeObject(listCliente);
            stream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Cliente> LoadData() {
        ArrayList<Cliente> listCliente = null;
        try {
            FileInputStream file = new FileInputStream("cliente.ser");
            ObjectInputStream stream = new ObjectInputStream(file);
            listCliente = (ArrayList<Cliente>) stream.readObject();
            stream.close();
        } catch (Exception e) {
            e.printStackTrace();
            listCliente = null;
        }
        return (listCliente != null) ? listCliente : new ArrayList<Cliente>();
    }

}
