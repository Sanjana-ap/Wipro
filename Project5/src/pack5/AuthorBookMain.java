package pack5;
class Author{
	private String name,email;
	private char gender;
	Author(String n,String mail,char gen){
		this.name=n;
		this.email=mail;
		this.gender=gen;
	}
	String get_name() {
		return this.name;
	}
	String get_mail() {
		return this.email;
	}
	char get_gender() {
		return this.gender;
	}
}
class Book {
	String name;
	Author author;
	double price;
	int qtyInStock;
	Book(String n,Author author,double p, int qt){
		this.name =n;
		this.author = author;
		this.price = p;
		this.qtyInStock=qt;
	}
	void set_name(String name) {
		this.name=name;
	}
	void  set_price(double p) {
		this.price=p;
	}
	void set_qtyInStock(int qty) {
		this.qtyInStock=qty;
	}
	String get_name() {
		return this.name;
	}
	double get_price() {
		return this.price;
	}
	int get_qty() {
		return this.qtyInStock;
	}
	
}
public class AuthorBookMain {
	public static void main(String args[]) {
		Author a = new Author("sanjana","sanju28@gmail.com",'F');
		Book b = new Book("Wings of Fire",a,350.0,3);
		String n=b.get_name();
		double p=b.get_price();
		int q=b.get_qty();
		System.out.println("Name of the book is : "+n);
		System.out.println("The price is : "+p);
		System.out.println("Availabe qty : "+q);
		
	}

}
