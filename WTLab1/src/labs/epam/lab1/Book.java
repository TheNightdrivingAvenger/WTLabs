package labs.epam.lab1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Book {
	private Author author;
	private String name;
	private ArrayList<Review> reviews;
	private ArrayList<BookOrder> orders;
	private ArrayList<BookPrintOrder> printOrders;
	

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Review> getReviews() {
		return reviews;
	}

	public void addReview(Review review) {
		reviews.add(review);
	}
	
	public void removeReview(Review review) {
		reviews.remove(review);
	}

	public List<BookOrder> getOrders() {
		return orders;
	}

	public void setOrders(ArrayList<BookOrder> orders) {
		this.orders = orders;
	}

	public List<BookPrintOrder> getPrintOrders() {
		return printOrders;
	}

	public void setPrintOrders(ArrayList<BookPrintOrder> printOrders) {
		this.printOrders = printOrders;
	}

	public Book(String name) {
		this.name = name;
		
		author = new Author();
		reviews = new ArrayList<Review>();
		orders = new ArrayList<BookOrder>();
		printOrders = new ArrayList<BookPrintOrder>();
	}
	
	public Book(Author author, String name) {
		this.author = author;
		this.name = name;
		
		reviews = new ArrayList<Review>();
		orders = new ArrayList<BookOrder>();
		printOrders = new ArrayList<BookPrintOrder>();
	}
	
	public Book(Author author, String name, List<Review> reviews) {
		this.author = author;
		this.name = name;
		
		this.reviews = new ArrayList<Review>(reviews.size());
		orders = new ArrayList<BookOrder>();
		printOrders = new ArrayList<BookPrintOrder>();
		Collections.copy(this.reviews, reviews);
	}
	
	public void addOrder(BookOrder order) {
		orders.add(order);
	}
	
	public void cancelOrder(BookOrder order) {
		orders.remove(order);
	}
	
	public void addPrintOrder(BookPrintOrder printOrder) {
		printOrders.add(printOrder);
	}
	
	public void cancelPrintOrder(BookPrintOrder printOrder) {
		printOrders.remove(printOrder);
	}
}
