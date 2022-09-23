package com.ty.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ty.dto.Cart;

public class CartDao {
	String path="com.mysql.cj.jdbc.Driver";
	String url="jdbc:mysql://localhost:3306/abc";
	String username="root";
	String password="root";
	Connection con=null;
	public void insert(Cart c) {
		try {
			Class.forName(path);
			con=DriverManager.getConnection(url,username,password);
			String query="insert into cart values(?,?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(query);
			ps.setInt(1, c.getId());
			ps.setString(2, c.getEmail());
			ps.setString(3, c.getPassword());
			ps.setString(4, c.getUsername());
			ps.setString(5, c.getAddress());
			ps.executeUpdate();
			System.out.println("Inserted");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	public void update(Cart c) {
		try {
			Class.forName(path);
			con=DriverManager.getConnection(url,username,password);
			String query="update cart set email=?,password=?,username=?,address=? where id=?";
			PreparedStatement ps=con.prepareStatement(query);
			ps.setString(1, c.getEmail());
			ps.setString(2, c.getPassword());
			ps.setString(3, c.getUsername());
			ps.setString(4, c.getAddress());
			ps.setInt(5, c.getId());
			ps.executeUpdate();
			System.out.println("Updated");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	public void delete(int id) {
		try {
			Class.forName(path);
			con=DriverManager.getConnection(url,username,password);
			String query="delete from cart where id=?";
			PreparedStatement ps=con.prepareStatement(query);
			ps.setInt(1, id);
			ps.executeUpdate();
			System.out.println("Deleted");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	public Cart get(int id) {
		try {
			Class.forName(path);
			con=DriverManager.getConnection(url,username,password);
			String query="select * from cart where id=?";
			PreparedStatement ps=con.prepareStatement(query);
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			Cart c=new Cart();
			while(rs.next()) {
				c.setId(rs.getInt(1));
				c.setEmail(rs.getString(2));
				c.setPassword(rs.getString(3));;
				c.setUsername(rs.getString(4));
				c.setAddress(rs.getString(5));
			} 
			return c;
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return null;
		
	}
}
