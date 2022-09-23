package com.example.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Util {
    public static Connection getConnection(){
        try{
            Class.forName("org.h2.Driver");
            return DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "sa", "");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void close(PreparedStatement stmt, Connection conn){
        try{
            if(stmt != null)
                stmt.close();
        } catch(Exception e){
            e.printStackTrace();
        } finally{
            stmt = null;
        }
        try {
			if(!conn.isClosed() || conn != null)
				conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			conn = null;
		}
    }
    
    public static void close(ResultSet rs, PreparedStatement stmt, Connection conn) {
		try {
			if(rs != null)
				rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			rs = null;
		}
		
		try {
			if(stmt != null)
				stmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			stmt = null;
		}
		
		try {
			if(!conn.isClosed() || conn != null)
				conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			conn = null;
		}
	}
    
    public static void main(String[] args) {
        try{
            Connection conn = getConnection();
            PreparedStatement stmt = conn.prepareStatement("select * from product");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()){
                System.out.println(rs.getString("NAME") + '|' + rs.getString("LINK"));
            }
        } catch(Exception e){
            e.printStackTrace();
        } finally{

        }

    }
}
