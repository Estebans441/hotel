package co.edu.javeriana.bd.hotel.controller;

import co.edu.javeriana.bd.hotel.model.dao.PaisDAO;
import co.edu.javeriana.bd.hotel.model.dao.impl.PaisDAOImpl;
import co.edu.javeriana.bd.hotel.model.dto.PaisDTO;
import java.util.List;

public class PaisBO {
    
    private PaisDAO pdao;
    
    public List<PaisDTO> findAll() {
        this.pdao = new PaisDAOImpl();
        return this.pdao.findAll();
    }

    public boolean crear(PaisDTO p) {
        this.pdao = new PaisDAOImpl();
        return this.pdao.create(p) != null;
    }

    public PaisDTO findById(String text) {
        this.pdao = new PaisDAOImpl();
        return this.pdao.findById(text);
    }

    public boolean eliminar(String text) {
        this.pdao = new PaisDAOImpl();
        return this.pdao.delete(text);
    }

    public boolean editar(PaisDTO p) {
        this.pdao = new PaisDAOImpl();
        PaisDTO existente = this.pdao.findById(p.getNombre());
        if(existente == null) return false;
        else return this.pdao.edit(p.getNombre(), p) != null;
    }
}
