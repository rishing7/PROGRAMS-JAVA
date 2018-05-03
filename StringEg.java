class StringEg
{
	public static void main(String args[])
	{
		char[] ch={'H','E','L','L','O'};
		String s1=new String(ch);
		System.out.println(s1);
		String s2=s1.concat("Rishi");
		System.out.println(s2);
		char[] ch1=s2.toCharArray();
		for(char ch2:ch1)
		System.out.println(ch2);
	}
}