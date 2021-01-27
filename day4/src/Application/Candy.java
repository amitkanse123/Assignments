package Application;

public class Candy extends Dessertitem {
	Double weight;
	double price;
	
 public Candy(String dname,double weight)
 {
	 super(dname);
	 this.weight=weight;
	 
	
	  price= (50*(this.weight)/1000);
 }

@Override
double Costofitem() {
	return price;
}
	
	


}
