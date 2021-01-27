package Application;

public class Icecream  extends Dessertitem{
	double cost;
	public Icecream(String dname,double cost) {
		super(dname);
		this.cost=cost;
	}
	@Override
	double Costofitem() {
		// TODO Auto-generated method stub
		return cost;
	}
	
	
}
