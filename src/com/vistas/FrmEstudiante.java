
package com.vistas;

import com.pojos.ComboItems;
import com.dao.DaoCarrera;
import com.dao.DaoEstudiante;
import com.pojos.Carrera;
import com.pojos.Estudiante;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

/*nombre de clase: FrmEstudiante
 *fecha: 6-10-19
 *@author: Arbuez
 *copyright:Arbuez
 *version:1.0
 */

public class FrmEstudiante extends javax.swing.JInternalFrame {
    DefaultTableModel modelo;
    public FrmEstudiante() {
        initComponents();             
        actualizar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtCodigoEstudiante = new javax.swing.JTextField();
        txtCumCiclo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtTelefonoMovil = new javax.swing.JFormattedTextField();
        spEdad = new javax.swing.JSpinner();
        radioMasculino = new javax.swing.JRadioButton();
        radioFemenino = new javax.swing.JRadioButton();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jComboBox = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setText("Datos del estudiante");

        jLabel2.setText("codigo estudiante");

        jLabel3.setText("nombre");

        jLabel4.setText("edad");

        jLabel5.setText("genero");

        jLabel6.setText("CUM ciclo");

        jLabel7.setText("direccion");

        jLabel8.setText("telefono movil");

        jLabel9.setText("carrera");

        txtCodigoEstudiante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoEstudianteKeyTyped(evt);
            }
        });

        txtCumCiclo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCumCicloKeyTyped(evt);
            }
        });

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        txtDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDireccionKeyTyped(evt);
            }
        });

        try {
            txtTelefonoMovil.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        spEdad.setModel(new javax.swing.SpinnerNumberModel(18, null, null, 1));

        buttonGroup1.add(radioMasculino);
        radioMasculino.setText("masculino");

        buttonGroup1.add(radioFemenino);
        radioFemenino.setText("femenino");

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

        jComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 589, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(28, 28, 28)
                                .addComponent(txtCodigoEstudiante))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addGap(78, 78, 78)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombre)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(spEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel5))
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDireccion)
                                    .addComponent(txtCumCiclo)
                                    .addComponent(txtTelefonoMovil)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(radioMasculino)
                                        .addGap(18, 18, 18)
                                        .addComponent(radioFemenino)
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(jComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(btnGuardar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEditar)
                                .addGap(18, 18, 18)
                                .addComponent(btnEliminar)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(18, 18, 18)
                .addComponent(btnCancelar)
                .addGap(80, 80, 80))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCodigoEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(spEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(radioMasculino)
                    .addComponent(radioFemenino))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtCumCiclo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtTelefonoMovil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnEditar)
                    .addComponent(btnEliminar)
                    .addComponent(btnCancelar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoEstudianteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoEstudianteKeyTyped
        char s=evt.getKeyChar();
        if(!Character.isDigit(s))
        {
            evt.consume();
        }
    }//GEN-LAST:event_txtCodigoEstudianteKeyTyped

    private void txtCumCicloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCumCicloKeyTyped
        char s=evt.getKeyChar();
        if(!Character.isDigit(s)&&s!='.')
        {
            evt.consume();
        }
    }//GEN-LAST:event_txtCumCicloKeyTyped

    private void txtDireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        char s=evt.getKeyChar();
        if(!Character.isLetter(s)&&s!=KeyEvent.VK_SPACE)
        {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    public void llenar(JComboBox combo, List <Carrera> ca)
    {
        combo.removeAllItems();
        for (Carrera carrera : ca) {
            ComboItems it= new ComboItems(carrera.getCodigoCarrera(),carrera.getNombre());
            combo.addItem(it);
        }
    }
    
    private void limpiar()
    {
        txtCodigoEstudiante.setText("");
        txtNombre.setText("");
        spEdad.setValue(18);
        this.buttonGroup1.clearSelection();
        txtCumCiclo.setText("");
        txtDireccion.setText("");
        txtTelefonoMovil.setText("");
        jComboBox.setSelectedIndex(0);
    }
    
    private Estudiante leer()
    {
        Estudiante e = new Estudiante();
        e.setCodigoEstudiante(Integer.parseInt(txtCodigoEstudiante.getText()));
        e.setNombre(txtNombre.getText());
        e.setEdad(Integer.parseInt(spEdad.getValue().toString()));
        String genero="";
        if(radioFemenino.isSelected())
        {
            genero="Femenino";
        }
        
        else
        {
            genero="Masculino";
        }
        
        e.setGenero(genero);
        e.setCumCiclo(Double.parseDouble(txtCumCiclo.getText()));
        e.setDireccion(txtDireccion.getText());
        e.setTelefonoMovil(txtTelefonoMovil.getText()); 
        
        String nombre=jComboBox.getSelectedItem().toString();
        Carrera care=new Carrera();
        care.setCodigoCarrera(carreraId(nombre));
        e.setCarrera(care);
        return e;
    }
    
    DaoEstudiante daoE=new DaoEstudiante();
    //actualizar tabla de la base
    private void actualizar()
    {
        DaoCarrera daoC=new DaoCarrera();
        List <Estudiante> lista = daoE.mostrarEstudiante();  
        
        String [] en ={"codigo de estudiante","nombre","edad","genero","CUM","direccion","telefono","carrera"};
        modelo = new DefaultTableModel(null,en);
        jTable1.setModel(modelo);   
        
        for(Estudiante e:lista)
        {
            agregarTabla(e);
        } 
        llenar(jComboBox,daoC.mostrarCarrera());
    }
    
    private void agregarTabla(Estudiante e)
    {
        Carrera care = e.getCarrera();
        Object [] dato ={e.getCodigoEstudiante(),e.getNombre(),e.getEdad(),e.getGenero(),e.getCumCiclo(),e.getDireccion(),    
        e.getTelefonoMovil(),carreraN(care.getCodigoCarrera())};
        modelo.addRow(dato);              
    }
    
    private void btnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseClicked
        Estudiante e = leer();    
        daoE.insertarEstudiante(e);       
        actualizar();
        limpiar();
    }//GEN-LAST:event_btnGuardarMouseClicked

    private void btnEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseClicked
        Estudiante e = leer();        
        daoE.editarEstudiante(e);       
        actualizar();
        limpiar();
    }//GEN-LAST:event_btnEditarMouseClicked

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        Estudiante e = leer();       
        daoE.eliminarEstudiante(e);        
        actualizar();
        limpiar();
    }//GEN-LAST:event_btnEliminarMouseClicked

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        limpiar();
    }//GEN-LAST:event_btnCancelarMouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        txtCodigoEstudiante.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
        txtNombre.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());
        spEdad.setValue(Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString()));
        
        String genero =jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString();
        if(genero.equalsIgnoreCase("Masculino"))
        {
            this.radioMasculino.setSelected(true);
        }
        else
        {
            this.radioFemenino.setSelected(true);
        }
        
        txtCumCiclo.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 4).toString());
        txtDireccion.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 5).toString());
        txtTelefonoMovil.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 6).toString());
        String nombre=jTable1.getValueAt(jTable1.getSelectedRow(), 7).toString();
                
        jComboBox.setSelectedIndex(index(nombre));
    }//GEN-LAST:event_jTable1MouseClicked

    public int index(String nombre)
    {
        DaoCarrera daoC=new DaoCarrera();
        List <Carrera> lista= daoC.mostrarCarrera();
        int index=0;
        for(Carrera ca:lista)
        {
            if(ca.getNombre().equalsIgnoreCase(nombre))
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
    public int carreraId(String nombre)
    {
        int id=0;
        DaoCarrera daoC = new DaoCarrera();
        List<Carrera> lista=daoC.mostrarCarrera();
        for(Carrera ca: lista)
        {
            if(ca.getNombre().equalsIgnoreCase(nombre))
            {
                id=ca.getCodigoCarrera();
                return id;
            }
        }
        return id;
    }
    
    public String carreraN(int id) 
    {
        String nombre="";
        DaoCarrera daoC = new DaoCarrera();
        List<Carrera> lista=daoC.mostrarCarrera();
        for(Carrera ca: lista)
        {
            if(ca.getCodigoCarrera()==id)
            {
                nombre=ca.getNombre();
                return nombre;
            }
        }
        return nombre;
    }
    private void jComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<ComboItems> jComboBox;
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
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton radioFemenino;
    private javax.swing.JRadioButton radioMasculino;
    private javax.swing.JSpinner spEdad;
    private javax.swing.JTextField txtCodigoEstudiante;
    private javax.swing.JTextField txtCumCiclo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JFormattedTextField txtTelefonoMovil;
    // End of variables declaration//GEN-END:variables
}
