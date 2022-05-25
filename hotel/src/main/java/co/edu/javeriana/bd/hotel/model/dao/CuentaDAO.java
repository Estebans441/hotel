package co.edu.javeriana.bd.hotel.model.dao;

import co.edu.javeriana.bd.hotel.model.dto.CuentaDTO;
import java.util.List;

public interface CuentaDAO {
    
    public CuentaDTO create(CuentaDTO cuenta);
    
    public CuentaDTO editPass(CuentaDTO cuenta, String nueva);
    
    public CuentaDTO editPers(String persona, CuentaDTO cuenta);
    
    public Boolean delete(String user);
    
    public CuentaDTO findById(String user);
  
    public String findPer(String user);
}
