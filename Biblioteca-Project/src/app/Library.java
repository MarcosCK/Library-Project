package app;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books;
    
    
   
    public Library() {
       books = new ArrayList<>(); 
	}

	public void addBook(Book book) {
    	books.add(book);
    }
	
	public void borrowBook(Book book) {
	 if (books.contains(book) && !book.isBorrowed()) {
	     books.add(book);
	     book.isBorrowed();
	 	}else if (book.isBorrowed()) {
	 		System.out.println("O livro" + book.getTittle() + "Ja foi emprestado");
	 		}else {
	 			System.out.println("Ocorreu um erro, tente novamente");
	 				}
	}
	
   public void returnBook(Book book) {
	book.returnBook();
	books.remove(book);
   }
   
   public void diplayBooks() {
	 System.out.println("Livros disponiveis para emprestimos: ");
	 for (Book book : books) {
		 if(!book.isBorrowed()) {
			 System.out.println("- " + book.getTittle() + " by " +  book.getAuthor() + " emprestado " + book.isBorrowed());
		 }
	 }
   }
 
 
}
