import java.sql.*;
class PSDemo
{
	public static void main(String args[])
	{
	try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@Rishi:1521:XE","system","manager");
		PreparedStatement pstmt=con.prepareStatement("insert into student values(?,?,?)");
		pstmt.setInt(1,Integer.parseInt(args[0]));
		pstmt.setString(2,args[1]);
		pstmt.setInt(3,Integer.parseInt(args[2]));
		pstmt.executeUpdate();
		System.out.println("One record dynamically inserted successfully");
		ResultSet rs=pstmt.executeQuery("select * from student"); 
		while(rs.next())
		{
			System.out.print(rs.getInt("rno")+"\t");
			System.out.print(rs.getString("name")+"\t");
			System.out.println(rs.getInt("marks"));
		}
	       }catch(Exception e)
	       {
		System.err.println(e);
	        }
	}
}