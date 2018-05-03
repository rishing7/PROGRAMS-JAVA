import java.io.*;
class ReadingIntoFile
{
	public static void main(String args[])
	{
		try{
			FileInputStream fis=new FileInputStream(args[0]);
			int n=fis.available();
			byte[] b=new byte[n];
			fis.read(b);
			FileOutputStream fos=new FileOutputStream(args[1],true);
			fos.write(b);
		     }catch(Exception e)
			{
				System.out.println(e);
			}
	}
}