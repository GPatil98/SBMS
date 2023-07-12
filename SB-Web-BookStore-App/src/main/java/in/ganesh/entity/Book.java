package in.ganesh.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="BOOL_DTLS")
public class Book {
	
	@Id
	@GeneratedValue
	@Column(name="BOOK_ID")
	private Integer id;
	
	@Column(name="BOOK_NAME")
	public String name;
	
	@Column(name="BOOK_PRICE")
	public String price;
	
	@Column(name="BOOK_AUTHOD")
	public String author;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	

}
