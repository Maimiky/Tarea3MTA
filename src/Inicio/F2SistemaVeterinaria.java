/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inicio;



import Clases.ConsultarPersona;
import JFrames.F1InsertarCliente;
import JFrames.F2EliminarCliente;
import JFrames.F3consultarCliente;
import JFrames.F7InsertarMascota;
import JFrames.F8EliminarMascota;
import java.awt.Color;
import javax.swing.ImageIcon;


/**
 *
 * @author Lenovo
 */
public class F2SistemaVeterinaria extends javax.swing.JFrame {
    private Object desktopPane;

    /**
     * Creates new form SistemaVeterinaria
     */
    public F2SistemaVeterinaria() {
        initComponents();
        setLocationRelativeTo(null);
        setBackground(Color.yellow);
        setResizable(false);
        setTitle("Ejemplo");
         setIconImage(new ImageIcon(getClass().getResource("/iconos/HISTORIALMEDICO.png")).getImage());       
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuBar4 = new javax.swing.JMenuBar();
        jMenu8 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuBar5 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        Escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        insertarCliente = new javax.swing.JMenuItem();
        EliminarCliente = new javax.swing.JMenuItem();
        ConsultarCliente = new javax.swing.JMenuItem();
        jMenu10 = new javax.swing.JMenu();
        InsertarPersona = new javax.swing.JMenuItem();
        EliminarPersona = new javax.swing.JMenuItem();
        ConsultarPersona = new javax.swing.JMenuItem();
        jMenu11 = new javax.swing.JMenu();
        InsertarAnimal = new javax.swing.JMenuItem();
        EliminarAnimal = new javax.swing.JMenuItem();
        ConsultarAnimal = new javax.swing.JMenuItem();
        jMenu12 = new javax.swing.JMenu();
        InsertarCitas = new javax.swing.JMenuItem();
        ActualizarCitas = new javax.swing.JMenuItem();
        ConsultarCitas = new javax.swing.JMenuItem();
        jMenu13 = new javax.swing.JMenu();
        InsertarFechaVacunacion = new javax.swing.JMenuItem();
        ConsultarFechaVacunacion = new javax.swing.JMenuItem();
        jMenu14 = new javax.swing.JMenu();
        InsertarHistorialMedico = new javax.swing.JMenuItem();
        ConsultarHistorialMedico = new javax.swing.JMenuItem();

        jMenu2.setText("File");
        jMenuBar2.add(jMenu2);

        jMenu3.setText("Edit");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("File");
        jMenuBar3.add(jMenu4);

        jMenu5.setText("Edit");
        jMenuBar3.add(jMenu5);

        jMenuItem2.setText("jMenuItem2");

        jMenu8.setText("File");
        jMenuBar4.add(jMenu8);

        jMenu9.setText("Edit");
        jMenuBar4.add(jMenu9);

        jMenuItem1.setText("jMenuItem1");

        jMenuItem4.setText("jMenuItem4");

        jMenu6.setText("File");
        jMenuBar5.add(jMenu6);

        jMenu7.setText("Edit");
        jMenuBar5.add(jMenu7);

        jMenuItem11.setText("jMenuItem11");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1170, Short.MAX_VALUE)
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Cliente.png"))); // NOI18N
        jMenu1.setText("CLIENTE                                  ");

        insertarCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        insertarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/user-group-new.png"))); // NOI18N
        insertarCliente.setText("INSERTAR CLIENTE");
        insertarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertarClienteActionPerformed(evt);
            }
        });
        jMenu1.add(insertarCliente);

        EliminarCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        EliminarCliente.setText("ELIMINAR CLIENTE");
        EliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarClienteActionPerformed(evt);
            }
        });
        jMenu1.add(EliminarCliente);

        ConsultarCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        ConsultarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/help.png"))); // NOI18N
        ConsultarCliente.setText("CONSULTAR CLIENTE");
        ConsultarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarClienteActionPerformed(evt);
            }
        });
        jMenu1.add(ConsultarCliente);

        jMenuBar1.add(jMenu1);

        jMenu10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/PERSONA.png"))); // NOI18N
        jMenu10.setText("PERSONA                                    ");

        InsertarPersona.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        InsertarPersona.setText("INSERTAR PERSONA");
        InsertarPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertarPersonaActionPerformed(evt);
            }
        });
        jMenu10.add(InsertarPersona);

        EliminarPersona.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        EliminarPersona.setText("ELIMINAR PERSONA");
        EliminarPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarPersonaActionPerformed(evt);
            }
        });
        jMenu10.add(EliminarPersona);

        ConsultarPersona.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        ConsultarPersona.setText("CONSULTAR PERSONA");
        ConsultarPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarPersonaActionPerformed(evt);
            }
        });
        jMenu10.add(ConsultarPersona);

        jMenuBar1.add(jMenu10);

        jMenu11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ANIMALES.png"))); // NOI18N
        jMenu11.setText("ANIMALES                           ");

        InsertarAnimal.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        InsertarAnimal.setText("INSERTAR ANIMAL");
        InsertarAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertarAnimalActionPerformed(evt);
            }
        });
        jMenu11.add(InsertarAnimal);

        EliminarAnimal.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        EliminarAnimal.setText("ELIMINAR ANIMAL");
        EliminarAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarAnimalActionPerformed(evt);
            }
        });
        jMenu11.add(EliminarAnimal);

        ConsultarAnimal.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        ConsultarAnimal.setText("CONSULTAR ANIMAL");
        ConsultarAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarAnimalActionPerformed(evt);
            }
        });
        jMenu11.add(ConsultarAnimal);

        jMenuBar1.add(jMenu11);

        jMenu12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/CITAS.png"))); // NOI18N
        jMenu12.setText("CITAS                            ");

        InsertarCitas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_J, java.awt.event.InputEvent.CTRL_MASK));
        InsertarCitas.setText("INSERTAR CITAS");
        InsertarCitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertarCitasActionPerformed(evt);
            }
        });
        jMenu12.add(InsertarCitas);

        ActualizarCitas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_K, java.awt.event.InputEvent.CTRL_MASK));
        ActualizarCitas.setText("ACTUALIZAR CITAS");
        jMenu12.add(ActualizarCitas);

        ConsultarCitas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        ConsultarCitas.setText("CONSULTAR CITAS");
        jMenu12.add(ConsultarCitas);

        jMenuBar1.add(jMenu12);

        jMenu13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/FECHAVACUNACION.png"))); // NOI18N
        jMenu13.setText(" FECHA  DE VACUNACION             ");

        InsertarFechaVacunacion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        InsertarFechaVacunacion.setText("INSERTAR FECHA DE VACUNA");
        InsertarFechaVacunacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertarFechaVacunacionActionPerformed(evt);
            }
        });
        jMenu13.add(InsertarFechaVacunacion);

        ConsultarFechaVacunacion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        ConsultarFechaVacunacion.setText("CONSULTAR FECHAS DE VACUNAS");
        ConsultarFechaVacunacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarFechaVacunacionActionPerformed(evt);
            }
        });
        jMenu13.add(ConsultarFechaVacunacion);

        jMenuBar1.add(jMenu13);

        jMenu14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/HISTORIALMEDICO.png"))); // NOI18N
        jMenu14.setText("  HISTORIAL MÉDICO                  ");
        jMenu14.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);

        InsertarHistorialMedico.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        InsertarHistorialMedico.setText("INSERTAR HISTORIAL MÉDICO");
        jMenu14.add(InsertarHistorialMedico);

        ConsultarHistorialMedico.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        ConsultarHistorialMedico.setText("CONSULTAR HISTORIAL MÉDICO");
        jMenu14.add(ConsultarHistorialMedico);

        jMenuBar1.add(jMenu14);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void insertarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertarClienteActionPerformed

        F1InsertarCliente CC = new F1InsertarCliente(); //jframe seleccionado
        CC.setVisible(true);// para comprovar el acceso al jframe seleccionado y entrar
        Escritorio.add(CC);
