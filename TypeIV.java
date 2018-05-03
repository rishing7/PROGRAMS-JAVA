import java.sql.*;
class TypeIV
{

	public static void main(String args[])
	{
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@Rishi:1521:XE","system","manager");
			System.err.println("Connection Eshtablished Successfully");
		   }catch(Exception e)
		   {
			System.err.println(e);
		   }
	} 
}