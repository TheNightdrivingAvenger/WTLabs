package labs.epam.lab1;

public class Review {
	private String contents;
	private Author reviewAuthor;
	
	public Author getReviewAuthor() {
		return reviewAuthor;
	}

	public void setReviewAuthor(Author reviewAuthor) {
		this.reviewAuthor = reviewAuthor;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public Review(String contents) {
		this.contents = contents;
		this.reviewAuthor = new Author();
	}
	
	public Review(Author author, String contents) {
		this.contents = contents;
		this.reviewAuthor = author;
	}
}
