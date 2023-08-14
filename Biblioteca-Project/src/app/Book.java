package app;

public class Book {

	private String tittle;
	private String author;
	private boolean borrowed;

	public Book(String tittle, String author) {
		this.tittle = tittle;
		this.author = author;
	}
	public String getTittle() {
		return tittle;
	}
	public void setTittle(String tittle) {
		this.tittle = tittle;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public boolean isBorrowed() {
		return borrowed;
	}	
	public void returnBook() {
		this.borrowed = false;
	}
	
	
}
