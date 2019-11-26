
package com.vistas;

import com.pojos.ComboItems;
import com.dao.DaoCarrera;
import com.dao.DaoFacultad;
import com.pojos.Carrera;
import com.pojos.Facultad;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*nombre de clase: FrmCarrera
 *fecha: 6-10-19
 *@author: Arbuez
 *copyright:Arbuez
 *version:1.0
 */

public class FrmCarrera extends javax.swing.JInternalFrame {

    ComboItems c=new ComboItems();
    DefaultTableModel modelo;
    public FrmCarrera() {
        initComponents();
        actualizar();
    }
    
    DaoCarrera daoC=new DaoCarrera();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtCantidadUv = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jComboBoxf = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setText("Datos de carrera");

        jLabel2.setText("codigo");

        jLabel3.setText("nombre");

        jLabel4.setText("cantidad UV");

        jLabel5.setText("facultad");

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        txtCantidadUv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadUvKeyTyped(evt);
            }
        });

        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });
        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoKeyTyped(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarMouseClicked(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        btnEditar.setText("Editar");
        btnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditarMouseClicked(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(btnCancelar)
                        .addGap(75, 75, 75))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                                .addComponent(txtCantidadUv))
                            .addComponent(jComboBoxf, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCantidadUv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBoxf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnCancelar)
                    .addComponent(btnEditar)
                    .addComponent(btnEliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        char s=evt.getKeyChar();
        if(!Character.isLetter(s)&&s!=KeyEvent.VK_SPACE)
        {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyTyped
        char s=evt.getKeyChar();
        if(!Character.isDigit(s))
        {
            evt.consume();
        }
    }//GEN-LAST:event_txtCodigoKeyTyped

    private void txtCantidadUvKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadUvKeyTyped
        char s=evt.getKeyChar();
        if(!Character.isDigit(s))
        {
            evt.consume();
        }
    }//GEN-LAST:event_txtCantidadUvKeyTyped

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void actualizar()
    {
        List <Carrera> lista = new ArrayList();
        
        String[] en={"codigo","nombre","UV","facultad"};
        modelo=new DefaultTableModel(null,en);
        jTable1.setModel(modelo);               
        lista = daoC.mostrarCarrera();
        for(Carrera c:lista)
        {
            Facultad fac = c.getFacultad();
            Object [] dato ={c.getCodigoCarrera(),c.getNombre(),c.getCantidadUv(),facultadN(fac.getCodigoFacultad())};
            modelo.addRow(dato);
        } 
        DaoFacultad daoF = new DaoFacultad();
        llenar(this.jComboBoxf,daoF.mostrarFacultad());
    }
    
    public void llenar(JComboBox combo, List<Facultad> lista)
    {
        combo.removeAllItems();
        for (Facultad fa : lista) {
            ComboItems it= new ComboItems(fa.getCodigoFacultad(),fa.getNombre());
            combo.addItem(it);
        }
    }
    
    public int facultadId(String nombre)
    {
        int id=0;
        DaoFacultad daoF = new DaoFacultad();
        List<Facultad> lista=daoF.mostrarFacultad();
        for(Facultad fa:lista)
        {
            if(fa.getNombre().equalsIgnoreCase(nombre))
            {
                id=fa.getCodigoFacultad();
                break;
            }
        }
        return id;
    }
    
    public String facultadN(int id)
    {
        String nombre="";
        DaoFacultad daoF = new DaoFacultad();
        List<Facultad> lista=daoF.mostrarFacultad();
        for(Facultad fa:lista)
        {
            if(fa.getCodigoFacultad()==id)
            {
                nombre=fa.getNombre();
                break;
            }
        }
        return nombre;
    }
    
    private void limpiar()
    {
        txtCodigo.setText("");
        txtNombre.setText("");
        txtCantidadUv.setText("");     
    }
    
    private Carrera leer() 
    {
        Carrera c=new Carrera();
        c.setCodigoCarrera(Integer.parseInt(txtCodigo.getText()));
        c.setNombre(txtNombre.getText());
        c.setCantidadUv(Integer.parseInt(txtCantidadUv.getText()));
        Facultad fac =new Facultad();
        fac.setCodigoFacultad(facultadId(jComboBoxf.getSelectedItem().toString()));
        c.setFacultad(fac);
        return c;
    }
    private void btnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseClicked
        Carrera e = leer();  
        JOptionPane.showMessageDialog(null, e);
        daoC.insertarCarrera(e);
        actualizar();
        limpiar();
    }//GEN-LAST:event_btnGuardarMouseClicked

    private void btnEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseClicked
        Carrera e = leer();
        
        daoC.editarCarrera(e);
        actualizar();
        limpiar();
    }//GEN-LAST:event_btnEditarMouseClicked

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        Carrera e = leer();       
        daoC.eliminarCarrera(e);
        actualizar();
        limpiar();
    }//GEN-LAST:event_btnEliminarMouseClicked

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        limpiar();
    }//GEN-LAST:event_btnCancelarMouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        txtCodigo.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
        txtNombre.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());
        txtCantidadUv.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString());
        String nombre=jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString();
        jComboBoxf.setSelectedIndex(index(nombre));
    }//GEN-LAST:event_jTable1MouseClicked

    public int index(String nombre)
    {
        DaoFacultad daoF=new DaoFacultad();
        List <Facultad> lista= daoF.mostrarFacultad();
        int index=0;
        for(Facultad f:lista)
        {
            if(f.getNombre().equalsIgnoreCase(nombre))
            {
                break;
            }
            
            else
            {
                index++;
            }  
        }
        return index;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<ComboItems> jComboBoxf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtCantidadUv;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
