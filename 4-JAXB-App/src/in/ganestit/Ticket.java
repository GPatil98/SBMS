package in.ganestit;

import javax.xml.bind.annotation.XmlRootElement; 

@XmlRootElement
public class Ticket {
	
	private Integer tId;
	private String status;
	private String from;
	private String to;
	private Double price;
	
	
	public Integer gettId() {
		return tId;
	}
	public void settId(Integer tId) {
		this.tId = tId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Ticket [tId=" + tId + ", status=" + status + ", from=" + from + ", to=" + to + ", price=" + price + "]";
	}
	

}
