package co.edu.javeriana.bd.hotel.model.dao.impl;

import co.edu.javeriana.bd.hotel.model.dao.CuentaDAO;
import co.edu.javeriana.bd.hotel.model.dto.CuentaDTO;
import co.edu.javeriana.bd.hotel.util.Oracle;
import java.util.List;

public class CuentaDAOImpl implements CuentaDAO {
    
    private final Oracle oracle;
    
    public CuentaDAOImpl() {
        this.oracle = new Oracle();
    }

    @Override
    public CuentaDTO create(CuentaDTO cuenta) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Boolean delete(String user) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public CuentaDTO findById(String user) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public CuentaDTO editPass(CuentaDTO cuenta, String nueva) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public CuentaDTO editPers(String persona, CuentaDTO cuenta) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
