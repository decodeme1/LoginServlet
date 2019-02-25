package DAO;

import java.sql.*;

public class ConnectionFactory {
    
    String url="jdbc:postgresql://localhost:5432/Login";
    String user="postgres";
    String pass="coldparais";
    Connection con;
    
    {
    getConnection();
}
    
    public Connection getConnection(){
        try {
            Class.forName("org.postgresql.Driver");
            return DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
            throw new RuntimeException("erro 1 - ", e);
        }
    }
    
}
