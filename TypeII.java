import java.sql.*;
class TypeII
{
	public static void main(String args[])
	{
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:oci8@XE","system","manager");
			System.out.println("Connection Eshtablished Successfully");
		}catch(Exception e)
		{
			System.err.println(e);
		}
	}
}