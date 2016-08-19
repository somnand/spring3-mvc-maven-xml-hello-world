package types;

import java.util.Date;
import java.util.Set;

public class AdvancedStudent extends Student {

	private Long mobileNo;
	private Date dob;
	private Set<String> skillSet;

	public Long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Set<String> getSkillSet() {
		return skillSet;
	}

	public void setSkillSet(Set<String> skillSet) {
		this.skillSet = skillSet;
	}
}
