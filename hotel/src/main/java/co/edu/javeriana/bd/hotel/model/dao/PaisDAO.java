package co.edu.javeriana.bd.hotel.model.dao;

import co.edu.javeriana.bd.hotel.model.dto.PaisDTO;
import java.util.List;

public interface PaisDAO {
    
    public PaisDTO create(PaisDTO pais);
    
    public PaisDTO edit(String nombre, PaisDTO pais);
    
    public Boolean delete(String nombre);
    
    public PaisDTO findById(String nombre);
    
    public List<PaisDTO> findAll();
    
    public Integer count();
    
}
