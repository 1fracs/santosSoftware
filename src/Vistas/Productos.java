/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vistas;

import Producto.GestionarProducto;
import Producto.Producto;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Juanfra
 */
public class Productos extends javax.swing.JFrame {

    /**
     * Creates new form Productos
     */
    private ArrayList<Producto> productos=null;
    private Producto p;
    public Productos() {
        initComponents();
        mostrarProductosTabla();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        modificar = new javax.swing.JFrame();
        descripFt = new javax.swing.JTextField();
        refFt = new javax.swing.JTextField();
        precioFt = new javax.swing.JTextField();
        combFt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        nuevo = new javax.swing.JFrame();
        jLabel5 = new javax.swing.JLabel();
        descPr = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        refPr = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        precPr = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        combPrç = new javax.swing.JTextField();
        bntGuardarNuevo = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProd = new javax.swing.JTable();
        btnVer = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        bntNuevo = new javax.swing.JButton();

        refFt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refFtActionPerformed(evt);
            }
        });

        jLabel1.setText("Descripcion");

        jLabel2.setText("Referencia");

        jLabel3.setText("Precio");

        jLabel4.setText("Combinacion");

        idLabel.setText("jLabel5");

        jLabel6.setText("id");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout modificarLayout = new javax.swing.GroupLayout(modificar.getContentPane());
        modificar.getContentPane().setLayout(modificarLayout);
        modificarLayout.setHorizontalGroup(
            modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, modificarLayout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addGroup(modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(modificarLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idLabel))
                    .addGroup(modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(modificarLayout.createSequentialGroup()
                            .addGap(49, 49, 49)
                            .addComponent(btnGuardar)
                            .addGap(18, 18, 18)
                            .addComponent(jButton2))
                        .addGroup(modificarLayout.createSequentialGroup()
                            .addGroup(modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4))
                            .addGap(18, 18, 18)
                            .addGroup(modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(descripFt)
                                .addComponent(refFt)
                                .addComponent(precioFt)
                                .addComponent(combFt, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(66, 66, 66))
        );
        modificarLayout.setVerticalGroup(
            modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modificarLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idLabel)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(descripFt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(refFt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(precioFt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combFt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(jButton2))
                .addGap(30, 30, 30))
        );

        jLabel5.setText("Descripcion");

        jLabel7.setText("Referencia");

        jLabel8.setText("Precio");

        jLabel9.setText("Combinacion");

        bntGuardarNuevo.setText("Guardar");
        bntGuardarNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntGuardarNuevoActionPerformed(evt);
            }
        });

        jButton3.setText("Cancelar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout nuevoLayout = new javax.swing.GroupLayout(nuevo.getContentPane());
        nuevo.getContentPane().setLayout(nuevoLayout);
        nuevoLayout.setHorizontalGroup(
            nuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nuevoLayout.createSequentialGroup()
                .addGroup(nuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(nuevoLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(nuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addComponent(descPr)
                            .addComponent(refPr)
                            .addComponent(precPr)
                            .addComponent(combPrç, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)))
                    .addGroup(nuevoLayout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(bntGuardarNuevo)
                        .addGap(30, 30, 30)
                        .addComponent(jButton3)))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        nuevoLayout.setVerticalGroup(
            nuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nuevoLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(descPr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(refPr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(precPr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(combPrç, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(nuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bntGuardarNuevo)
                    .addComponent(jButton3))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tablaProd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "idProducto", "Descripcion", "Referencia", "Precio", "Combinacion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaProd.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tablaProd);

        btnVer.setText("Ver");
        btnVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        bntNuevo.setText("Nuevo");
        bntNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntNuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bntNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(209, 209, 209))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(btnVer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bntNuevo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(74, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bntNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntNuevoActionPerformed
        nuevo.setVisible(true);
    }//GEN-LAST:event_bntNuevoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if(tablaProd.getSelectedRow()==-1){
            JOptionPane.showMessageDialog(null, "No hay cliente seleccionado.");
        }else{
            p = productos.get(tablaProd.getSelectedRow());
            this.setFrameModificar();
            this.modificarDatos();
            this.activarDatos();
            btnGuardar.setVisible(true);
            
            
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void setFrameModificar(){
        modificar.setVisible(true);
        modificar.setTitle("Modificar Producto");
        modificar.setSize(500, 300);
    }
    private void modificarDatos(){
        idLabel.setText(Integer.toString(p.getIdProducto()));
        descripFt.setText(p.getNombre());
        refFt.setText(p.getRef());
        precioFt.setText(Double.toString(p.getPrecio()));
        combFt.setText(Integer.toString(p.getCombinacion()));
    }
    
    private void setFrameVer(){
        modificar.setVisible(true);
        modificar.setTitle("Ver Producto");
        modificar.setSize(500, 300);
    }
    private void desactivarDatos(){
        descripFt.disable();
        refFt.disable();
        precioFt.disable();
        combFt.disable();
    }
    
    private void activarDatos(){
        descripFt.enable();
        refFt.enable();
        precioFt.enable();
        combFt.enable();
    }
    
    private void refFtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refFtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_refFtActionPerformed

    private void btnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerActionPerformed
        if(tablaProd.getSelectedRow()==-1){
            JOptionPane.showMessageDialog(null, "No hay productoseleccionado.");
        }else{
            p = productos.get(tablaProd.getSelectedRow());
            this.setFrameModificar();
            this.setFrameVer();
            this.desactivarDatos();
            btnGuardar.setVisible(false);
            
            
        }
    }//GEN-LAST:event_btnVerActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        Producto prodMod = new Producto(Integer.parseInt(idLabel.getText()),descripFt.getText(), refFt.getText(), Double.parseDouble(precioFt.getText()), Integer.parseInt(combFt.getText()));
        GestionarProducto gp = new GestionarProducto();
        gp.modificarProducto(prodMod);
        this.limpiarTabla();
        this.mostrarProductosTabla();
        this.modificar.setVisible(false);
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        modificar.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void bntGuardarNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntGuardarNuevoActionPerformed
        Producto pNuevo = new Producto(descPr.getText(),refPr.getText(),Double.parseDouble(precPr.getText()), Integer.parseInt(combFt.getText()));
        GestionarProducto gp = new GestionarProducto();
        gp.insertarProducto(pNuevo);
        this.limpiarTabla();
        this.mostrarProductosTabla();
        nuevo.setVisible(false);
    }//GEN-LAST:event_bntGuardarNuevoActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        nuevo.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed
    public void limpiarTabla(){
        try {
            DefaultTableModel modelo=(DefaultTableModel) tablaProd.getModel();
            int filas=tablaProd.getRowCount();
            for (int i = 0;filas>i; i++) {
                modelo.removeRow(0);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al limpiar la tabla.");
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Productos().setVisible(true);
                
            }
        });
    }
    
    public void mostrarProductosTabla(){
        GestionarProducto gp = new GestionarProducto();
        productos=gp.selectAllProducto();
        DefaultTableModel modelo = (DefaultTableModel)tablaProd.getModel();
        for(int i=0;i<productos.size();i++){
            modelo.addRow(new Object[]{i+1,productos.get(i).getIdProducto(),productos.get(i).getNombre(),productos.get(i).getRef(),productos.get(i).getPrecio(),productos.get(i).getCombinacion()});
        }
        gp.desconectar();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntGuardarNuevo;
    private javax.swing.JButton bntNuevo;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnVer;
    private javax.swing.JTextField combFt;
    private javax.swing.JTextField combPrç;
    private javax.swing.JTextField descPr;
    private javax.swing.JTextField descripFt;
    private javax.swing.JLabel idLabel;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JFrame modificar;
    private javax.swing.JFrame nuevo;
    private javax.swing.JTextField precPr;
    private javax.swing.JTextField precioFt;
    private javax.swing.JTextField refFt;
    private javax.swing.JTextField refPr;
    private javax.swing.JTable tablaProd;
    // End of variables declaration//GEN-END:variables
}
