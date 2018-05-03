import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class DisplayResultSet {

	public static void main(String[] args) {
		try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","manager");
		System.out.println("Connection eshtablished successfully");
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("SELECT * FROM student");
		ResultSetMetaData rm=rs.getMetaData();
		int n=rm.getColumnCount();
		for(int i=1;i<=n;i++)
		{
			System.out.print(rm.getColumnName(i)+"\t");
		}
		System.out.println("\n");
		while(rs.next())
		{
			System.out.print(rs.getInt("RNO")+"\t");
			System.out.print(rs.getString("NAME")+"\t");
			System.out.println(rs.getInt("MARKS"));
		}
		}catch(Exception e)
		{
			System.err.println(e);
		}
	}
}
