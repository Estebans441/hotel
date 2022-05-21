package co.edu.javeriana.bd.hotel.model.dao.impl;

import co.edu.javeriana.bd.hotel.model.dao.PersonaDAO;
import co.edu.javeriana.bd.hotel.model.dto.PersonaDTO;
import co.edu.javeriana.bd.hotel.util.Oracle;
import java.util.List;

public class PersonaDAOImpl implements PersonaDAO {
    
    private final Oracle oracle;

    public PersonaDAOImpl() {
        this.oracle = new Oracle();
    }
    
    @Override
    public PersonaDTO create(PersonaDTO persona) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public PersonaDTO edit(String dni, PersonaDTO persona) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Boolean delete(String dni) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public PersonaDTO findById(String dni) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<PersonaDTO> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Integer count() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
