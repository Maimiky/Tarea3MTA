/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inicio;


import Inicio.F3Cliente;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

/**
 *
 * @author Lenovo
 */
public class F2SistemaVeterinaria extends javax.swing.JFrame {

    /**
     * Creates new form SistemaVeterinaria
     */
    public F2SistemaVeterinaria() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Ejemplo");
         setIconImage(new ImageIcon(getClass().getResource("/iconos/HISTORIALMEDICO.png")).getImage());
        ((JPanel)getContentPane()).setOpaque(false);
        ImageIcon uno=new ImageIcon(this.getClass().getResource("/iconos/FONDO.jpg"));
        JLabel fondo= new JLabel();
        fondo.setIcon(uno);
        getLayeredPane().add(fondo,JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0,0,uno.getIconWidth(),uno.getIconHeight());
        
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
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
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        insertar = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu10 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu11 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenu12 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenu13 = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenu14 = new javax.swing.JMenu();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();

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

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Cliente.png"))); // NOI18N
        jMenu1.setText("CLIENTE");

        insertar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        insertar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/user-group-new.png"))); // NOI18N
        insertar.setText("INSERTAR CLIENTE");
        insertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertarActionPerformed(evt);
            }
        });
        jMenu1.add(insertar);

        jMenuItem16.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem16.setText("ELIMINAR CLIENTE");
        jMenu1.add(jMenuItem16);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/help.png"))); // NOI18N
        jMenuItem3.setText("CONSULTAR CLIENTE");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/PERSONA.png"))); // NOI18N
        jMenu10.setText("PERSONA");

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setText("INSERTAR PERSONA");
        jMenu10.add(jMenuItem5);

        jMenuItem17.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem17.setText("ELIMINAR PERSONA");
        jMenu10.add(jMenuItem17);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem6.setText("CONSULTAR PERSONA");
        jMenu10.add(jMenuItem6);

        jMenuBar1.add(jMenu10);

        jMenu11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ANIMALES.png"))); // NOI18N
        jMenu11.setText("ANIMALES");

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem7.setText("INSERTAR ANIMAL");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuItem7);

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem8.setText("ELIMINAR ANIMAL");
        jMenu11.add(jMenuItem8);

        jMenuItem18.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem18.setText("CONSULTAR ANIMAL");
        jMenu11.add(jMenuItem18);

        jMenuBar1.add(jMenu11);

        jMenu12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/CITAS.png"))); // NOI18N
        jMenu12.setText("CITAS");

        jMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_J, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem9.setText("INSERTAR CITAS");
        jMenu12.add(jMenuItem9);

        jMenuItem10.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_K, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem10.setText("ACTUALIZAR CITAS");
        jMenu12.add(jMenuItem10);

        jMenuItem19.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem19.setText("CONSULTAR CITAS");
        jMenu12.add(jMenuItem19);

        jMenuBar1.add(jMenu12);

        jMenu13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/FECHAVACUNACION.png"))); // NOI18N
        jMenu13.setText("FECHA/VACUNACION");

        jMenuItem12.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem12.setText("INSERTAR FECHA DE VACUNA");
        jMenu13.add(jMenuItem12);

        jMenuItem13.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem13.setText("CONSULTAR FECHAS DE VACUNAS");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu13.add(jMenuItem13);

        jMenuBar1.add(jMenu13);

        jMenu14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/HISTORIALMEDICO.png"))); // NOI18N
        jMenu14.setText("HISTORIAL MÉDICO");

        jMenuItem14.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem14.setText("INSERTAR HISTORIAL MÉDICO");
        jMenu14.add(jMenuItem14);

        jMenuItem15.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem15.setText("CONSULTAR HISTORIAL MÉDICO");
        jMenu14.add(jMenuItem15);

        jMenuBar1.add(jMenu14);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 686, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 367, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void insertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertarActionPerformed

        F3Cliente CC = new F3Cliente(); //jframe seleccionado
        CC.setVisible(true);// para comprovar el acceso al jframe seleccionado y entrar
        dispose();    //para que el jFrame actual se cierre automáticamente y se abre la siguiente
      
    }//GEN-LAST:event_insertarActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
     F4ConsultarCliente Cc = new F4ConsultarCliente();
     Cc.setVisible(true);
            dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        F6Mascota Cy = new F6Mascota();
     Cy.setVisible(true);
            dispose();
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem13ActionPerformed

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
    private javax.swing.JMenuItem insertar;
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
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    // End of variables declaration//GEN-END:variables
}
