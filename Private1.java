class Private2
{
	void show()
	{
		System.out.println("Core java");
	}
}
class Private1 extends Private2
{
	private void show()
	{
		System.out.println("Advanced java");
	}
	public static void main(String args[])
	{
		Private1 pv=new Private1();
		pv.show();	
	}
}