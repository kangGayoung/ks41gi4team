package kr.or.test.spring_test.dto;

public class Warehousing {

	private String bringInCode;
	private String receiveOrderCode;
	private String orderCode;
	private String mainBusinessCode;
	private String staffId;
	private String stNum;
	private String businessCode;
	private String barcode;
	private String goodsQuantity;
	private String mSum;
	public String getBringInCode() {
		return bringInCode;
	}
	public void setBringInCode(String bringInCode) {
		this.bringInCode = bringInCode;
	}
	public String getReceiveOrderCode() {
		return receiveOrderCode;
	}
	public void setReceiveOrderCode(String receiveOrderCode) {
		this.receiveOrderCode = receiveOrderCode;
	}
	public String getOrderCode() {
		return orderCode;
	}
	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}
	public String getMainBusinessCode() {
		return mainBusinessCode;
	}
	public void setMainBusinessCode(String mainBusinessCode) {
		this.mainBusinessCode = mainBusinessCode;
	}
	public String getStaffId() {
		return staffId;
	}
	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}
	public String getStNum() {
		return stNum;
	}
	public void setStNum(String stNum) {
		this.stNum = stNum;
	}
	public String getBusinessCode() {
		return businessCode;
	}
	public void setBusinessCode(String businessCode) {
		this.businessCode = businessCode;
	}
	public String getBarcode() {
		return barcode;
	}
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	public String getGoodsQuantity() {
		return goodsQuantity;
	}
	public void setGoodsQuantity(String goodsQuantity) {
		this.goodsQuantity = goodsQuantity;
	}
	public String getmSum() {
		return mSum;
	}
	public void setmSum(String mSum) {
		this.mSum = mSum;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Warehousing [bringInCode=");
		builder.append(bringInCode);
		builder.append(", receiveOrderCode=");
		builder.append(receiveOrderCode);
		builder.append(", orderCode=");
		builder.append(orderCode);
		builder.append(", mainBusinessCode=");
		builder.append(mainBusinessCode);
		builder.append(", staffId=");
		builder.append(staffId);
		builder.append(", stNum=");
		builder.append(stNum);
		builder.append(", businessCode=");
		builder.append(businessCode);
		builder.append(", barcode=");
		builder.append(barcode);
		builder.append(", goodsQuantity=");
		builder.append(goodsQuantity);
		builder.append(", mSum=");
		builder.append(mSum);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
