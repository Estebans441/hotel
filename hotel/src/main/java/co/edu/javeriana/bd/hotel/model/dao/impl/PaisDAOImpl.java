package co.edu.javeriana.bd.hotel.model.dao.impl;

import co.edu.javeriana.bd.hotel.model.dao.PaisDAO;
import co.edu.javeriana.bd.hotel.model.dto.PaisDTO;
import co.edu.javeriana.bd.hotel.util.Oracle;
import java.util.List;

public class PaisDAOImpl implements PaisDAO {
    
    private final Oracle oracle;

    public PaisDAOImpl() {
        this.oracle = new Oracle();
    }  
    
    @Override
    public PaisDTO create(PaisDTO pais) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public PaisDTO edit(String nombre, PaisDTO pais) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Boolean delete(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public PaisDTO findById(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<PaisDTO> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }    
}
