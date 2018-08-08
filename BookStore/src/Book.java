
public class Book {

	// Properties
	private String name;
	private double price;

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}

//Builder pattern
class BookBuilder {
	private Book book = new Book();

	public BookBuilder setName(String name) {
		book.setName(name);
		return this;
	}
	public BookBuilder setPrice(double price) {
		book.setPrice(8);
		return this;
	}
	public Book build() {
		return book;
	}

}

class BookStore {
	public static void main(String[] args) {
		Book book = new BookBuilder().setName("First Book").setPrice(8).build();

	}
}