package kr.or.test.spring_test.dto;

public class OrderList {
	private String orderCode;
	private String orderRegTime;
	private String orderCompleteTime;
	private String goodsName;
	private String goodsWeight;
	private String goodsUnit;
	private String salesperson;
	private int purchasePrice;
	private int goodsQuantity;
	private String situation;
	private String staffId2;
	public String getOrderCode() {
		return orderCode;
	}
	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}
	public String getOrderRegTime() {
		return orderRegTime;
	}
	public void setOrderRegTime(String orderRegTime) {
		this.orderRegTime = orderRegTime;
	}
	public String getOrderCompleteTime() {
		return orderCompleteTime;
	}
	public void setOrderCompleteTime(String orderCompleteTime) {
		this.orderCompleteTime = orderCompleteTime;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public String getGoodsWeight() {
		return goodsWeight;
	}
	public void setGoodsWeight(String goodsWeight) {
		this.goodsWeight = goodsWeight;
	}
	public String getGoodsUnit() {
		return goodsUnit;
	}
	public void setGoodsUnit(String goodsUnit) {
		this.goodsUnit = goodsUnit;
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
	public int getGoodsQuantity() {
		return goodsQuantity;
	}
	public void setGoodsQuantity(int goodsQuantity) {
		this.goodsQuantity = goodsQuantity;
	}
	public String getSituation() {
		return situation;
	}
	public void setSituation(String situation) {
		this.situation = situation;
	}
	public String getStaffId2() {
		return staffId2;
	}
	public void setStaffId2(String staffId2) {
		this.staffId2 = staffId2;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("OrderList [orderCode=");
		builder.append(orderCode);
		builder.append(", orderRegTime=");
		builder.append(orderRegTime);
		builder.append(", orderCompleteTime=");
		builder.append(orderCompleteTime);
		builder.append(", goodsName=");
		builder.append(goodsName);
		builder.append(", goodsWeight=");
		builder.append(goodsWeight);
		builder.append(", goodsUnit=");
		builder.append(goodsUnit);
		builder.append(", salesperson=");
		builder.append(salesperson);
		builder.append(", purchasePrice=");
		builder.append(purchasePrice);
		builder.append(", goodsQuantity=");
		builder.append(goodsQuantity);
		builder.append(", situation=");
		builder.append(situation);
		builder.append(", staffId2=");
		builder.append(staffId2);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
