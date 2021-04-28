/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import com.sun.glass.events.KeyEvent;
import entidades.Cliente;
import entidades.DirectorioTelefonico;
import java.awt.List;
import javax.swing.JOptionPane;

/**
 *
 * @author leand
 */
public class ViewBorrar extends javax.swing.JInternalFrame {

    private DirectorioTelefonico directorio = new DirectorioTelefonico();
    
    /**
     * Creates new form ViewBorrar
     */
    public ViewBorrar(DirectorioTelefonico directorio) {
        initComponents();
        this.directorio=directorio;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jlTitulo = new javax.swing.JLabel();
        jlDNI = new javax.swing.JLabel();
        jtDni = new javax.swing.JTextField();
        jbBorrar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jtTelefono = new javax.swing.JTextField();
        jtApellido = new javax.swing.JTextField();
        jtDireccion = new javax.swing.JTextField();
        jtNombre = new javax.swing.JTextField();
        jtCiudad = new javax.swing.JTextField();
        jlTelefono = new javax.swing.JLabel();
        jlApellido = new javax.swing.JLabel();
        jlNombre = new javax.swing.JLabel();
        jlDireccion = new javax.swing.JLabel();
        jlCiudad = new javax.swing.JLabel();
        jbSalir = new javax.swing.JButton();
        jlClienteBorrado = new javax.swing.JLabel();
        jbConfirmar = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setClosable(true);
        setTitle("Borrar Cliente");

        jlTitulo.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jlTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlTitulo.setText("Borrar Cliente");
        jlTitulo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jlDNI.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jlDNI.setText("DNI:");

        jtDni.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jtDni.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        jtDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtDniActionPerformed(evt);
            }
        });
        jtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtDniKeyPressed(evt);
            }
        });

        jbBorrar.setBackground(new java.awt.Color(0, 127, 255));
        jbBorrar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jbBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/outline_delete_black_24dp.png"))); // NOI18N
        jbBorrar.setText("Borrar");
        jbBorrar.setBorder(null);
        jbBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBorrarActionPerformed(evt);
            }
        });
        jbBorrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbBorrarKeyPressed(evt);
            }
        });

        jtTelefono.setEditable(false);
        jtTelefono.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jtTelefono.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        jtTelefono.setFocusable(false);
        jtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtTelefonoActionPerformed(evt);
            }
        });

        jtApellido.setEditable(false);
        jtApellido.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jtApellido.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        jtApellido.setFocusable(false);
        jtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtApellidoActionPerformed(evt);
            }
        });

        jtDireccion.setEditable(false);
        jtDireccion.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jtDireccion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        jtDireccion.setFocusable(false);
        jtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtDireccionActionPerformed(evt);
            }
        });

        jtNombre.setEditable(false);
        jtNombre.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jtNombre.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        jtNombre.setFocusable(false);
        jtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNombreActionPerformed(evt);
            }
        });

        jtCiudad.setEditable(false);
        jtCiudad.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jtCiudad.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        jtCiudad.setFocusable(false);
        jtCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtCiudadActionPerformed(evt);
            }
        });

        jlTelefono.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jlTelefono.setText("Telefono:");

        jlApellido.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jlApellido.setText("Apellido:");

        jlNombre.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jlNombre.setText("Nombre:");

        jlDireccion.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jlDireccion.setText("Dirección:");

        jlCiudad.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jlCiudad.setText("Ciudad:");

        jbSalir.setBackground(new java.awt.Color(255, 0, 0));
        jbSalir.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jbSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/outline_exit_to_app_black_24dp.png"))); // NOI18N
        jbSalir.setText("Salir");
        jbSalir.setBorder(null);
        jbSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });
        jbSalir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbSalirKeyPressed(evt);
            }
        });

        jlClienteBorrado.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jlClienteBorrado.setText(" ");

        jbConfirmar.setBackground(new java.awt.Color(0, 127, 255));
        jbConfirmar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jbConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/outline_delete_forever_black_24dp.png"))); // NOI18N
        jbConfirmar.setText("Confirmar eliminación");
        jbConfirmar.setBorder(null);
        jbConfirmar.setEnabled(false);
        jbConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConfirmarActionPerformed(evt);
            }
        });
        jbConfirmar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbConfirmarKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlDNI)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jlApellido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jlNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jlDireccion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(jtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jlCiudad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtCiudad, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbBorrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbConfirmar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jlTelefono)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jlClienteBorrado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE))))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jtApellido, jtCiudad, jtDireccion, jtNombre, jtTelefono});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jlTitulo)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlDNI)
                    .addComponent(jtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jbBorrar)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlClienteBorrado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlTelefono))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlApellido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlDireccion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCiudad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbConfirmar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jbSalir)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jtApellido, jtCiudad, jtDireccion, jtNombre, jtTelefono});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtDniActionPerformed

    private void jtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtTelefonoActionPerformed

    private void jtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtApellidoActionPerformed

    private void jtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtDireccionActionPerformed

    private void jtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNombreActionPerformed

    private void jtCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtCiudadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtCiudadActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBorrarActionPerformed
        try{
            long dni = Long.parseLong(jtDni.getText());
            
            if(directorio.buscarParaBorrar(dni)!=null){
                Long telefono = directorio.buscarParaBorrar(dni);
                
                Cliente cliente = directorio.buscarCliente(telefono);
                
                jtTelefono.setText(String.valueOf(telefono));
                jtDni.setText(String.valueOf(cliente.getDNI()));
                jtNombre.setText(cliente.getNombre());
                jtApellido.setText(cliente.getApellido());
                jtDireccion.setText(cliente.getDireccion());
                jtCiudad.setText(cliente.getCiudad());
                
                jlClienteBorrado.setText("Borrar al siguiente cliente?");
                
                jbConfirmar.setEnabled(true);
            } else {
                JOptionPane.showMessageDialog(this,"Cliente no encontrado");
            }
        } catch(NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this,"Ingrese un numero de DNI");
        } catch(NullPointerException npe){
            JOptionPane.showMessageDialog(this,"Cliente no encontrado");
        }
    }//GEN-LAST:event_jbBorrarActionPerformed

    private void jbConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConfirmarActionPerformed
        try{
            long dni =  Long.parseLong(jtDni.getText());
            
            directorio.borrarCliente(dni);
            
            JOptionPane.showMessageDialog(this,"Cliente eliminado");
        } catch(NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this,"Ingrese un numero de DNI");
        } catch(NullPointerException npe){
            JOptionPane.showMessageDialog(this,"Cliente no encontrado");
        }
        jtApellido.setText("");
        jtCiudad.setText("");
        jtDireccion.setText("");
        jtDni.setText("");
        jtNombre.setText("");
        jtTelefono.setText("");
        
        jtDni.requestFocus();
    }//GEN-LAST:event_jbConfirmarActionPerformed

    private void jtDniKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtDniKeyPressed
        if(evt.getExtendedKeyCode() == KeyEvent.VK_ENTER){
            jbBorrar.requestFocus();
            jbBorrar.doClick();
        }
    }//GEN-LAST:event_jtDniKeyPressed

    private void jbBorrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbBorrarKeyPressed
        if(evt.getExtendedKeyCode() == KeyEvent.VK_ENTER){
            jbBorrar.doClick();
        }
    }//GEN-LAST:event_jbBorrarKeyPressed

    private void jbConfirmarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbConfirmarKeyPressed
        if(evt.getExtendedKeyCode() == KeyEvent.VK_ENTER){
            jbConfirmar.doClick();
        }
    }//GEN-LAST:event_jbConfirmarKeyPressed

    private void jbSalirKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbSalirKeyPressed
        if(evt.getExtendedKeyCode() == KeyEvent.VK_ENTER){
            jbSalir.doClick();
        }
    }//GEN-LAST:event_jbSalirKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbBorrar;
    private javax.swing.JButton jbConfirmar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JLabel jlApellido;
    private javax.swing.JLabel jlCiudad;
    private javax.swing.JLabel jlClienteBorrado;
    private javax.swing.JLabel jlDNI;
    private javax.swing.JLabel jlDireccion;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JLabel jlTelefono;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JTextField jtApellido;
    private javax.swing.JTextField jtCiudad;
    private javax.swing.JTextField jtDireccion;
    private javax.swing.JTextField jtDni;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTextField jtTelefono;
    // End of variables declaration//GEN-END:variables
}