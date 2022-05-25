package co.edu.javeriana.bd.hotel.model.dao.impl;

import co.edu.javeriana.bd.hotel.model.dao.PersonaDAO;
import co.edu.javeriana.bd.hotel.model.dto.PersonaDTO;
import co.edu.javeriana.bd.hotel.util.Oracle;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PersonaDAOImpl implements PersonaDAO {
    
    private final Oracle oracle;

    public PersonaDAOImpl() {
        this.oracle = new Oracle();
    }
    
    @Override
    public PersonaDTO create(PersonaDTO persona) {
        try{
            this.oracle.conectar();
            String query = "INSERT INTO p2_persona(dni, nombre, direccion, telefono) VALUES("+ 
                    "'" + persona.getDni()+ "'," +
                    "'" + persona.getNombre()+ "'," +
                    "'" + persona.getTelefono()+ "'," +
                    "'" + persona.getDireccion()+ "'" +
                    ")";
            System.out.println(query);

            Statement stmt = this.oracle.getConnection().createStatement();
            int code = stmt.executeUpdate(query);
            stmt.close();
            this.oracle.desconectar();
            
            switch (code) {
                case 1:
                    System.out.println("Se creo la persona");
                    return findById(persona.getDni());
                default:
                    return null;
            }
            
        } catch (SQLException ex){
            Logger.getLogger(PersonaDAOImpl.class.getName()).log(Level.SEVERE,null,ex);
            return null;
        }
    }

    @Override
    public Boolean delete(String dni) {
        try{
            String query = "DELETE FROM p2_persona WHERE dni = '" + dni + "'";
            System.out.println(query);
            
            PersonaDTO persona = findById(dni);
            System.out.println("Eliminando: " + persona.toString());
            
            this.oracle.conectar();
            Statement stmt = this.oracle.getConnection().createStatement();
            int code = stmt.executeUpdate(query);
            stmt.close();
            this.oracle.desconectar();
            
            switch (code) {
                case 1:
                    System.out.println("Se elimino la persona");
                    return true;
                default:
                    return false;
            }
            
        } catch (SQLException ex){
            Logger.getLogger(CuentaDAOImpl.class.getName()).log(Level.SEVERE,null,ex);
            return null;
        }
    }

    @Override
    public PersonaDTO findById(String dni) {
        try{
            this.oracle.conectar();
            String query = "SELECT * FROM p2_persona WHERE dni = '"+ dni +"'";
            System.out.println(query);

            Statement stmt = this.oracle.getConnection().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = stmt.executeQuery(query);
            if(rs.first())
            {
                PersonaDTO persona = new PersonaDTO(rs.getString("dni"), rs.getString("nombre"), rs.getString("telefono"), rs.getString("direccion"));
                System.out.println("Persona encontrada: " + persona.toStringAll());
                rs.close();
                stmt.close();
                this.oracle.desconectar();
                
                return persona;
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
    public List<PersonaDTO> findAll() {
        try{
            
            List<PersonaDTO> personas = new ArrayList<>();
            
            this.oracle.conectar();
            String query = "SELECT * FROM p2_persona";
            System.out.println(query);
            Statement stmt = this.oracle.getConnection().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = stmt.executeQuery(query);
            if(!rs.next()) return null;
            rs.previous();
            do
            {
                rs.next();
                PersonaDTO persona = new PersonaDTO(rs.getString("dni"), rs.getString("nombre"), rs.getString("telefono"), rs.getString("direccion"));
                personas.add(persona);
            }
            while(!rs.isLast());
            
            rs.close();
            stmt.close();
            this.oracle.desconectar();
            
            return personas;
            
        } catch (SQLException ex){
            Logger.getLogger(PersonaDAOImpl.class.getName()).log(Level.SEVERE,null,ex);
            return null;
        }
    }
   
}
