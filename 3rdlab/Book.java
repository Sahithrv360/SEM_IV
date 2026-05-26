class NewBook{
String title,author;
void display(){
	System.out.println("Title : " + title);
	System.out.println("Author : " + author);
	}
}
public class Book{
	public static void main(String[] a){
		NewBook b1 = new NewBook();
		b1.title = "ABC";
		b1.author = "DEF";
		b1.display();
		NewBook b2 = new NewBook();
		b2.title = "123";
		b2.author = "456";
		b2.display();
	}
}
