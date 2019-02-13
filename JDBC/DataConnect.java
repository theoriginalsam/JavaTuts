package com.data.jdbc;

import java.sql.*;


public class DataConnect {
	public static void main(String[] args) throws SQLException {
		String sql= "SELECT * from sam " ;
		Connection con ;
		
		//1
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver LOaded");
			
			
			//2 
			
		
			 con = DriverManager.getConnection("jdbc:mysql://localhost:8889/GCES","samir1","samir");
			
				// TODO Auto-generated catch block
//				System.out.println("SQL EXCEPTION");
			
			 
			System.out.println("REESTABLISHED");
		Statement st = con.createStatement();
		
		ResultSet rs = st.executeQuery(sql);
//		
		while(rs.next()) {
		try {
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
				System.out.println(rs.getDouble(4));
			//}
			
		}catch(Exception e) {
			System.out.println("Error is "+e.getMessage());
		}
		}
		
		try {
		PreparedStatement st1 = con.prepareStatement("INSERT INTO `sam` (`id`, `name`, `FEB 14 Partner`, `bool`) VALUES ('2', 'LOVE', 'HATE', '1')");
		st1.executeUpdate()	;
		
		}catch(Exception e){
			System.out.println("Error is "+e.getMessage());
		}
		con.close();
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
