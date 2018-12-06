
public class EncapsulationDemo {

	public static void main(String[] args) {
		Emp e1 = new Emp();
		e1.setEmpId(3);
		e1.setEmpName("Navin");
		
		
		
		System.out.println(e1.getEmpName());
	}

}
class Emp
{
	private int empId;
	private string empName;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public string getEmpName() {
		return empName;
	}
	public void setEmpName(string empName) {
		this.empName = empName;
	}
	
	
	
}
