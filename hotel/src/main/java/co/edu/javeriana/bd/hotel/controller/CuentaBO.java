package co.edu.javeriana.bd.hotel.controller;

import co.edu.javeriana.bd.hotel.model.dao.CuentaDAO;
import co.edu.javeriana.bd.hotel.model.dao.impl.CuentaDAOImpl;
import co.edu.javeriana.bd.hotel.model.dto.CuentaDTO;


public class CuentaBO {
    
    CuentaDAO cuentaDAO;
    
    public Boolean iniciarSesion(CuentaDTO cuenta) {
        this.cuentaDAO = new CuentaDAOImpl();
        return true;
        //return cuentaDAO.findById(cuenta.getUser()).getPass().equals(cuenta.getPass());
    }
    
    public Boolean crearCuenta(CuentaDTO cuenta) {
        this.cuentaDAO = new CuentaDAOImpl();
        CuentaDTO existe =  cuentaDAO.findById(cuenta.getUser());
        if(existe == null) return false;
        else return (cuentaDAO.create(cuenta) != null);
    }
    
}
