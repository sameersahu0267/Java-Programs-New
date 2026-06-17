
public class A1Employee {
	int empId, mSalary;
	String empName;
	
	A1Employee(int empId, int mSalary, String empName){
		this.empId = empId;
		this.mSalary = mSalary;
		this.empName = empName;
	}
	
	void calcAnnualSalary() {
		double aSalary = mSalary * 12;
		System.out.println(empId + " " + empName + " " + aSalary);
	}
	
	public static void main(String[] args) {
		
		A1Employee e1 = new A1Employee(101, 30000, "Sameer");
		e1.calcAnnualSalary();
		A1Employee e2 = new A1Employee(102, 25000, "Gopal");
		e2.calcAnnualSalary();

	}

}
