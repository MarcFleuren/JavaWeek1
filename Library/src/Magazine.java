
class Magazine extends libraryItem {
	public int issue;
	public int date;

	public Magazine(String language, String genre, String publisher, String title, int issue, int date) {
		super(language, genre, publisher, title);
		this.issue = issue;
		this.date = date;

	}

	public int getIssue() {
		return issue;
	}

	public int getDate() {
		return date;
	}

}
