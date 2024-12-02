package Variables_and_data_types;

public class variable_learning {
	//main method for exceution
	public static void main(String[] args) {
		name();
		variable_learning vl = new variable_learning();
		vl.name1();
	}
	
	
	
	
	
	//static method
	public static void name() {
		System.out.println("This is main method");
		
	}
	
	//non static method
	public void name1() {
		int a = 10;
		System.out.println("value of a is "+a);
		
	}

}
