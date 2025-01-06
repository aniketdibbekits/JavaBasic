package singleinheritance;

public class son extends father {
	public static void main(String[] args) {
		son s = new son();
		s.bike();
		s.car();
		s.home();
		s.mobile();
		

	}
	
	public void mobile() {
		System.out.println("vivo");
	}
	
}
