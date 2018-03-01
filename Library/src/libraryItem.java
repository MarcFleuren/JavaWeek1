
public abstract class libraryItem {
	public String language;

	public String genre;
	public String publisher;
	public String title;

	public libraryItem(String language, String genre, String publisher, String title) {
		this.language = language;
		this.genre = genre;
		this.publisher = publisher;
		this.title = title;

	}

	public String getLanguage() {
		return language;
	}

	public String getGenre() {
		return genre;
	}

	public String getPublisher() {
		return publisher;
	}

	public String getTitle() {
		return title;
	}
}
