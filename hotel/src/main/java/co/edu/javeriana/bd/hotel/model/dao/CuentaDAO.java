package co.edu.javeriana.bd.hotel.model.dao;

import co.edu.javeriana.bd.hotel.model.dto.CuentaDTO;
import java.util.List;

public interface CuentaDAO {
    
    public CuentaDTO create(CuentaDTO cuenta);
    
    public CuentaDTO edit(String user, CuentaDTO cuenta);
    
    public Boolean delete(String user);
    
    public CuentaDTO findById(String user);
    
    public List<CuentaDTO> findAll();
    
    public Integer count();
    
}
