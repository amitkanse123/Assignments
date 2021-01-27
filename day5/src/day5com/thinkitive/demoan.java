package day5com.thinkitive;

public class demoan {
	

	public static void main(String[] args) {
		
	annonys add=(a,b)->a+b;
	
		 annonys sub=(a,b)->a-b;
		 annonys div=(a,b)->a/b;
		 
	System.out.println(add.performaction(1, 1));
	System.out.println(add.performaction(3, 2));
	System.out.println(add.performaction(12, 2));
	
	//.............................................................................
	
	annonys sub1=new annonys() {
		
		@Override
		public int performaction(int a, int b) {
			// TODO Auto-generated method stub
			return 0;
		}
	};
	annonys div1=(a,b)->a/b;
	System.out.println(div1.performaction(22,11 ));
	
	
}
}
