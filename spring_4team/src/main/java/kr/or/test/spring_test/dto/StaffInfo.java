package kr.or.test.spring_test.dto;

public class StaffInfo {

	private String staffId;
	private String mainBusinessCode;
	private String staffState;
	private String staffPw;
	private String staffName;
	private String staffBirth;
	private String staffLevel;
	private String systemLevel;
	private String staffEmail;
	private String staffRegDate;
	private String staffPhone;
	private String staffAddr;
	private String staffEditDate;
	private String authoriser;
	public String getStaffId() {
		return staffId;
	}
	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}
	public String getMainBusinessCode() {
		return mainBusinessCode;
	}
	public void setMainBusinessCode(String mainBusinessCode) {
		this.mainBusinessCode = mainBusinessCode;
	}
	public String getStaffState() {
		return staffState;
	}
	public void setStaffState(String staffState) {
		this.staffState = staffState;
	}
	public String getStaffPw() {
		return staffPw;
	}
	public void setStaffPw(String staffPw) {
		this.staffPw = staffPw;
	}
	public String getStaffName() {
		return staffName;
	}
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}
	public String getStaffBirth() {
		return staffBirth;
	}
	public void setStaffBirth(String staffBirth) {
		this.staffBirth = staffBirth;
	}
	public String getStaffLevel() {
		return staffLevel;
	}
	public void setStaffLevel(String staffLevel) {
		this.staffLevel = staffLevel;
	}
	public String getSystemLevel() {
		return systemLevel;
	}
	public void setSystemLevel(String systemLevel) {
		this.systemLevel = systemLevel;
	}
	public String getStaffEmail() {
		return staffEmail;
	}
	public void setStaffEmail(String staffEmail) {
		this.staffEmail = staffEmail;
	}
	public String getStaffRegDate() {
		return staffRegDate;
	}
	public void setStaffRegDate(String staffRegDate) {
		this.staffRegDate = staffRegDate;
	}
	public String getStaffPhone() {
		return staffPhone;
	}
	public void setStaffPhone(String staffPhone) {
		this.staffPhone = staffPhone;
	}
	public String getStaffAddr() {
		return staffAddr;
	}
	public void setStaffAddr(String staffAddr) {
		this.staffAddr = staffAddr;
	}
	public String getStaffEditDate() {
		return staffEditDate;
	}
	public void setStaffEditDate(String staffEditDate) {
		this.staffEditDate = staffEditDate;
	}
	public String getAuthoriser() {
		return authoriser;
	}
	public void setAuthoriser(String authoriser) {
		this.authoriser = authoriser;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("StaffInfo [staffId=");
		builder.append(staffId);
		builder.append(", mainBusinessCode=");
		builder.append(mainBusinessCode);
		builder.append(", staffState=");
		builder.append(staffState);
		builder.append(", staffPw=");
		builder.append(staffPw);
		builder.append(", staffName=");
		builder.append(staffName);
		builder.append(", staffBirth=");
		builder.append(staffBirth);
		builder.append(", staffLevel=");
		builder.append(staffLevel);
		builder.append(", systemLevel=");
		builder.append(systemLevel);
		builder.append(", staffEmail=");
		builder.append(staffEmail);
		builder.append(", staffRegDate=");
		builder.append(staffRegDate);
		builder.append(", staffPhone=");
		builder.append(staffPhone);
		builder.append(", staffAddr=");
		builder.append(staffAddr);
		builder.append(", staffEditDate=");
		builder.append(staffEditDate);
		builder.append(", authoriser=");
		builder.append(authoriser);
		builder.append("]");
		return builder.toString();
	}
	
	
}
