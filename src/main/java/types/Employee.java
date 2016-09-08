package types;

import java.util.Date;
import java.util.List;

public class Employee {

	private String empName;
	private String department;
	private Date dob;
	private List<String> skills;
	
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public List<String> getSkills() {
		return skills;
	}
	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", department=" + department + ", dob=" + dob + ", skills=" + skills
				+ "]";
	}	
}
