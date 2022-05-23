package co.edu.javeriana.bd.hotel.view;

import co.edu.javeriana.bd.hotel.model.dto.PaisDTO;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PanelPaises extends javax.swing.JPanel {
    
    /**
     * Creates new form PanelPaises
     */
    
    private final Principal principal;
    
        public PanelPaises(Principal principal) {
        initComponents();
        this.principal = principal;
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
        titulo = new javax.swing.JLabel();
        botSalir = new javax.swing.JButton();
        botGest = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPaises = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        botInsertar = new javax.swing.JButton();
        botMod = new javax.swing.JButton();
        botElim = new javax.swing.JButton();
        botBuscar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cajaNombre = new javax.swing.JTextField();
        cajaIVA = new javax.swing.JTextField();
        cajaIC = new javax.swing.JTextField();
        cajaINT = new javax.swing.JTextField();

        jLabel1.setText("Hotel?");

        titulo.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        titulo.setForeground(new java.awt.Color(0, 153, 153));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        titulo.setText("ReVago");

        botSalir.setBackground(new java.awt.Color(204, 255, 255));
        botSalir.setText("Cerrar Sesion");
        botSalir.setToolTipText("");
        botSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botSalirActionPerformed(evt);
            }
        });

        botGest.setBackground(new java.awt.Color(204, 255, 255));
        botGest.setText("Gestionar cuenta");
        botGest.setToolTipText("");
        botGest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botGestActionPerformed(evt);
            }
        });

        tablaPaises.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "IVA", "IC", "INT"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaPaises);

        jLabel2.setText("*IC (Impuesto al consumo)");

        jLabel3.setText("*INT (Impuesto Nacional de Turismo)");

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel4.setText("Listado de paises");

        botInsertar.setBackground(new java.awt.Color(255, 255, 204));
        botInsertar.setText("Insertar");
        botInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botInsertarActionPerformed(evt);
            }
        });

        botMod.setBackground(new java.awt.Color(255, 255, 204));
        botMod.setText("Modificar");
        botMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botModActionPerformed(evt);
            }
        });

        botElim.setBackground(new java.awt.Color(255, 255, 204));
        botElim.setText("Eliminar");
        botElim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botElimActionPerformed(evt);
            }
        });

        botBuscar.setBackground(new java.awt.Color(255, 255, 204));
        botBuscar.setText("Buscar");
        botBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botBuscarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Nombre");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("IVA");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("IC");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("INT");

        cajaNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaNombreActionPerformed(evt);
            }
        });

        cajaIVA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaIVAActionPerformed(evt);
            }
        });

        cajaIC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaICActionPerformed(evt);
            }
        });

        cajaINT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaINTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(42, 42, 42))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(jLabel1)))
                .addGap(41, 53, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(titulo)
                        .addGap(188, 188, 188))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botGest)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botSalir))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6)
                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cajaNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botElim)
                            .addComponent(botBuscar))
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cajaIC, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cajaIVA)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(botMod))
                            .addComponent(cajaINT))
                        .addGap(18, 18, 18)
                        .addComponent(botInsertar)
                        .addGap(15, 15, 15))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botSalir)
                            .addComponent(botGest))
                        .addGap(8, 8, 8)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(titulo)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(botBuscar)
                                    .addComponent(cajaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(4, 4, 4)
                                .addComponent(botElim)))
                        .addGap(29, 29, 29))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cajaIVA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cajaIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botMod)
                            .addComponent(botInsertar)))
                    .addComponent(cajaINT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botSalirActionPerformed
        this.principal.irPaisesSesion();
    }//GEN-LAST:event_botSalirActionPerformed

    private void botGestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botGestActionPerformed
        this.principal.irPaisesGestionar();
    }//GEN-LAST:event_botGestActionPerformed

    private void botInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botInsertarActionPerformed
        PaisDTO p;
        if(!espacioBlanco())
        {
            p = new PaisDTO(cajaNombre.getText(), Float.parseFloat(cajaIVA.getText()), Float.parseFloat(cajaIC.getText()), Float.parseFloat(cajaINT.getText()));
            if(this.principal.crearPais(p)) JOptionPane.showMessageDialog(null, "Pais creado!");
            else JOptionPane.showMessageDialog(null, "No se pudo crear el pais. Verifique que no existe");
        }
        else JOptionPane.showMessageDialog(null, "Ningun campo puede estar vacio");
        refrescar();
    }//GEN-LAST:event_botInsertarActionPerformed

    private void botBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botBuscarActionPerformed
        PaisDTO p;
        
        if(cajaNombre.getText().equals("")) JOptionPane.showMessageDialog(null, "El campo nombre no puede estar vacio");
        else
        {
            p = this.principal.findPais(cajaNombre.getText());

            DefaultTableModel model = (DefaultTableModel) tablaPaises.getModel();

            int filas = tablaPaises.getRowCount();
            for (int i = 0;filas>i; i++) model.removeRow(0);

            if(p != null) model.addRow(new Object[]{p.getNombre(), p.getIva(), p.getIc(), p.getInTur()});
            else JOptionPane.showMessageDialog(null, "No se encontro el pais buscado");
        }
    }//GEN-LAST:event_botBuscarActionPerformed

    private void botModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botModActionPerformed
        PaisDTO p;
        
        if(!espacioBlanco()) 
        {
            p = new PaisDTO(cajaNombre.getText(), Float.parseFloat(cajaIVA.getText()), Float.parseFloat(cajaIC.getText()), Float.parseFloat(cajaINT.getText()));
            if(this.principal.modPais(p)) JOptionPane.showMessageDialog(null, "Pais modificado!");
            else JOptionPane.showMessageDialog(null, "No se pudo modificar el pais. Verifique que existe");
            refrescar();
        }
        else JOptionPane.showMessageDialog(null, "Ningun campo puede estar vacio");
    }//GEN-LAST:event_botModActionPerformed

    private void botElimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botElimActionPerformed
        if(cajaNombre.getText().equals("")) JOptionPane.showMessageDialog(null, "El campo nombre no puede estar vacio");
        else
        {
            if(this.principal.elimPais(cajaNombre.getText())) JOptionPane.showMessageDialog(null, "Pais eliminado!");
            else JOptionPane.showMessageDialog(null, "No se pudo eliminar el pais. Verifique que existe");
            refrescar();
        }
    }//GEN-LAST:event_botElimActionPerformed

    private void cajaNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaNombreActionPerformed

    private void cajaIVAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaIVAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaIVAActionPerformed

    private void cajaICActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaICActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaICActionPerformed

    private void cajaINTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaINTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaINTActionPerformed

    protected void refrescar()
    {
        List<PaisDTO> paises = this.principal.findAllPaises();

        DefaultTableModel model = (DefaultTableModel) tablaPaises.getModel();

        int filas = tablaPaises.getRowCount();
        for (int i = 0;filas>i; i++) model.removeRow(0);

        if(paises != null) for(PaisDTO p : paises) model.addRow(new Object[]{p.getNombre(), p.getIva(), p.getIc(), p.getInTur()});
    }
    
    private Boolean espacioBlanco()
    {
        return (cajaNombre.getText().equals("") || cajaIVA.getText().equals("") || cajaINT.getText().equals("") || cajaIC.getText().equals(""));
    }   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botBuscar;
    private javax.swing.JButton botElim;
    private javax.swing.JButton botGest;
    private javax.swing.JButton botInsertar;
    private javax.swing.JButton botMod;
    private javax.swing.JButton botSalir;
    private javax.swing.JTextField cajaIC;
    private javax.swing.JTextField cajaINT;
    private javax.swing.JTextField cajaIVA;
    private javax.swing.JTextField cajaNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tablaPaises;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
