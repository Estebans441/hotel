package co.edu.javeriana.bd.hotel.controller;

import co.edu.javeriana.bd.hotel.model.dao.PersonaDAO;
import co.edu.javeriana.bd.hotel.model.dao.impl.PersonaDAOImpl;
import co.edu.javeriana.bd.hotel.model.dto.PersonaDTO;
import java.util.List;

public class PersonaBO {
    PersonaDAO pdao;
    
    public PersonaDTO findById(String dni)
    {
        this.pdao = new PersonaDAOImpl();
        return this.pdao.findById(dni);
    }

    public List<PersonaDTO> findByAll() {
        this.pdao = new PersonaDAOImpl();
        return this.pdao.findAll();
    }

    public boolean eliminar(String dni) {
        this.pdao = new PersonaDAOImpl();
        return this.pdao.delete(dni);
    }

    public boolean crear(PersonaDTO p) {
        this.pdao = new PersonaDAOImpl();
        return this.pdao.create(p) != null;
    }
}
