package com.jdbcconnection.utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class dbUtil {
    public static Connection getConnection(){
        Connection con=null;
        try {
           Class.forName("org.postgresql.Driver");
           con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","Lokesh@123");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
        
    }
}
