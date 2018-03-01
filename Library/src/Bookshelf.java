import java.util.ArrayList;
import java.util.Iterator;

public class Bookshelf {

	public ArrayList<Book> bookshelf = new ArrayList<Book>();
	public int Ref;

	public Bookshelf(int Ref) {
		this.Ref = Ref;
		
	}

	public void storeBook(Book b) {

		this.bookshelf.add(b);

	}

	public void addBook(Book b) {

		this.bookshelf.add(b);

	}

	public void displayBookshelf() {
		for (Book b : bookshelf) {

			System.out.println(b.name + " by " + b.author);
		}
	}

	public void searchGarage(String name) {
		for (Book b : bookshelf) {
			if (b.name.equals(name)) {
				System.out.println(b.name + " " + b.author);
						
			}
		}
	}
		

	
}

