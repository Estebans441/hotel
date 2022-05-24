package co.edu.javeriana.bd.hotel.view;

import co.edu.javeriana.bd.hotel.controller.CuentaBO;
import co.edu.javeriana.bd.hotel.controller.PaisBO;
import co.edu.javeriana.bd.hotel.controller.PersonaBO;
import co.edu.javeriana.bd.hotel.model.dto.CuentaDTO;
import co.edu.javeriana.bd.hotel.model.dto.PaisDTO;
import co.edu.javeriana.bd.hotel.model.dto.PersonaDTO;
import java.util.List;

public class Principal extends javax.swing.JFrame {


    private PanelSesion panelSesion;
    private PanelPaises panelPaises;
    private PanelGestionar panelGestionar;
    
    private CuentaBO cuentaBO;
    private PersonaBO personaBO;
    private PaisBO paisBO;
    
    private CuentaDTO sesionIniciada;
    
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

    public CuentaDTO getSesionIniciada() {
        return sesionIniciada;
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
        this.panelPaises.refrescar();
        this.pack();
    }
    
    void irPaisesGestionar() {
        this.remove(panelPaises);
       
        this.panelGestionar = new PanelGestionar(this);
        this.panelGestionar.setVisible(true);
        this.add(panelGestionar);
        this.setLocationRelativeTo(null);
        this.panelGestionar.actPersonas();
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
        this.panelPaises.refrescar();
        this.pack();
    }

    Boolean iniciarSesion(CuentaDTO cuenta) {
        this.cuentaBO = new CuentaBO();
        if (this.cuentaBO.iniciarSesion(cuenta))
        {
            this.sesionIniciada = cuenta;
            System.out.println("Iniciado con " + this.sesionIniciada.toString());
            return true;
        }
        return false;
    }

    boolean crearCuenta(CuentaDTO cuenta) {
        this.cuentaBO = new CuentaBO();
        if (this.cuentaBO.crearCuenta(cuenta))
        {
            System.out.println("Cuenta creada: " + cuenta.toString());
            return true;
        }
        return false;
    }

    boolean crearPais(PaisDTO p) {
        this.paisBO = new PaisBO();
        return this.paisBO.crear(p);
    }
    
    List<PaisDTO> findAllPaises() {
        this.paisBO = new PaisBO();
        return this.paisBO.findAll();
    }
    
    PaisDTO findPais(String text) {
        this.paisBO = new PaisBO();
        return this.paisBO.findById(text);
    }

    boolean elimPais(String text) {
        this.paisBO = new PaisBO();
        return this.paisBO.eliminar(text);
    }

    boolean modPais(PaisDTO p) {
        this.paisBO = new PaisBO();
        return this.paisBO.editar(p);
    }

    boolean cambiarPass(String actual, String nueva) {
        this.cuentaBO = new CuentaBO();
        if(this.sesionIniciada.getPass().equals(actual))
            return this.cuentaBO.cambiarPass(sesionIniciada, nueva);
        else return false;
    }

    List<PersonaDTO> findAllPersonas() {
        this.personaBO = new PersonaBO();
        return this.personaBO.findByAll();
    }

    boolean asociarPersona(String string) {
        this.cuentaBO = new CuentaBO();
        this.personaBO = new PersonaBO();
        return this.cuentaBO.asociarPersona(string, sesionIniciada);
    }

    boolean eliminarCuenta() {
        this.cuentaBO = new CuentaBO();
        return this.cuentaBO.eliminarCuenta(sesionIniciada);
    }

    boolean eliminarPersona(String dni) {
        this.personaBO = new PersonaBO();
        return this.personaBO.eliminar(dni);
    }

    boolean crearPersona(PersonaDTO p) {
        this.personaBO = new PersonaBO();
        return this.personaBO.crear(p);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
