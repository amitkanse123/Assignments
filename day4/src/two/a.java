package two;


interface ab
{
	void fun();
	
	
}
interface bb
{
	void gun();
}



interface c extends ab,bb
{
	
	void sun();
}

class a implements c
{

	@Override
	public void fun() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void gun() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sun() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}