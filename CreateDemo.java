import java.sql.*;
class CreateDemo 
{
	public static void main(String args[])
	{
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","manager");
			//System.out.println("Connection Eshtablished Successfully");
			Statement stmt=con.createStatement();
			//stmt.execute("create table student(rno number(3),name varchar2(10),marks number(3))");
			//System.out.println("Table created successfully");	
			//stmt.executeUpdate("insert into student values(1,'aaa',99)");
			//stmt.executeUpdate("insert into student values(2,'bbb',98)");
			//stmt.executeUpdate("insert into student values(3,'ccc',97)");
			//System.out.println("One record inserted successfully");
			ResultSet rs=stmt.executeQuery("select * from student");
			while(rs.next())	
			{
				System.out.print(rs.getInt("rno")+"\t");
				System.out.print(rs.getString("name")+"\t");
				System.out.println(rs.getInt("marks")+"\t");
			}	
		     }catch(Exception e)
		{
			System.err.println(e);
		}
	}
}