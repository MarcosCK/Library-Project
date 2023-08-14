package app;

import java.util.ArrayList;
import java.util.List;

public class User {

    private List<Book> books;
	
	private String name;

	public User(String name) {
		this.name = name;
		books = new ArrayList<>();
	}
	
	
	public void borrowBook(Book book) {
	 if (books.contains(book) && !book.isBorrowed()) {
	     books.add(book);
	 } else if (book.isBorrowed()) {
		System.out.println("O livro" + book.getTittle() + "Ja foi emprestado por outra pessoa" );
	} else {
		System.out.println("Erro inesperado, tente novamente");
	}
	}
	

	
	public void returnBook(Book book) {
	   books.remove(book);
	   book.returnBook();
	}
	
	
	
	

	public String getName() {
		return name;
	}

	
}
