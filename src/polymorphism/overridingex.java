package polymorphism;

public class overridingex {
	public static void main(String[] args) {
		System.out.println("Father data");
		father f = new father();
		f.car();
		f.home();
		f.home();
		f.girlfriend();
		
		System.out.println("------------------------------------------------");
		System.out.println("Son's data");
		son s = new son();
		s.car();
		s.girlfriend();
		s.home();
	}

}
