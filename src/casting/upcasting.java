package casting;

public class upcasting {
	public static void main(String[] args) {
		father f = new father();
		f.bike();
		f.car();
		
		son s = new son();
		s.bike();
		s.car();
		
		father f1 = new son();
		f1.bike();
		f1
		.car();

	}

}
