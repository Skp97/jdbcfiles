package jdbc_use_maven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DAO {
	String path="com.mysql.cj.jdbc.Driver";
	String url="jdbc:mysql://localhost:3306/abc";
	String username="root";
	String password="root";
	Connection con=null;
	public String insertPerson(Person p) {
		try {
			Class.forName(path);
			con=DriverManager.getConnection(url,username,password);
			String query="Insert into student2 values(?,?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(query);
			ps.setInt(1, p.getId());
			ps.setString(2,p.getName());
			ps.setString(3, p.getAddress());
			ps.setLong(4, p.getPhoneNum());
			ps.setLong(5, p.getPin());
			int a=ps.executeUpdate();
			if(a==1) {
				return "saved";
			}
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
					System.out.println("Closed");
				}
				catch(SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return "Not Saved";
	}
		public String updatePerson(Person p) {
			try {
				Class.forName(path);
				con=DriverManager.getConnection(url,username,password);
				String query="UPDATE student2 SET adddress = ?, phone = ?,name=?,pin=? WHERE id = ?";
				PreparedStatement ps=con.prepareStatement(query);
				ps.setInt(5, p.getId());
				ps.setString(3,p.getName());
				ps.setString(1, p.getAddress());
				ps.setLong(2, p.getPhoneNum());
				ps.setLong(4, p.getPin());
				int a=ps.executeUpdate();
				if(a==1) {
					return "updated";
				}
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
			return "Not updated";
	}
		public String deletePerson(int id) {
			try {
				Class.forName(path);
				con=DriverManager.getConnection(url,username,password);
				String query="Delete from student2 where id=?";
				PreparedStatement ps=con.prepareStatement(query);
				ps.setInt(1, id);
				int a=ps.executeUpdate();
				if(a==1) {
					return "deleted";
				}
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
			return "Not Deleted";
	}
	/*public void getPerson(int id) {
		try {
			Class.forName(path);
			con=DriverManager.getConnection(url,username,password);
			String query="Select * from student2 where id=?";
			PreparedStatement pst=con.prepareStatement(query);
			pst.setInt(1, id);
			ResultSet rs=pst.executeQuery();
			while(rs.next()) {
				System.out.println("id= "+rs.getInt(1));
				System.out.println("name= "+rs.getString(2));
				System.out.println("address= "+rs.getString(3));
				System.out.println("phone number= "+rs.getLong(4));
				System.out.println("pin code= "+rs.getLong(5));
			
			}
			
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
	}*/
		
	public Person getPerson(int id) {
		try {
			Class.forName(path);
			con=DriverManager.getConnection(url,username,password);
			String query="Select * from student2 where id=?";
			PreparedStatement pst=con.prepareStatement(query);
			pst.setInt(1, id);
			ResultSet rs=pst.executeQuery();
			Person p=new Person();
			while(rs.next()) {
				p.setId(rs.getInt(1));
				p.setName(rs.getString(2));
				p.setAddress(rs.getString(3));
				p.setPhoneNum(rs.getLong(4));
				p.setPin(rs.getLong(5));
			}
			return p;
			
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
	
