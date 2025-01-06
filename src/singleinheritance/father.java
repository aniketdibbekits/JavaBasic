package singleinheritance;

public class father {
	int a = 100;
	public void car() {
	System.out.println("Bmw car from father");
	System.out.println(this.a);
	}
	
	public void bike() {
		System.out.println("splender bike from father");
		
	}
	
	public void home() {
		System.out.println("2bhk home from father");
		
	}
	public static void main(String[] args) {
		father f = new father();
		f.car();
	}
	
//	public static void main(String[] args) {
//		father f = new father();
//		f.bike();
//		f.car();
//		f.home();
//	}
}
