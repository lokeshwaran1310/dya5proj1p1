package com.jdbcconnection.dao;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

import com.jdbcconnection.models.bug;
import com.jdbcconnection.utils.dbUtil;
public class bugdao {
    public void insertbug(bug b){
        Connection con=dbUtil.getConnection();
        try {
            PreparedStatement ps=con.prepareStatement("INSERT INTO bugtable(title,description,status) VALUES(?,?,?)");
            ps.setString(1, b.getTitle());
            ps.setString(2,b.getDescription());
            ps.setString(3,b.getStatus());
            ps.executeUpdate();
            System.out.println("Bug inserted");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public List<bug> getAllBugs(){
        List<bug> l=new ArrayList<>();
        Connection con=dbUtil.getConnection();
        try {
            PreparedStatement st=con.prepareStatement("SELECT * FROM bugtable");
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                bug bg=new bug();
                bg.setId(rs.getInt("id"));
                bg.setTitle(rs.getString("title"));
                bg.setDescription(rs.getString("description"));
                bg.setStatus(rs.getString("status"));
                l.add(bg);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }


         return l;
    }
}
