package co.edu.javeriana.bd.hotel.view;

public class Principal extends javax.swing.JFrame {


    private PanelSesion panelSesion;
    private PanelPaises panelPaises;
    private PanelGestionar panelGestionar;
    
    public Principal() {
        this.setTitle("ReVago");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.iniciar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    
    private void iniciar() {
        this.panelSesion = new PanelSesion(this);
        this.panelSesion.setVisible(true);
        this.add(panelSesion);
        this.pack();
        this.setLocationRelativeTo(null);
    }
    
    protected void salir() {
        System.exit(0);
    }

    void irSesionPaises() {
        this.remove(panelSesion);
       
        this.panelPaises = new PanelPaises(this);
        this.panelPaises.setVisible(true);
        this.add(panelPaises);
        this.setLocationRelativeTo(null);
        this.pack();
    }

    void irPaisesSesion() {
        this.remove(panelPaises);
       
        this.panelSesion = new PanelSesion(this);
        this.panelSesion.setVisible(true);
        this.add(panelSesion);
        this.setLocationRelativeTo(null);
        this.pack();
    }
    
    void irPaisesGestionar() {
        this.remove(panelPaises);
       
        this.panelGestionar = new PanelGestionar(this);
        this.panelGestionar.setVisible(true);
        this.add(panelGestionar);
        this.setLocationRelativeTo(null);
        this.pack();
    }

    void irGestionarSesion() {
        this.remove(panelGestionar);
       
        this.panelSesion = new PanelSesion(this);
        this.panelSesion.setVisible(true);
        this.add(panelSesion);
        this.setLocationRelativeTo(null);
        this.pack();
    }

    void irGestionarPaises() {
        this.remove(panelGestionar);
       
        this.panelPaises = new PanelPaises(this);
        this.panelPaises.setVisible(true);
        this.add(panelPaises);
        this.setLocationRelativeTo(null);
        this.pack();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
