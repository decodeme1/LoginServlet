package DAO;

import Model.User;
import java.sql.*;
import java.util.ArrayList;

public class UserDAO {
    
    Connection conn;
    PreparedStatement stmt;
    ArrayList<User> Lista = new ArrayList<User>();
    Statement st;
    ResultSet rs;
    
    public UserDAO(){
    conn = new ConnectionFactory().getConnection();
    
    }
    
    public void adicionarUser(User user){
        
        String sql = "INSERT INTO login (id, pass) values (?, ?)";
        
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, user.getId());
            stmt.setString(2, user.getPass());
            stmt.execute();
            stmt.close();
        } catch (Exception e) {
            throw new RuntimeException("Erro 2 - ", e);
        }
        
    }
    
    public ArrayList<User> apresentarUser(){
        
        String sql = "SELECT * from login";
        
        try {
            
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            
            while(rs.next()){
                User user = new User();
                user.setId(rs.getString("id"));
                user.setPass(rs.getString("pass"));
                Lista.add(user);
            }
        } catch (Exception e) {
            throw new RuntimeException("Erro 3 - ", e);
        }
        return Lista;
    }
    
}
