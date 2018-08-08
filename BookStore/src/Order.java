import java.util.Date;

class Order2 {
	// Properties
	private int id;
	double totalPrice;
	double discountPrice;
	double netPrice;
	private OrderItem[] items = new OrderItem[2];
	private Date orderDate;
	private int counter;

	void addItem(OrderItem orderItem1) {
		items[counter++] = orderItem1;

	}

	public void calculateTotalPrice() {
		for (OrderItem r : items) {
			totalPrice += r.book.getPrice();
		}
		netPrice = totalPrice - discountPrice;
	}

}

public class Order {
	public static void main(String[] args) {

		Book book1 = new Book();
		book1.setName("first book");
		book1.setPrice(8);

		Book book2 = new Book();
		book2.setName("Secound book");
		book2.setPrice(8);

		OrderItem orderItem1 = new OrderItem(book1, 1);
		OrderItem orderItem2 = new OrderItem(book2, 1);

		Order2 order = new Order2();
		order.addItem(orderItem1);
		order.addItem(orderItem2);
		order.calculateTotalPrice();

		System.out.println(order.totalPrice);// 16
		System.out.println(order.discountPrice);// 0
		System.out.println(order.netPrice);// 16

	}

}