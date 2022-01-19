package kr.or.test.spring_test.dto;

public class BusinessInfo {

	private String businessCode;
	private String mainBusinessCode;
	private String businessName;
	private String businessPartnerName;
	private int businessPartnerNum;
	private String businessPhoneNum;
	private String businessAddress;
	private String businessEmail;
	private String businessStaff;
	private String businessStaffNum;
	private String businessStaffEmail;
	private String businessSectors;
	private String businessStatus;
	private String businessMainAccount;
	private String businessAccountNumber;
	private String businessAccountHolder;
	private String staffId;
	private String regDate;
	public String getBusinessCode() {
		return businessCode;
	}
	public void setBusinessCode(String businessCode) {
		this.businessCode = businessCode;
	}
	public String getMainBusinessCode() {
		return mainBusinessCode;
	}
	public void setMainBusinessCode(String mainBusinessCode) {
		this.mainBusinessCode = mainBusinessCode;
	}
	public String getBusinessName() {
		return businessName;
	}
	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}
	public String getBusinessPartnerName() {
		return businessPartnerName;
	}
	public void setBusinessPartnerName(String businessPartnerName) {
		this.businessPartnerName = businessPartnerName;
	}
	public int getBusinessPartnerNum() {
		return businessPartnerNum;
	}
	public void setBusinessPartnerNum(int businessPartnerNum) {
		this.businessPartnerNum = businessPartnerNum;
	}
	public String getBusinessPhoneNum() {
		return businessPhoneNum;
	}
	public void setBusinessPhoneNum(String businessPhoneNum) {
		this.businessPhoneNum = businessPhoneNum;
	}
	public String getBusinessAddress() {
		return businessAddress;
	}
	public void setBusinessAddress(String businessAddress) {
		this.businessAddress = businessAddress;
	}
	public String getBusinessEmail() {
		return businessEmail;
	}
	public void setBusinessEmail(String businessEmail) {
		this.businessEmail = businessEmail;
	}
	public String getBusinessStaff() {
		return businessStaff;
	}
	public void setBusinessStaff(String businessStaff) {
		this.businessStaff = businessStaff;
	}
	public String getBusinessStaffNum() {
		return businessStaffNum;
	}
	public void setBusinessStaffNum(String businessStaffNum) {
		this.businessStaffNum = businessStaffNum;
	}
	public String getBusinessStaffEmail() {
		return businessStaffEmail;
	}
	public void setBusinessStaffEmail(String businessStaffEmail) {
		this.businessStaffEmail = businessStaffEmail;
	}
	public String getBusinessSectors() {
		return businessSectors;
	}
	public void setBusinessSectors(String businessSectors) {
		this.businessSectors = businessSectors;
	}
	public String getBusinessStatus() {
		return businessStatus;
	}
	public void setBusinessStatus(String businessStatus) {
		this.businessStatus = businessStatus;
	}
	public String getBusinessMainAccount() {
		return businessMainAccount;
	}
	public void setBusinessMainAccount(String businessMainAccount) {
		this.businessMainAccount = businessMainAccount;
	}
	public String getBusinessAccountNumber() {
		return businessAccountNumber;
	}
	public void setBusinessAccountNumber(String businessAccountNumber) {
		this.businessAccountNumber = businessAccountNumber;
	}
	public String getBusinessAccountHolder() {
		return businessAccountHolder;
	}
	public void setBusinessAccountHolder(String businessAccountHolder) {
		this.businessAccountHolder = businessAccountHolder;
	}
	public String getStaffId() {
		return staffId;
	}
	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BusinessInfo [businessCode=");
		builder.append(businessCode);
		builder.append(", mainBusinessCode=");
		builder.append(mainBusinessCode);
		builder.append(", businessName=");
		builder.append(businessName);
		builder.append(", businessPartnerName=");
		builder.append(businessPartnerName);
		builder.append(", businessPartnerNum=");
		builder.append(businessPartnerNum);
		builder.append(", businessPhoneNum=");
		builder.append(businessPhoneNum);
		builder.append(", businessAddress=");
		builder.append(businessAddress);
		builder.append(", businessEmail=");
		builder.append(businessEmail);
		builder.append(", businessStaff=");
		builder.append(businessStaff);
		builder.append(", businessStaffNum=");
		builder.append(businessStaffNum);
		builder.append(", businessStaffEmail=");
		builder.append(businessStaffEmail);
		builder.append(", businessSectors=");
		builder.append(businessSectors);
		builder.append(", businessStatus=");
		builder.append(businessStatus);
		builder.append(", businessMainAccount=");
		builder.append(businessMainAccount);
		builder.append(", businessAccountNumber=");
		builder.append(businessAccountNumber);
		builder.append(", businessAccountHolder=");
		builder.append(businessAccountHolder);
		builder.append(", staffId=");
		builder.append(staffId);
		builder.append(", regDate=");
		builder.append(regDate);
		builder.append("]");
		return builder.toString();
	}
	
	
}
