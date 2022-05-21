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
    //private Connection connection;

    public Oracle() {
        this.host = "localhost";
        this.port = "3306";
        this.user = "persona_app";
        this.pass = "123";
        this.database = "persona_22_db";
        this.parameters = "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        //this.connection = null;
    }
    

    
}
