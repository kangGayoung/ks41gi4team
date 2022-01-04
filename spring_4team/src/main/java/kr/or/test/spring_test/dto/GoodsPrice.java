package kr.or.test.spring_test.dto;

public class GoodsPrice {

	private String barcode;
	private String cateByGoodsCode;
	private String mainBusinessCode;
	private String contractDetailCode;
	private String businessCode;
	private String goodsCode;
	private String staffId;
	private String registrationTime;
	private String manufacturer;
	private String salesperson;
	private int purchasePrice;
	private int VAT;
	private int goodsSupplyPrice;
	private int sellingPrice;
	private int margin;
	private String use;
	public String getBarcode() {
		return barcode;
	}
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	public String getCateByGoodsCode() {
		return cateByGoodsCode;
	}
	public void setCateByGoodsCode(String cateByGoodsCode) {
		this.cateByGoodsCode = cateByGoodsCode;
	}
	public String getMainBusinessCode() {
		return mainBusinessCode;
	}
	public void setMainBusinessCode(String mainBusinessCode) {
		this.mainBusinessCode = mainBusinessCode;
	}
	public String getContractDetailCode() {
		return contractDetailCode;
	}
	public void setContractDetailCode(String contractDetailCode) {
		this.contractDetailCode = contractDetailCode;
	}
	public String getBusinessCode() {
		return businessCode;
	}
	public void setBusinessCode(String businessCode) {
		this.businessCode = businessCode;
	}
	public String getGoodsCode() {
		return goodsCode;
	}
	public void setGoodsCode(String goodsCode) {
		this.goodsCode = goodsCode;
	}
	public String getStaffId() {
		return staffId;
	}
	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}
	public String getRegistrationTime() {
		return registrationTime;
	}
	public void setRegistrationTime(String registrationTime) {
		this.registrationTime = registrationTime;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getSalesperson() {
		return salesperson;
	}
	public void setSalesperson(String salesperson) {
		this.salesperson = salesperson;
	}
	public int getPurchasePrice() {
		return purchasePrice;
	}
	public void setPurchasePrice(int purchasePrice) {
		this.purchasePrice = purchasePrice;
	}
	public int getVAT() {
		return VAT;
	}
	public void setVAT(int vAT) {
		VAT = vAT;
	}
	public int getGoodsSupplyPrice() {
		return goodsSupplyPrice;
	}
	public void setGoodsSupplyPrice(int goodsSupplyPrice) {
		this.goodsSupplyPrice = goodsSupplyPrice;
	}
	public int getSellingPrice() {
		return sellingPrice;
	}
	public void setSellingPrice(int sellingPrice) {
		this.sellingPrice = sellingPrice;
	}
	public int getMargin() {
		return margin;
	}
	public void setMargin(int margin) {
		this.margin = margin;
	}
	public String getUse() {
		return use;
	}
	public void setUse(String use) {
		this.use = use;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("GoodsPrice [barcode=");
		builder.append(barcode);
		builder.append(", cateByGoodsCode=");
		builder.append(cateByGoodsCode);
		builder.append(", mainBusinessCode=");
		builder.append(mainBusinessCode);
		builder.append(", contractDetailCode=");
		builder.append(contractDetailCode);
		builder.append(", businessCode=");
		builder.append(businessCode);
		builder.append(", goodsCode=");
		builder.append(goodsCode);
		builder.append(", staffId=");
		builder.append(staffId);
		builder.append(", registrationTime=");
		builder.append(registrationTime);
		builder.append(", manufacturer=");
		builder.append(manufacturer);
		builder.append(", salesperson=");
		builder.append(salesperson);
		builder.append(", purchasePrice=");
		builder.append(purchasePrice);
		builder.append(", VAT=");
		builder.append(VAT);
		builder.append(", goodsSupplyPrice=");
		builder.append(goodsSupplyPrice);
		builder.append(", sellingPrice=");
		builder.append(sellingPrice);
		builder.append(", margin=");
		builder.append(margin);
		builder.append(", use=");
		builder.append(use);
		builder.append("]");
		return builder.toString();
	}
	
}
