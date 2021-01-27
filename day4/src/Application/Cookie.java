package Application;

public class Cookie  extends Dessertitem{
	int numberofCookie;
	int price;
	 public Cookie(String dname,int numberofCookie)
	 {
		 super(dname);
		 price=120* numberofCookie/12;
		 
	 }
		 
	@Override
	double  Costofitem() {
		
		return price;
	}

}
