class RuntimePoly
{
	void show()
	{
		System.out.println("RuntimePoly class");
	}
}
class Run extends RuntimePoly
{
	void show()
	{
		System.out.println("Overridden method in the subclass");
	}
	public static void main(String args[])
	{
		RuntimePoly rp=new Run();
		rp.show();
	}
}
