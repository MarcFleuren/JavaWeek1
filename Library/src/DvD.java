
class mediaResources extends libraryItem {
	public String type;
	public int length;

	public String getType() {
		return type;
	}

	public int getLength() {
		return length;
	}

	public mediaResources(String language, String genre, String publisher, String title, String type, int length) {
		super(language, genre, publisher, title);
		this.type = type;
		this.length = length;
	}

}
