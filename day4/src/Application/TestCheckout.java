package Application;

public class TestCheckout {
	public static void main(String[] args) {
		
		Candy c1=new Candy("candy",100);
		Cookie c2=new Cookie("cookie",150);
		Icecream c3=new Icecream("icecream",220);
		Sundae c4=new Sundae(" vanila iccream",200,"sundae",400);
		Dessertitem d[]= {c1,c2,c3,c4};
		
		Checkout c=new Checkout();
		c.additem(d);
		System.out.println(c);
		c.clear();
	
		System.out.println(c);
	}
	
}
