package jdbc_product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO {
	String path = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/abc";
	String username = "root";
	String password = "root";
	Connection con = null;

	public void insert(Product p) {
		try {
			System.out.println(p.getName());
			Class.forName(path);
			con = DriverManager.getConnection(url, username, password);
			String query = "Insert into product values(?,?,?,?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(query);  
				ps.setInt(1, p.getId());
				ps.setString(2, p.getName());
				ps.setDouble(3, p.getPrice());
				ps.setString(4, p.getManufacturer());
				ps.setDouble(5, p.getDiscount());
				ps.setInt(6, p.getWarrenty());
				ps.setString(7, p.getMandate());
				ps.setDouble(8, p.getGst());
				ps.executeUpdate();
				
				
			//}
			System.out.println("Data Saved!!");
			//ps.executeBatch();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}

	public void update(Product p) {
		try {
			
			Class.forName(path);
			con = DriverManager.getConnection(url, username, password);
			String query = "update  product set name=?,price=?,manufact=?,discount=?,warrenty=?,mandate=?,gst=? where id=?";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, p.getName());
			ps.setDouble(2, p.getPrice());
			ps.setString(3, p.getManufacturer());
			ps.setDouble(4, p.getDiscount());
			ps.setInt(5, p.getWarrenty());
			ps.setString(6, p.getMandate());
			ps.setDouble(7, p.getGst());
			ps.setInt(8, p.getId());
			ps.executeUpdate();
			System.out.println("updated");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
	public void delete(int id) {
		try {
			Class.forName(path);
			con = DriverManager.getConnection(url, username, password);
			String query = "delete from product where id=?";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1,id);
			ps.executeUpdate();
			System.out.println("Deleted");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
	public Product get(int id) {
		try {
			Class.forName(path);
			con = DriverManager.getConnection(url, username, password);
			String query = "Select * from product where id=?";
			PreparedStatement ps=con.prepareStatement(query);
			ps.setInt(1,id);
			ResultSet rs=ps.executeQuery();
			Product p=new Product();
			while(rs.next()) {
				p.setId(rs.getInt(1));
				p.setName(rs.getString(2));
				p.setPrice(rs.getDouble(3));
				p.setManufacturer(rs.getString(4));
				p.setDiscount(rs.getDouble(5));
				p.setWarrenty(rs.getInt(6));
				p.setMandate(rs.getString(7));
				p.setGst(rs.getDouble(8));
			}
			return p;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return null;
	}
}
