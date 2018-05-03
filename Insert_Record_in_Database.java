import java.sql.*;
class Insert
{
	public static void main(String args[])
	{
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","manager");
			Statement stmt=con.createStatement();
			stmt.executeUpdate("INSERT INTO student VALUES (1,'rishi',98)");
			System.out.println("One record inserted successfully");
		}catch(Exception e)
		{
			System.err.println(e);
		}
	}
}