package jdbc_use_batch_execution;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DriverBatch {
	public static void main(String[] args) {
		/*Student s1=new Student(201,"skp","Odisha",86581,766001);
		Student s2=new Student(202,"Anuj","Bihar",11111,22222);
		Student s3=new Student(203,"Eshita","Himachal",33333,44444);
		Student s4=new Student(204,"skp","Odisha",8659981,766001);
		List<Student> list=new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		System.out.println(list);
		*/
		String path="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/abc";
		String username="root";
		String password="root";
		Connection con=null;
		
	/*	try {
			Class.forName(path);
			con=DriverManager.getConnection(url,username,password);
			String query="Insert into student2 values(?,?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(query);
			for(Student s:list) {
				ps.setInt(1,s.getId());
				ps.setString(2,s.getName() );
				ps.setString(3, s.getAddress());
				ps.setLong(4, s.getMobNo());
				ps.setLong(5, s.getPin());
				ps.addBatch();	
			}
			ps.executeBatch();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		  catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}*/
		/*Student s1=new Student();
		s1.setId(201);
		s1.setName("Laxmi");
		Student s2=new Student();
		s2.setId(202);
		s2.setName("Rajbala");
		
		List<Student> list=new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		try {
			Class.forName(path);
			con=DriverManager.getConnection(url,username,password);
			String query="update student2 set name=? where id=?";
			PreparedStatement ps=con.prepareStatement(query);
			for(Student s:list) {
				
				ps.setString(1,s.getName() );
				ps.setInt(2,s.getId());
				ps.addBatch();
			}
			ps.executeBatch();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		  catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}*/
		Student s1=new Student();
		s1.setId(2);
		Student s2=new Student();
		s2.setId(3);
		Student s3=new Student();
		s3.setId(6);
		List<Student> list=new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		try {
			Class.forName(path);
			con=DriverManager.getConnection(url,username,password);
			String query="delete from student2 where id=?";
			PreparedStatement ps=con.prepareStatement(query);
			for(Student s:list) {
				ps.setInt(1,s.getId());
				ps.addBatch();
			}
			ps.executeBatch();
			System.out.println(ps);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		  catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
	}
}
