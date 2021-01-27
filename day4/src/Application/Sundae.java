package Application;

public class Sundae extends Icecream {
String sundae;
double topping;
	public Sundae(String dname, double cost ,String sundae,double topping) {
		super(dname, cost);
		this.sundae=sundae;
		this.topping=topping;
		
	}
	double Costofitem() {
		// TODO Auto-generated method stub
		return super.Costofitem()+this.topping;
	}
	
	
}
