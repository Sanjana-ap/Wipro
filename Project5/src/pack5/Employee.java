package pack5;

class Emp {
	private int employee_id;
	private String employee_name;
	private double employee_salary;
	
	public void set_id(int emp_id) {
		this.employee_id=emp_id;
	}
	public void set_name(String name) {
		this.employee_name=name;
	}
	public void set_salary(double salary) {
		this.employee_salary=salary;
	}
	public int get_id() {
		return this.employee_id;
	}
	public String get_name() {
		return this.employee_name;
	}
	public double get_salary() {
		return this.employee_salary;
	}
}
public class Employee{
	public static void main(String args[]) {
		Emp obj = new Emp();
		obj.set_id(25865);
		obj.set_name("Sanjana");
		obj.set_salary(100000);
		int id = obj.get_id();
		String n = obj.get_name();
		double sal=obj.get_salary();
		System.out.println("Employee Id is : "+id);
		System.out.println("Employee name is : "+n);
		System.out.println("Employee salary is : "+sal);
		
	}
	
}