package day5com.thinkitive;

import day5com.thinkitive.add.div;

interface calculation {

	public int performaction(int a, int b);

}

class add implements calculation{
	public int performaction(int a, int b) {
		return a + b;
	}
	
	class div implements calculation
	{

		@Override
		public int performaction(int a, int b) {
			
			return a/b;
		}
		
	}
}

class sub implements calculation{

	public int performaction(int a, int b) {
		return a - b;
	}
}

class interf {

	public static void main(String[] args) {
		add obj = new add();
		sub obj1 = new sub();
		div d=obj.new div();
		System.out.println(obj.performaction(2, 3));
		System.out.println(obj1.performaction(12, 2));
		System.out.println(d.performaction(12, 6));
	}
}
