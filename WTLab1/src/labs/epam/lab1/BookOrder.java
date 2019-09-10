package labs.epam.lab1;

import java.util.Random;

public class BookOrder {
	
	private final int MINORDERID = 100000;
	private final int MAXORDERID = 999999;
	
	private int orderID;
	private Book book;
	private LibraryClient client;
	
	public BookOrder(int orderID, Book book, LibraryClient client) {
		this.orderID = orderID;
		this.book = book;
		this.client = client;
	}
	
	public BookOrder(Book book, LibraryClient client) {
		book.addOrder(this);
		Random rnd = new Random(System.currentTimeMillis());
		orderID = MINORDERID + rnd.nextInt(MAXORDERID - MINORDERID + 1); // TODO: add checking for existing order
		this.client = client;
	}
	
	public void cancelOrder() {
		book.cancelOrder(this);
	}

	public int getOrderID() {
		return orderID;
	}

	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public LibraryClient getClient() {
		return client;
	}

	public void setClient(LibraryClient client) {
		this.client = client;
	}
}
