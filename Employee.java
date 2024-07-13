

public class Employee {
	int id;
	String name;
	double basic;
	double da;
	double hra;
	double netSalary;
	
	void getdata(int eid, String ename, double b, double d, double hra)
	{
		id=eid;
		name=ename;
		basic=b;
		da=d;
		this.hra=hra;
	}
	void calculate()
	{
		netSalary = basic+da+hra;
	}
	void printSalary()
	{
		System.out.println("Employee id: "+id);
		System.out.println("Name: "+name);
		System.out.println("Basic Salary: Rs. "+basic);
		System.out.println("Dearness Allowance: Rs. "+da);
		System.out.println("House Rent Allowance: Rs. "+hra);
		System.out.println("-------------------------------");
		System.out.println("Net Salary : Rs. "+netSalary);
	}
}