package co.edu.javeriana.bd.hotel.model.dao;

import co.edu.javeriana.bd.hotel.model.dto.PersonaDTO;
import java.util.List;

public interface PersonaDAO {
    
    public PersonaDTO create(PersonaDTO persona);
    
    public Boolean delete(String dni);
    
    public PersonaDTO findById(String dni);
    
    public List<PersonaDTO> findAll();
}
