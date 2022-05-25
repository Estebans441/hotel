package co.edu.javeriana.bd.hotel.controller;

import co.edu.javeriana.bd.hotel.model.dao.CuentaDAO;
import co.edu.javeriana.bd.hotel.model.dao.PersonaDAO;
import co.edu.javeriana.bd.hotel.model.dao.impl.CuentaDAOImpl;
import co.edu.javeriana.bd.hotel.model.dao.impl.PersonaDAOImpl;
import co.edu.javeriana.bd.hotel.model.dto.CuentaDTO;


public class CuentaBO {
    
    CuentaDAO cuentaDAO;
    PersonaDAO personaDAO;
    
    public CuentaDTO iniciarSesion(CuentaDTO cuenta) {
        this.cuentaDAO = new CuentaDAOImpl();
        this.personaDAO = new PersonaDAOImpl();
        CuentaDTO c = cuentaDAO.findById(cuenta.getUser());
        String persona = cuentaDAO.findPer(cuenta.getUser());
        if(persona != null) c.setPersona(personaDAO.findById(persona));
        if(c != null) if(c.getPass().equals(cuenta.getPass())) return c;
        return null;
    }
    
    public Boolean crearCuenta(CuentaDTO cuenta) {
        this.cuentaDAO = new CuentaDAOImpl();
        CuentaDTO existe =  cuentaDAO.findById(cuenta.getUser());
        if(existe == null) return (cuentaDAO.create(cuenta) != null);
        else return false;
    }

    public boolean cambiarPass(CuentaDTO sesionIniciada, String nueva) {
        this.cuentaDAO = new CuentaDAOImpl();
        return this.cuentaDAO.editPass(sesionIniciada, nueva) != null;
    }

    public boolean asociarPersona(String dni, CuentaDTO sesionIniciada) {
        this.cuentaDAO = new CuentaDAOImpl();
        return this.cuentaDAO.editPers(dni, sesionIniciada) != null;
    }

    public boolean eliminarCuenta(CuentaDTO sesionIniciada) {
        this.cuentaDAO = new CuentaDAOImpl();
        return this.cuentaDAO.delete(sesionIniciada.getUser());
    }    
}
