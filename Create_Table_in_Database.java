import java.sql.*;
class Create
{
	public static void main(String args[])
	{
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@Rishi:1521:XE","system","manager");
			Statement stmt=con.createStatement();
			stmt.execute("CREATE TABLE student(rno number(3),name varchar2(10),marks number(3))");
			System.out.println("Table is created successfully in the table in the database");
		    }catch(Exception e)
			{
				System.err.println(e);
			}
	}
}