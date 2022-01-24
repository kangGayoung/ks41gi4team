package kr.or.test.spring_test.dto;

public class BillDto {
	
	//k0_invoice  AS ki 세금계산서
	
	//k4_tb_business AS kb 거래처등록
	 
	private String invoiceRegDate;
	private String invoiceType;
	private String businessCode;
	private String businessName;
	private String businessPartnerNum;
	private int invoicePrice;
	private int invoiceTax;
	private int TotalPrice;
	private String invoiceState;
	public String getInvoiceRegDate() {
		return invoiceRegDate;
	}
	public void setInvoiceRegDate(String invoiceRegDate) {
		this.invoiceRegDate = invoiceRegDate;
	}
	public String getInvoiceType() {
		return invoiceType;
	}
	public void setInvoiceType(String invoiceType) {
		this.invoiceType = invoiceType;
	}
	public String getBusinessCode() {
		return businessCode;
	}
	public void setBusinessCode(String businessCode) {
		this.businessCode = businessCode;
	}
	public String getBusinessName() {
		return businessName;
	}
	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}
	public String getBusinessPartnerNum() {
		return businessPartnerNum;
	}
	public void setBusinessPartnerNum(String businessPartnerNum) {
		this.businessPartnerNum = businessPartnerNum;
	}
	public int getInvoicePrice() {
		return invoicePrice;
	}
	public void setInvoicePrice(int invoicePrice) {
		this.invoicePrice = invoicePrice;
	}
	public int getInvoiceTax() {
		return invoiceTax;
	}
	public void setInvoiceTax(int invoiceTax) {
		this.invoiceTax = invoiceTax;
	}
	public int getTotalPrice() {
		return TotalPrice;
	}
	public void setTotalPrice(int totalPrice) {
		TotalPrice = totalPrice;
	}
	public String getInvoiceState() {
		return invoiceState;
	}
	public void setInvoiceState(String invoiceState) {
		this.invoiceState = invoiceState;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BillDto [invoiceRegDate=");
		builder.append(invoiceRegDate);
		builder.append(", invoiceType=");
		builder.append(invoiceType);
		builder.append(", businessCode=");
		builder.append(businessCode);
		builder.append(", businessName=");
		builder.append(businessName);
		builder.append(", businessPartnerNum=");
		builder.append(businessPartnerNum);
		builder.append(", invoicePrice=");
		builder.append(invoicePrice);
		builder.append(", invoiceTax=");
		builder.append(invoiceTax);
		builder.append(", TotalPrice=");
		builder.append(TotalPrice);
		builder.append(", invoiceState=");
		builder.append(invoiceState);
		builder.append("]");
		return builder.toString();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + TotalPrice;
		result = prime * result + ((businessCode == null) ? 0 : businessCode.hashCode());
		result = prime * result + ((businessName == null) ? 0 : businessName.hashCode());
		result = prime * result + ((businessPartnerNum == null) ? 0 : businessPartnerNum.hashCode());
		result = prime * result + invoicePrice;
		result = prime * result + ((invoiceRegDate == null) ? 0 : invoiceRegDate.hashCode());
		result = prime * result + ((invoiceState == null) ? 0 : invoiceState.hashCode());
		result = prime * result + invoiceTax;
		result = prime * result + ((invoiceType == null) ? 0 : invoiceType.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BillDto other = (BillDto) obj;
		if (TotalPrice != other.TotalPrice)
			return false;
		if (businessCode == null) {
			if (other.businessCode != null)
				return false;
		} else if (!businessCode.equals(other.businessCode))
			return false;
		if (businessName == null) {
			if (other.businessName != null)
				return false;
		} else if (!businessName.equals(other.businessName))
			return false;
		if (businessPartnerNum == null) {
			if (other.businessPartnerNum != null)
				return false;
		} else if (!businessPartnerNum.equals(other.businessPartnerNum))
			return false;
		if (invoicePrice != other.invoicePrice)
			return false;
		if (invoiceRegDate == null) {
			if (other.invoiceRegDate != null)
				return false;
		} else if (!invoiceRegDate.equals(other.invoiceRegDate))
			return false;
		if (invoiceState == null) {
			if (other.invoiceState != null)
				return false;
		} else if (!invoiceState.equals(other.invoiceState))
			return false;
		if (invoiceTax != other.invoiceTax)
			return false;
		if (invoiceType == null) {
			if (other.invoiceType != null)
				return false;
		} else if (!invoiceType.equals(other.invoiceType))
			return false;
		return true;
	}

	
	
}
