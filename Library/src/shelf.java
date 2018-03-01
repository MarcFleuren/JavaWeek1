import java.util.ArrayList;

public class shelf {
	public ArrayList<libraryItem> shelf = new ArrayList<libraryItem>();
	
	public void addLibraryItem(libraryItem b) {

		this.shelf.add(b);

	}
	public void displayshelf() {
		for (libraryItem b : shelf) {

			System.out.println(b.title);
		}
	}
	public void searchGarage(String name) {
		for (libraryItem b : shelf) {
			if (b.title.equals(name)) {
				System.out.println(b.title);
						
			}
		}
	}
		
}
