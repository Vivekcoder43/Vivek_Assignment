package problem2;

public class Book_model {
	private String name;
	private Author author;
	private double price;
	private int qty=0;
	public Book_model(String name, Author author, double price) {
		this.name = name;
		this.author = author;
		this.price = price;
	}
	public Book_model(String name, Author author, double price, int qty) {
		super();
		this.name = name;
		this.author = author;
		this.price = price;
		this.qty = qty;
	}
	public double getPrice() {
		return this.price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQty() {
		return this.qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public String getName() {
		return this.name;
	}
	public Author getAuthor() {
		return this.author;
	}
	@Override
	public String toString() {
		return "book_model [name=" + name + ", author=" + author.toString()+ ", price=" + price + ", qty=" + qty + "]";
	}
	
	

}
