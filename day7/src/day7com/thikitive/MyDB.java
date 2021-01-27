package day7com.thikitive;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyDB {
	public static void main(String[] args) {
		ResultSet rs = null;
		Connection con;
/**
 * my name
 */
		try {
			// REgister DRiver class
			Class.forName("com.mysql.jdbc.Driver");

			try {
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/amit", "root", "Amit@k123");
				Statement st = con.createStatement();
				insert(con, st);
				update(st);
				// delete(st);
				select(rs, st);

			}

			catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void select(ResultSet rs, Statement st) {
		try {
			rs = st.executeQuery("select * from emp2");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getDouble(3) + " ");
			}
			System.out.println("sucess");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void delete(Statement st) {
		try {
			int result1 = st.executeUpdate("delete from emp2 where eid=1");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void update(Statement st) {
		try {
			int result = st.executeUpdate("update emp2 set esalary=1000 where eid=1 ");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void insert(Connection con, Statement st2) {

		try {
			st2 = con.createStatement();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			st2.execute("insert into emp2 values(1 ,'amit',2344)");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
