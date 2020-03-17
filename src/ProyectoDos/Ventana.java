package ProyectoDos;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JTable;
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
        jTable1.setDefaultEditor(Object.class, null); //volver no editables las celdas
        Ventana.setLocationRelativeTo(null);
        Ventana.setDefaultCloseOperation(1);
        Ventana.setSize(390, 200);      
        
        //Cargando datos desde el archivo
        cargarDesdeArchivo();

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
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });
        getContentPane().add(Modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 362, -1, -1));

        Eliminar.setText("Eliminar");
        Eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EliminarMouseClicked(evt);
            }
        });
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });
        getContentPane().add(Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(221, 362, -1, -1));

        Guardar.setText("Guardar");
        Guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GuardarMouseClicked(evt);
            }
        });
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });
        getContentPane().add(Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 362, -1, -1));

        Salir.setText("Salir");
        Salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SalirMouseClicked(evt);
            }
        });
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
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
        if (numeroCtrl.getText().length() < 8) {
            JOptionPane.showMessageDialog(null, "El numero de control debe ser de 8 caracteres");
        } else {
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
        }
    }//GEN-LAST:event_Guardar1ActionPerformed

    private void Salir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Salir1ActionPerformed
        // TODO add your handling code here:
        String numControl = numeroCtrl.getText();
        String nombre = nombreTxf.getText();
        String promedio = promedioTxf.getText();
        if (numControl.length() == 0 || nombre.length() == 0 || promedio.length() == 0) {
            JOptionPane.showMessageDialog(null, "Por favor llene todos los campos antes de salir");
        } else {
            Ventana.dispose();
        }
    }//GEN-LAST:event_Salir1ActionPerformed

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        // TODO add your handling code here:
        guardarTabla();
    }//GEN-LAST:event_GuardarActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        // TODO add your handling code here:
        modificar(jTable1);
    }//GEN-LAST:event_ModificarActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        // TODO add your handling code here:
        eliminarFila(jTable1);
    }//GEN-LAST:event_EliminarActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SalirActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    public void guardarTabla() {
        try {
            String ruta = "archivo.txt";
            String cadena = "";
            for (int i = 0; i < alumnos.size(); i++) {
                int numControl = alumnos.get(i).getNumControl();
                String nombreAlumno = alumnos.get(i).getNombre();
                double promedioAlumno = alumnos.get(i).getPromedio();
                System.out.println(alumnos.get(i).getNumControl() + " " + alumnos.get(i).getNombre() + " " + alumnos.get(i).getPromedio());
                cadena += alumnos.get(i).getNumControl() + " " + alumnos.get(i).getNombre() + " " + alumnos.get(i).getPromedio() + "\n";
            }
            File file = new File(ruta);

            //Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(cadena);
            bw.close();
        } catch (Exception e) {
            System.err.println("Error code: " + e.getMessage());
        }
    }

    public void cargarDesdeArchivo() {
        try {
            Scanner input = new Scanner(new File("archivo.txt"));
            while (input.hasNextLine()) {
                String line = input.nextLine();
                String elementos[] = line.split("\\s");
                int numCtrl = Integer.parseInt(elementos[0]);
                String nombre = elementos[1];
                double promedio = Double.parseDouble(elementos[2]);
                Object[] data = {numCtrl, nombre, promedio};
                modelo.addRow(data);
                System.out.println(line);
            }
            input.close();
        } catch (Exception e) {
            System.err.println("Error code: " + e.getMessage());
        }
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
                if (Character.isDigit(ch) || ke.getKeyCode() == 8) {
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
                if (Character.isDigit(ch) || ke.getKeyCode() == KeyEvent.VK_PERIOD || ke.getKeyCode() == 8) {
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
                if (Character.isAlphabetic(ch) || ke.getKeyCode() == 8) {
                } else {
                    System.out.println("Solo se admiten valores alfabeticos");
                    nombreTxf.setText("");
                }
            }
        });
    }

    private void modificar(JTable jTable1) {
        modelo = (DefaultTableModel) jTable1.getModel();
        int fila = jTable1.getSelectedRow();
        try {
            nombreTxf.setText(jTable1.getValueAt(fila, 1).toString());
            numeroCtrl.setText(jTable1.getValueAt(fila, 0).toString());
            promedioTxf.setText(jTable1.getValueAt(fila, 2).toString());
            Ventana.setVisible(true);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Error code: " + e.getMessage());
        }
    }

    private void eliminarFila(JTable jTable1) {
        modelo = (DefaultTableModel) jTable1.getModel();
        int fila = jTable1.getSelectedRow();
        try {
            modelo.removeRow(fila);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Error code: " + e.getMessage());
        }
    }
}
