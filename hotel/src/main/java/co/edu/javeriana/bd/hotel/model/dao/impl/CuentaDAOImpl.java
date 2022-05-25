package co.edu.javeriana.bd.hotel.model.dao.impl;

import co.edu.javeriana.bd.hotel.model.dao.CuentaDAO;
import co.edu.javeriana.bd.hotel.model.dto.CuentaDTO;
import co.edu.javeriana.bd.hotel.util.Oracle;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CuentaDAOImpl implements CuentaDAO {
    
    private final Oracle oracle;
    
    public CuentaDAOImpl() {
        this.oracle = new Oracle();
    }

    @Override
    public CuentaDTO create(CuentaDTO cuenta) {
        try{
            this.oracle.conectar();
            String query = "INSERT INTO p2_cuenta(usuario, pass) VALUES("+ 
                    "'" + cuenta.getUser()+ "'," +
                    "'" + cuenta.getPass() + "'" +
                    ")";
            System.out.println(query);

            Statement stmt = this.oracle.getConnection().createStatement();
            int code = stmt.executeUpdate(query);
            stmt.close();
            this.oracle.desconectar();
            
            switch (code) {
                case 1:
                    System.out.println("Se creo la cuenta");
                    return findById(cuenta.getUser());
                default:
                    return null;
            }
            
        } catch (SQLException ex){
            Logger.getLogger(PersonaDAOImpl.class.getName()).log(Level.SEVERE,null,ex);
            return null;
        }
    }

    @Override
    public Boolean delete(String user) {
        try{
            String query = "DELETE FROM p2_cuenta WHERE usuario = '" + user + "'";
            System.out.println(query);
            
            CuentaDTO cuenta = findById(user);
            System.out.println("Eliminando: " + cuenta);
            
            this.oracle.conectar();
            Statement stmt = this.oracle.getConnection().createStatement();
            int code = stmt.executeUpdate(query);
            stmt.close();
            this.oracle.desconectar();
            
            switch (code) {
                case 1:
                    System.out.println("Se elimino la cuenta");
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
    public CuentaDTO findById(String user) {
        try{
            this.oracle.conectar();
            String query = "SELECT * FROM p2_cuenta WHERE usuario = '"+ user +"'";
            System.out.println(query);

            Statement stmt = this.oracle.getConnection().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = stmt.executeQuery(query);
            if(rs.first())
            {
                CuentaDTO cuenta = new CuentaDTO(rs.getString("usuario"), rs.getString("pass"));
                System.out.println("Cuenta encontrada: " + cuenta.toString());
                rs.close();
                stmt.close();
                this.oracle.desconectar();
                return cuenta;
            } 
            else 
            {
                System.out.println("No se encontro ninguna cuenta");
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
    public CuentaDTO editPass(CuentaDTO cuenta, String nueva) {
        try{
            this.oracle.conectar();
            String query = "UPDATE p2_cuenta SET "+ 
                    "pass = '" + nueva + "' " +
                    " WHERE usuario = '" + cuenta.getUser() + "'";
            System.out.println(query);
            
            Statement stmt = this.oracle.getConnection().createStatement();
            int code = stmt.executeUpdate(query);
            stmt.close();
            this.oracle.desconectar();
            
            switch (code) {
                case 1:
                    System.out.println("Se edito la contrasenia");
                    return findById(cuenta.getUser());
                default:
                    return null;
            }
            
        } catch (SQLException ex){
            Logger.getLogger(CuentaDAOImpl.class.getName()).log(Level.SEVERE,null,ex);
            return null;
        }
    }

    @Override
    public CuentaDTO editPers(String persona, CuentaDTO cuenta) {
        try{
            this.oracle.conectar();
            String query = "UPDATE p2_cuenta SET "+ 
                    "persona = '" + persona + "' " +
                    " WHERE usuario = '" + cuenta.getUser() + "'";
            System.out.println(query);
            
            Statement stmt = this.oracle.getConnection().createStatement();
            int code = stmt.executeUpdate(query);
            stmt.close();
            this.oracle.desconectar();
            
            switch (code) {
                case 1:
                    System.out.println("Se edito la cuenta");
                    return findById(cuenta.getUser());
                default:
                    return null;
            }
            
        } catch (SQLException ex){
            Logger.getLogger(CuentaDAOImpl.class.getName()).log(Level.SEVERE,null,ex);
            return null;
        }
    }

    @Override
    public String findPer(String user) {
        try{
            this.oracle.conectar();
            String query = "SELECT * FROM p2_cuenta WHERE usuario = '"+ user +"'";
            System.out.println(query);

            Statement stmt = this.oracle.getConnection().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = stmt.executeQuery(query);
            if(rs.first())
            {
                String persona = rs.getString("persona");
                System.out.println("Persona de la cuenta: " + persona);
                rs.close();
                stmt.close();
                this.oracle.desconectar();
                return persona;
            } 
            else 
            {
                System.out.println("No se encontro ninguna cuenta");
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
    
}
