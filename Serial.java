import java.io.*;
class Emp  implements Serializable
{
	int empNo;
	float salary;
	Emp(int empNo,float salary)
	{
		this.empNo=empNo;
		this.salary=salary;
	}
}
class Serial
{
	public static void main(String args[])
	{
	     try{
		Emp e1=new Emp(100,5000);
		Emp e2=new Emp(101,6000);
		FileOutputStream fos=new FileOutputStream(args[0]);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(e1);
		oos.writeObject(e2);
		fos.close();
		oos.close();
		FileInputStream fis=new FileInputStream(args[0]);
		ObjectInputStream ois=new ObjectInputStream(fis);
		Emp e3=(Emp)ois.readObject();
		Emp e4=(Emp)ois.readObject();
		System.out.println(e3.empNo+"\t"+e3.salary+"\n"+e4.empNo+"\t"+e4.salary);
	         }
	    catch(Exception e)
		{
			System.err.println(e);
		}
	}
}
