package kr.or.test.spring_test.dto;

public class PurchaseLookupList { 
	//tb_order (발주요청후거래처승인 ; tb_transactionstatement(거래명세서(한줄)
	private String businessName; //거래처명 
	private int lastResidual; //이전금액(tb없음)
	private int goodsSupplyPrice;// 매입공급가액
	private int vat; //매입세액
	private int purchasePrice; //매입단가(포함)
	private int totalAmount; //지급금액
	private int reversePayment;//수정금액(tb없음)
	private int residualPayment; //잔여지급금액 (tb에 없음)
	private String dealDate; //최종거래일
	
	public String getBusinessName() {
		return businessName;
	}
	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}
	public int getLastResidual() {
		return lastResidual;
	}
	public void setLastResidual(int lastResidual) {
		this.lastResidual = lastResidual;
	}
	public int getGoodsSupplyPrice() {
		return goodsSupplyPrice;
	}
	public void setGoodsSupplyPrice(int goodsSupplyPrice) {
		this.goodsSupplyPrice = goodsSupplyPrice;
	}
	public int getVAT() {
		return vat;
	}
	public void setVAT(int vat) {
		vat =vat;
	}
	public int getPurchasePrice() {
		return purchasePrice;
	}
	public void setPurchasePrice(int purchasePrice) {
		this.purchasePrice = purchasePrice;
	}
	public int getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}
	public int getReversePayment() {
		return reversePayment;
	}
	public void setReversePayment(int reversePayment) {
		this.reversePayment = reversePayment;
	}
	public int getResidualPayment() {
		return residualPayment;
	}
	public void setResidualPayment(int residualPayment) {
		this.residualPayment = residualPayment;
	}
	public String getDealDate() {
		return dealDate;
	}
	public void setDealDate(String dealDate) {
		this.dealDate = dealDate;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PurchaseLookupList [businessName=");
		builder.append(businessName);
		builder.append(", lastResidual=");
		builder.append(lastResidual);
		builder.append(", goodsSupplyPrice=");
		builder.append(goodsSupplyPrice);
		builder.append(", vat=");
		builder.append(vat);
		builder.append(", purchasePrice=");
		builder.append(purchasePrice);
		builder.append(", totalAmount=");
		builder.append(totalAmount);
		builder.append(", reversePayment=");
		builder.append(reversePayment);
		builder.append(", residualPayment=");
		builder.append(residualPayment);
		builder.append(", dealDate=");
		builder.append(dealDate);
		builder.append("]");
		return builder.toString();
	}
	

	

	
	
}
