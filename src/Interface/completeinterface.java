package Interface;

public class completeinterface implements interface1{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("this is complete m1");
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("this is complete m2");
		
	}
	
	public static void main(String[] args) {
		completeinterface ci = new completeinterface();
		ci.m1();
		ci.m2();
	}
	

}
