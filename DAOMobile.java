package jdbc_mobileObj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jdbc_product.Product;
import jdbc_use_maven.Person;

public class DAO {
	String path="com.mysql.cj.jdbc.Driver";
	String url="jdbc:mysql://localhost:3306/abc";
	String username="root";
	String password="root";
	Connection con=null;
	public String insertMobile(Mobile m) {
		try {
			Class.forName(path);
			con=DriverManager.getConnection(url,username,password);
			String query="Insert into mobile values(?,?,?,?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(query);
			ps.setInt(1, m.getId());
			ps.setString(2, m.getName());
			ps.setString(3, m.getBrand());
			ps.setString(4, m.getColour());
			ps.setDouble(5, m.getPrice());
			ps.setInt(6, m.getRam());
			ps.setString(7,m.getManufacturer());
			ps.executeUpdate();
			if(ps!=null) {
				System.out.println("Saved");
			}
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			if(con!=null) {
				try {
					con.close();
				}
				catch(SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return "Not Saved";
		
	}
	public String updateMobile(Mobile m) {
		try {
			Class.forName(path);
			con=DriverManager.getConnection(url,username,password);
			String query="update mobile set name=?,brand=?,colour=?,price=?,ram=?,manufacturer=? where id=?";
			PreparedStatement ps=con.prepareStatement(query);
			ps.setString(1, m.getName());
			ps.setString(2, m.getBrand());
			ps.setString(3, m.getColour());
			ps.setDouble(4, m.getPrice());
			ps.setInt(5, m.getRam());
			ps.setString(6,m.getManufacturer());
			ps.setInt(7, m.getId());
			ps.executeUpdate();
			if(ps!=null) {
				System.out.println("Updated");
			}
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			if(con!=null) {
				try {
					con.close();
				}
				catch(SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return "Not updated";
		
	}
	public String deleteMobile(int id) {
		try {
			Class.forName(path);
			con=DriverManager.getConnection(url,username,password);
			String query="delete from mobile where id=?";
			PreparedStatement ps=con.prepareStatement(query);
			ps.setInt(1,id);
			ps.executeUpdate();
			if(ps!=null) {
				System.out.println("Deleted");
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			if(con!=null) {
				try {
					con.close();
				}
				catch(SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return "Not Deleted";
		
	}	
		
		public Mobile getMobile(int id ) {
			try {
				Class.forName(path);
				con=DriverManager.getConnection(url,username,password);
				String query="Select * from mobile where id=?";
				PreparedStatement pst=con.prepareStatement(query);
				pst.setInt(1, id);
				ResultSet rs=pst.executeQuery();
				Mobile m1=new Mobile();
				while(rs.next()) {
					m1.setId(rs.getInt(1));
					m1.setName(rs.getString(2));
					m1.setBrand(rs.getString(3));
					m1.setColour(rs.getString(4));
					m1.setPrice(rs.getDouble(5));
					m1.setRam(rs.getInt(6));
					m1.setManufacturer(rs.getString(7));
				}
				return m1;
				
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
			finally {
				if(con!=null) {
					try {
						con.close();
					}
					catch(SQLException e) {
						e.printStackTrace();
					}
				}
		}
			return null;
		}
		
		
		
		
		
		
		
	}

