class Emp
{
	int empNo;
	float salary;
	Emp(int empNo,float salary)
	{
		this.empNo=empNo;
		this.salary=salary;
	}
	public static void main(String args[])
	{
		Emp e1=new Emp(101,5000);
		System.out.println(e1.empNo+"\t"+e1.salary);
		Emp e2=new Emp(102,6000);
		System.out.println(e2.empNo+"\t"+e2.salary);
	}
}