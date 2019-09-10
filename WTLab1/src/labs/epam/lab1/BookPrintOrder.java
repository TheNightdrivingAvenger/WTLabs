package labs.epam.lab1;

import java.util.Random;

public class BookPrintOrder {

	private final int MINORDERID = 1000000;
	private final int MAXORDERID = 1999999;
	
	private int orderID;
	private Book book;
	private LibraryClient client;
	private int startPage;
	private int endPage;
	
	public BookPrintOrder(int orderID, Book book, int startPage, int endPage, LibraryClient client) {
		this.orderID = orderID;
		this.book = book;
		this.startPage = startPage;
		this.endPage = endPage;
		this.client = client;
	}
	
	public BookPrintOrder(Book book, int startPage, int endPage, LibraryClient client) {
		book.addPrintOrder(this);
		this.startPage = startPage;
		this.endPage = endPage;
		Random rnd = new Random(System.currentTimeMillis());
		orderID = MINORDERID + rnd.nextInt(MAXORDERID - MINORDERID + 1);// TODO: add checking for existing order
		this.client = client;
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

	public int getStartPage() {
		return startPage;
	}

	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}

	public int getEndPage() {
		return endPage;
	}

	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}

	public void cancelOrder() {
		book.cancelPrintOrder(this);
	}
}
