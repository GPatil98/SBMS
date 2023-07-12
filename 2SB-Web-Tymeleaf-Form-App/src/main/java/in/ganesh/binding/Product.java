package in.ganesh.binding;



public class Product {
	
	private Integer ptId;
	private String pName;
	private Double pPrice;
	public Integer getPtId() {
		return ptId;
	}
	public void setPtId(Integer ptId) {
		this.ptId = ptId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public Double getpPrice() {
		return pPrice;
	}
	public void setpPrice(Double pPrice) {
		this.pPrice = pPrice;
	}
	@Override
	public String toString() {
		return "Product [ptId=" + ptId + ", pName=" + pName + ", pPrice=" + pPrice + "]";
	}
	

}
