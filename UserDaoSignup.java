package com.ty.dao;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;

import com.ty.dto.UserDetails;
	public class UserDao {
		String path="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/abc";
		String username="root";
		String password="root";
		Connection con=null;
		public String insert(UserDetails u) {
			try {
				Class.forName(path);
				con=DriverManager.getConnection(url,username,password);
				String query="insert into userdetails values(?,?,?,?,?,?,?)";
				PreparedStatement ps=con.prepareStatement(query);
				ps.setString(1,u.getFirstName());
				ps.setString(2,u.getLastName());
				ps.setString(3, u.getEmail());
				ps.setString(4, u.getPassword());
				ps.setLong(5, u.getPhoneNum());
				ps.setString(6, u.getDob());
				ps.setString(7, u.getGender());
				ps.executeUpdate();
				
				System.out.println("Sign in Successfull");
				
			} catch (ClassNotFoundException e) {
				
				e.printStackTrace();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			finally {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			return "not successful";
		}
		public void update(UserDetails u) {
			try {
				Class.forName(path);
				con=DriverManager.getConnection(url,username,password);
				String query="update userdetails set firstname=?,lastname=?,password=?,phone=?,dob=?,gender=? where email=?";
				PreparedStatement ps=con.prepareStatement(query);
				ps.setString(1,u.getFirstName());
				ps.setString(2,u.getLastName());
				ps.setString(3, u.getPassword());
				ps.setLong(4, u.getPhoneNum());
				ps.setString(5, u.getDob());
				ps.setString(6, u.getGender());
				ps.setString(7, u.getEmail());
				ps.executeUpdate();
				System.out.println("User Details Updated Successfully");
			} catch (ClassNotFoundException e) {
				
				e.printStackTrace();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
		public void delete(String email,String pasword) {
			try {
				Class.forName(path);
				con=DriverManager.getConnection(url,username,password);
				String query="delete from cart where email=? && password=?";
				PreparedStatement ps=con.prepareStatement(query);
				ps.setString(1, email);
				ps.setString(2, password);
				ps.executeUpdate();
				System.out.println("Account Deleted Successfully");
			} catch (ClassNotFoundException e) {
				
				e.printStackTrace();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
		public UserDetails getUserByEmailAndPassword(String email,String pwd) {
			try {
				Class.forName(path);
				con=DriverManager.getConnection(url,username,password);
				String query="select * from userdetails where email=? and password=?";
				PreparedStatement ps=con.prepareStatement(query);
				ps.setString(1,email);
				ps.setString(2,pwd);
				ResultSet rs=ps.executeQuery();
			
				while(rs.next()) {
					UserDetails u=new UserDetails();
					u.setFirstName(rs.getString("FirstName"));
					u.setLastName(rs.getString("LastName"));
					u.setEmail(rs.getString("email"));
					u.setPassword(rs.getString("password"));
					u.setPhoneNum(rs.getLong("phone"));
					u.setDob(rs.getString("dob"));
					u.setGender(rs.getString("gender"));
					return u;
				}

			} catch (ClassNotFoundException e) {
				
				e.printStackTrace();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
				finally {
					try {
						con.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			return null;
			
		}
	}