//         dispose();    //para que el jFrame actual se cierre automáticamente y se abre la siguiente

    }//GEN-LAST:event_insertarClienteActionPerformed

    private void ConsultarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarClienteActionPerformed
     F3consultarCliente Cc = new F3consultarCliente();
     Cc.setVisible(true);
     Escritorio.add(Cc);
     
     
//            dispose();
//     setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_ConsultarClienteActionPerformed

    private void InsertarAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertarAnimalActionPerformed
          F7InsertarMascota Cy = new  F7InsertarMascota();
     Cy.setVisible(true);
     Escritorio.add(Cy);

    }//GEN-LAST:event_InsertarAnimalActionPerformed

    private void ConsultarFechaVacunacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarFechaVacunacionActionPerformed

        
    }//GEN-LAST:event_ConsultarFechaVacunacionActionPerformed

    private void ConsultarAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarAnimalActionPerformed
 
        F9consultarMascota Fcm= new F9consultarMascota();
        Fcm.setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        // TODO add your handling code here:
    }//GEN-LAST:event_ConsultarAnimalActionPerformed

    private void EliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarClienteActionPerformed
  F2EliminarCliente F2 = new F2EliminarCliente(); //jframe seleccionado
        F2.setVisible(true);// para comprovar el acceso al jframe seleccionado y entrar
        Escritorio.add(F2);
        
    }//GEN-LAST:event_EliminarClienteActionPerformed

    private void InsertarPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertarPersonaActionPerformed
    F8Persona f8 = new F8Persona();
    f8.setVisible(true);
    
  
        
        
    }//GEN-LAST:event_InsertarPersonaActionPerformed

    private void EliminarPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarPersonaActionPerformed
    F5Eliminarpersona f5 = new F5Eliminarpersona();
    f5.setVisible(true);  
    }//GEN-LAST:event_EliminarPersonaActionPerformed

    private void ConsultarPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarPersonaActionPerformed
   
    }//GEN-LAST:event_ConsultarPersonaActionPerformed

    private void EliminarAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarAnimalActionPerformed
   F8EliminarMascota y = new F8EliminarMascota();
     y.setVisible(true);   
     Escritorio.add(y);     
    }//GEN-LAST:event_EliminarAnimalActionPerformed

    private void InsertarCitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertarCitasActionPerformed
   
    }//GEN-LAST:event_InsertarCitasActionPerformed

    private void InsertarFechaVacunacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertarFechaVacunacionActionPerformed
  //   F12FechaVacunacion F12 = new F12FechaVacunacion();
   //  F12.setVisible(true);
     
     
    }//GEN-LAST:event_InsertarFechaVacunacionActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
   

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new F2SistemaVeterinaria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ActualizarCitas;
    private javax.swing.JMenuItem ConsultarAnimal;
    private javax.swing.JMenuItem ConsultarCitas;
    private javax.swing.JMenuItem ConsultarCliente;
    private javax.swing.JMenuItem ConsultarFechaVacunacion;
    private javax.swing.JMenuItem ConsultarHistorialMedico;
    private javax.swing.JMenuItem ConsultarPersona;
    private javax.swing.JMenuItem EliminarAnimal;
    private javax.swing.JMenuItem EliminarCliente;
    private javax.swing.JMenuItem EliminarPersona;
    public static javax.swing.JDesktopPane Escritorio;
    private javax.swing.JMenuItem InsertarAnimal;
    private javax.swing.JMenuItem InsertarCitas;
    private javax.swing.JMenuItem InsertarFechaVacunacion;
    private javax.swing.JMenuItem InsertarHistorialMedico;
    private javax.swing.JMenuItem InsertarPersona;
    private javax.swing.JMenuItem insertarCliente;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu14;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuBar jMenuBar4;
    private javax.swing.JMenuBar jMenuBar5;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    // End of variables declaration//GEN-END:variables
}
