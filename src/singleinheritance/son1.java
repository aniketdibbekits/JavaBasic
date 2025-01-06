package singleinheritance;

public class son1 extends father1 {
	public static void main(String[] args) {
		son1 s = new son1();
		s.farm();
		s.tractor();
		s.business();
	}
	
	public void business() {
		System.out.println("son's business");
	}

}
