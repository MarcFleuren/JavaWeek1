
public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bookshelf One = new Bookshelf(1);
		Bookshelf Two = new Bookshelf(2);
		
		
		Book a = new Book("Lord of the Rings","Fantasy",1426,"Tolkien");
		Book b = new Book("Lord of the Flies","Horror",1427,"William Goulding");
		Book c = new Book("Animal Farm","Animals",1191,"George Orwell");
		Book d = new Book("1984","Thriller",995,"George Orwell");
		Book e = new Book("Playboy","Fantasy",32,"Hugh Hefner");
		Book f = new Book("Coding for Beginners","Educational",1999,"Elliot Womack");
		Book g = new Book("Jaffa Cake in under 5 seconds : My Story","Auto Biography",1134,"Matt Hunt");
		Book h = new Book("Narnia","Fantasy",1432,"C.K.Lewis");
		Book i = new Book("Harry Potter","Fantasy",687,"J.K.Rowling");
		Book j = new Book("Mein Kampf","Historical",2354,"Adolf Hitler");
		Book k = new Book("The Very Hungry Caterpillar","Kids",1226,"Eric Carle");
		Book l = new Book("Its Ok to Be Gay","Teen",1212,"Charlie Reilly");
		Book m = new Book("Good Hookers and Where to Find Them","Travel",2407, "Prab Khehra");
		
		
		One.addBook(a);
		One.addBook(b);
		One.addBook(c);
		One.addBook(d);
		One.addBook(e);
		One.addBook(f);
		One.addBook(g);
		One.addBook(h);
		One.addBook(i);
		One.addBook(j);
		One.addBook(k);
		One.addBook(l);
		One.addBook(m);
		
		One.displayBookshelf();
		

	}

}
