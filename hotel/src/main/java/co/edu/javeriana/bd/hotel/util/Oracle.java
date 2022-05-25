package co.edu.javeriana.bd.hotel.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Oracle {
    
    private final String host;
    private final String port;
    private final String user;
    private final String pass;
    private final String database;
    private final String parameters;
    private Connection connection;

    public Oracle() {
        this.host = "orion.javeriana.edu.co";
        this.port = "1521";
        this.user = "is107413";
        this.pass = "bIH6_bJsr0";
        this.database = "LAB";
        this.parameters = "";
        this.connection = null;
    }
   
    public void conectar(){
        try {
            String path = "jdbc:oracle:thin:@" + host + ":" + port + "/" + database;
            System.out.println(path);
            this.connection = DriverManager.getConnection(path, user, pass);
            System.out.println("Se conecto");
        } catch (SQLException ex) {
            System.out.println("No se conecto");
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
            this.connection=null;
        }catch(Exception ex){
            System.out.println("No se conecto");
            System.out.println("Exception: " + ex.getMessage());
            this.connection=null;
        }
    }

    public void desconectar() {
        try {
            this.connection.close();
            System.out.println("Se desconecto");
        } catch (SQLException ex) {
            System.out.println("No se desconecto");
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        this.connection = null;
    }
    
    public Connection getConnection() {
        return connection;
    }
    
    
}
