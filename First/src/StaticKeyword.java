class Employee{
	
	int empid;
	int empsalary;
	static String ceo;
	
	static {//executed when you load a class
		ceo ="Jad";
		System.out.println("in static");
	}
	
	public Employee() {//executed when you create an object
		empid = 9;
		empsalary = 80000;
		System.out.println("in const");
	}
	
	public void show() {
		System.out.println(empid + " : " + empsalary + " : " +ceo);
	}
}
public class StaticKeyword {
	// static keyword is there because we don't need an object to call main method
	public static void main(String args[]) {
	
	Employee Sid = new Employee();	
	Employee.ceo = "Padm";
	Sid.empid = 25;
	Sid.empsalary = 45000;
	
	Employee Abhi = new Employee();	
	Employee.ceo = "Bala";
	Abhi.empid = 15;
	Abhi.empsalary = 75000;
	
	Employee.ceo = "Jadhav"; // to access a static variable we don't need object
	
	Sid.show();
	Abhi.show();
	
	}
}
