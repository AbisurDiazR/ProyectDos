package ProyectoDos;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

// * @author Jaziel
public class Ventana extends javax.swing.JFrame {

    String[] col = {"Numero de control", "Nombre", "Promedio"};
    DefaultTableModel modelo = new DefaultTableModel(col, 0);
    ArrayList<Alumnos> alumnos = new ArrayList<Alumnos>();

    public Ventana() {
        initComponents();
        this.setLocationRelativeTo(null);
        jTable1.setModel(modelo);
        Ventana.setLocationRelativeTo(null);
        Ventana.setDefaultCloseOperation(1);
        Ventana.setSize(390, 200);

        /*Validacion de los campos de texto*/
        validarCampos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Ventana = new javax.swing.JDialog();
        numeroCtrl = new javax.swing.JTextField();
        nombreTxf = new javax.swing.JTextField();
        promedioTxf = new javax.swing.JTextField();
        Guardar1 = new javax.swing.JButton();
        Salir1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Agregar = new javax.swing.JToggleButton();
        Modificar = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        Guardar = new javax.swing.JButton();
        Salir = new javax.swing.JButton();

        Ventana.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        numeroCtrl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroCtrlActionPerformed(evt);
            }
        });
        Ventana.getContentPane().add(numeroCtrl, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 30, 159, -1));

        nombreTxf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreTxfActionPerformed(evt);
            }
        });
        Ventana.getContentPane().add(nombreTxf, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 56, 159, -1));
        Ventana.getContentPane().add(promedioTxf, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 82, 159, -1));

        Guardar1.setText("Guardar");
        Guardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Guardar1ActionPerformed(evt);
            }
        });
        Ventana.getContentPane().add(Guardar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, -1));

        Salir1.setText("Salir");
        Salir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Salir1ActionPerformed(evt);
            }
        });
        Ventana.getContentPane().add(Salir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, -1, -1));

        jLabel1.setText("Numero de Contro");
        Ventana.getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 30, -1, -1));

        jLabel2.setText("Nombre");
        Ventana.getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 59, -1, -1));

        jLabel3.setText("Promedio");
        Ventana.getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 90, -1, 16));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero de Control", "Nombre", "promedio"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 6, -1, 350));

        Agregar.setText("Agregar");
        Agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AgregarMouseClicked(evt);
            }
        });
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });
        getContentPane().add(Agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 362, -1, -1));

        Modificar.setText("Modificar");
        Modificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ModificarMouseClicked(evt);
            }
        });
        getContentPane().add(Modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 362, -1, -1));

        Eliminar.setText("Eliminar");
        Eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EliminarMouseClicked(evt);
            }
        });
        getContentPane().add(Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(221, 362, -1, -1));

        Guardar.setText("Guardar");
        Guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GuardarMouseClicked(evt);
            }
        });
        getContentPane().add(Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 362, -1, -1));

        Salir.setText("Salir");
        Salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SalirMouseClicked(evt);
            }
        });
        getContentPane().add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 362, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
        // TODO add your handling code here:
        Ventana.setVisible(true);
    }//GEN-LAST:event_AgregarActionPerformed

    private void AgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_AgregarMouseClicked

    private void ModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModificarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ModificarMouseClicked

    private void EliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_EliminarMouseClicked

    private void GuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GuardarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_GuardarMouseClicked

    private void SalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_SalirMouseClicked

    private void numeroCtrlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroCtrlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numeroCtrlActionPerformed

    private void nombreTxfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreTxfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreTxfActionPerformed

    private void Guardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Guardar1ActionPerformed
        // TODO add your handling code here:        
        int numControl = Integer.parseInt(numeroCtrl.getText());
        String nombreAlumno = nombreTxf.getText();
        double promedioAlumno = Double.parseDouble(promedioTxf.getText());
        alumnos.add(new Alumnos(nombreAlumno, numControl, promedioAlumno));
        Object[] data = {numControl, nombreAlumno, promedioAlumno};
        modelo.addRow(data);
        nombreTxf.setText("");
        numeroCtrl.setText("");
        promedioTxf.setText("");
        Ventana.dispose();
    }//GEN-LAST:event_Guardar1ActionPerformed

    private void Salir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Salir1ActionPerformed
        // TODO add your handling code here:
        Ventana.dispose();
    }//GEN-LAST:event_Salir1ActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    public void guardarTabla() {
        //String titulos[] = {"Numero de control", "Nombre", "Promedio"};                
        for (int i = 0; i < alumnos.size(); i++) {
            int numControl = alumnos.get(i).getNumControl();
            String nombreAlumno = alumnos.get(i).getNombre();
            double promedioAlumno = alumnos.get(i).getPromedio();
            System.out.println("Num Ctrl: "+alumnos.get(i).getNumControl()+" Nombre: "+alumnos.get(i).getNombre()+" Promedio: "+alumnos.get(i).getPromedio());
        }
        System.out.println(modelo.getRowCount());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Agregar;
    private javax.swing.JButton Eliminar;
    private javax.swing.JButton Guardar;
    private javax.swing.JButton Guardar1;
    private javax.swing.JButton Modificar;
    private javax.swing.JButton Salir;
    private javax.swing.JButton Salir1;
    private javax.swing.JDialog Ventana;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nombreTxf;
    private javax.swing.JTextField numeroCtrl;
    private javax.swing.JTextField promedioTxf;
    // End of variables declaration//GEN-END:variables

    private void validarCampos() {
        numeroCtrl.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                super.keyPressed(ke); //To change body of generated methods, choose Tools | Templates.
                char ch = ke.getKeyChar();
                if (Character.isDigit(ch)) {
                } else {
                    System.out.println("Solo se admiten numeros");
                    numeroCtrl.setText("");
                }
            }
        });
        promedioTxf.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                super.keyPressed(ke); //To change body of generated methods, choose Tools | Templates.
                char ch = ke.getKeyChar();
                if (Character.isDigit(ch) || ke.getKeyCode() == KeyEvent.VK_PERIOD) {
                } else {
                    System.out.println("Solo se admiten numeros y/o puntos");
                    promedioTxf.setText("");
                }
            }
        });
        nombreTxf.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                super.keyPressed(ke); //To change body of generated methods, choose Tools | Templates.
                char ch = ke.getKeyChar();
                if (Character.isAlphabetic(ch)) {
                } else {
                    System.out.println("Solo se admiten valores alfabeticos");
                    nombreTxf.setText("");
                }
            }
        });
    }
}
