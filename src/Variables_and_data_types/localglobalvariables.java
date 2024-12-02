package Variables_and_data_types;

public class localglobalvariables {
	
	static int b = 200;
	
	
	public void demo() {
//		int b = 20;
		System.out.println("value of b is "+b);
	}
	
	public static void sample() {
		System.out.println(b);
		int a = 10;
		System.out.println("value of a is"+a);
		System.out.println("value of b is "+b);
	}
	
	public static void main(String[] args) {
		System.out.println("This is main method");
		sample();
		localglobalvariables v = new localglobalvariables();
		v.demo();
	}
	
	
	
}
