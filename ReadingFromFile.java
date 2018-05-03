import java.io.*;
class ReadingFromFile
{
	public static void main(String args[])
	{
		try{
			FileInputStream fis=new FileInputStream(args[0]);
			int n=fis.available();
			byte[] b=new byte[n];
			int x=fis.read(b);
			String s=new String(b);
			System.out.println(s);
		     }catch(Exception e)
		     {
			System.out.println(e);
		     }
	}
}