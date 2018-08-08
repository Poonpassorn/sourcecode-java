
public class OrderItem {
	// Properties
	private int id;
	Book book;
	private int quantity;
	
	public OrderItem(int id, Book book, int quantity) {
		this.id = id;
		this.book = book;
		this.quantity = quantity;
	}

	public OrderItem(Book book, int quantity) {
		this.book = book;
		this.quantity = quantity;
	}

	
	

	

}
