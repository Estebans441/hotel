package co.edu.javeriana.bd.hotel.model.dao.impl;

import co.edu.javeriana.bd.hotel.model.dao.PaisDAO;
import co.edu.javeriana.bd.hotel.model.dto.PaisDTO;
import co.edu.javeriana.bd.hotel.util.Oracle;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PaisDAOImpl implements PaisDAO {
    
    private final Oracle oracle;

    public PaisDAOImpl() {
        this.oracle = new Oracle();
    }  
    
    @Override
    public PaisDTO create(PaisDTO pais) {
        try{
            this.oracle.conectar();
            String query = "INSERT INTO p2_pais(nombre, iva, impconsumo, impnalturismo) VALUES("+ 
                    "'" + pais.getNombre()+ "'," +
                    pais.getIva()+ ", " +
                    pais.getIc()+ "," +
                    pais.getInTur()+ "" +
                    ")";
            System.out.println(query);

            Statement stmt = this.oracle.getConnection().createStatement();
            int code = stmt.executeUpdate(query);
            stmt.close();
            this.oracle.desconectar();
            
            switch (code) {
                case 1:
                    System.out.println("Se creo el pais");
                    return findById(pais.getNombre());
                default:
                    return null;
            }
            
        } catch (SQLException ex){
            Logger.getLogger(PersonaDAOImpl.class.getName()).log(Level.SEVERE,null,ex);
            return null;
        }
    }

    @Override
    public PaisDTO edit(String nombre, PaisDTO pais) {
        try{
            this.oracle.conectar();
            //nombre, iva, impconsumo, impnalturismo
            String query = "UPDATE p2_pais SET "+ 
                    "iva = " + pais.getIva()+ "," +
                    "impconsumo = " + pais.getIc()+ "," +
                    "impnalturismo = " + pais.getInTur() +
                    " WHERE nombre = '" + nombre + "'";
            System.out.println(query);
            
            Statement stmt = this.oracle.getConnection().createStatement();
            int code = stmt.executeUpdate(query);
            stmt.close();
            this.oracle.desconectar();
            
            switch (code) {
                case 1:
                    System.out.println("Se edito el pais");
                    return findById(pais.getNombre());
                default:
                    return null;
            }
            
        } catch (SQLException ex){
            Logger.getLogger(PersonaDAOImpl.class.getName()).log(Level.SEVERE,null,ex);
            return null;
        }
    }

    @Override
    public Boolean delete(String nombre) {
        try{
            String query = "DELETE FROM p2_pais WHERE nombre = '" + nombre + "'";
            System.out.println(query);
            
            PaisDTO pais = findById(nombre);
            System.out.println("Eliminando: " + pais);
            
            this.oracle.conectar();
            Statement stmt = this.oracle.getConnection().createStatement();
            int code = stmt.executeUpdate(query);
            stmt.close();
            this.oracle.desconectar();
            
            switch (code) {
                case 1:
                    System.out.println("Se elimino el pais");
                    return true;
                default:
                    return false;
            }
            
        } catch (SQLException ex){
            Logger.getLogger(PersonaDAOImpl.class.getName()).log(Level.SEVERE,null,ex);
            return null;
        }
    }

    @Override
    public PaisDTO findById(String nombre) {
        try{
            this.oracle.conectar();
            String query = "SELECT * FROM p2_pais WHERE nombre = '"+ nombre +"'";
            System.out.println(query);

            Statement stmt = this.oracle.getConnection().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = stmt.executeQuery(query);
            if(rs.first())
            {
                PaisDTO pais = new PaisDTO(rs.getString("nombre"), rs.getFloat("iva"), rs.getFloat("impconsumo"), rs.getFloat("impnalturismo"));
                System.out.println("Pais encontrado: " + pais.toString());
                rs.close();
                stmt.close();
                this.oracle.desconectar();
                
                return pais;
            } 
            else 
            {
                rs.close();
                stmt.close();
                this.oracle.desconectar();
                
                return null;
            }        
            
        } catch (SQLException ex){
            Logger.getLogger(PersonaDAOImpl.class.getName()).log(Level.SEVERE,null,ex);
            return null;
        }
    }

    @Override
    public List<PaisDTO> findAll() {
        try{
            
            List<PaisDTO> paises = new ArrayList<>();
            
            this.oracle.conectar();
            String query = "SELECT * FROM p2_pais";
            System.out.println(query);
            Statement stmt = this.oracle.getConnection().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = stmt.executeQuery(query);
            if(!rs.next()) return null;
            rs.previous();
            do
            {
                rs.next();
                PaisDTO pais = new PaisDTO(rs.getString("nombre"), rs.getFloat("iva"), rs.getFloat("impconsumo"), rs.getFloat("impnalturismo"));
                paises.add(pais);
            }
            while(!rs.isLast());
            
            rs.close();
            stmt.close();
            this.oracle.desconectar();
            
            return paises;
            
        } catch (SQLException ex){
            Logger.getLogger(PersonaDAOImpl.class.getName()).log(Level.SEVERE,null,ex);
            return null;
        }
    }    
}
