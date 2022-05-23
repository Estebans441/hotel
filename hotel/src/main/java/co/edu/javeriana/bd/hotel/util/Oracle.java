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
        this.database = "persona_22_db";
        this.parameters = "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        this.connection = null;
    }
    

    
}
