import java.sql.*;
class TypeI
{
	public static void main(String args[])
	{
		try{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection con=DriverManager.getConnection("jdbc:odbc:Demo","system","manager");
		System.out.println("Connection Eshtablished Successfully");
		}catch(Exception e)
		{
			System.err.println(e);
		}
	}
}