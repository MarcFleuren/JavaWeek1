class Book extends libraryItem {
	
	public String author;
	public int ID;

	public Book(String language, String genre ,String publisher ,String title, String author, int ID ) {
		super (language,genre,publisher,title);
		this.author = author;
		this.ID = ID;
	}

//	public String toString() {
//		return this.name + " " + this.author + " " + this.ID + " " + this.genre;
//
//	}
//	public void putInBookshelf() {
//		for(bookshelf)
//		if (this.name == Bookshelf.Ref)
//		
//		
//	}
}