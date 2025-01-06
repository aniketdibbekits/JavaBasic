package oops;

public class constructordemo {
	int x= 100;
	
	public constructordemo() {
		x = 99;
		
	}
	public static void main(String[] args) {
		System.out.println("this is the main method");
		constructordemo d1 = new constructordemo();
		System.out.println(d1.x);
		
	}

}
