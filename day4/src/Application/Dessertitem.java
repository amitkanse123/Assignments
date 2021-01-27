package Application;

public abstract class Dessertitem {
  String name;
  public Dessertitem() {
	
}
  public Dessertitem(String name) {
		this.name=name;
  }
  
  abstract double  Costofitem();
  
  final String GetName()
  {
	  return name;
  }
  
}
