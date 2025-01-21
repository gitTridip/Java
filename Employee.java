package programming;

public class Employee implements Comparable<Employee> {
	private String eName;
	private int eId;
	private int eSalary;
	private int eAge;

	public Employee(String eName,int eId,int eSalary,int eAge) {
		this.eName=eName;
		this.eId=eId;
		this.eSalary=eSalary;
		this.eAge=eAge;
	}

	public String geteName() {
		return eName;
	}

	public int geteId() {
		return eId;
	}

	public int geteSalary() {
		return eSalary;
	}

	public int geteAge() {
		return eAge;
	}
	
	public void seteName(String eName) {
		this.eName = eName;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public void seteSalary(int eSalary) {
		this.eSalary = eSalary;
	}

	public void seteAge(int eAge) {
		this.eAge = eAge;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name:"+eName+", Id:"+eId+", Salary:"+eSalary+", Age:"+eAge;
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.eSalary-o.eSalary;
	}

}
