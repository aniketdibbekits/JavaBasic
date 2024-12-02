package Variables_and_data_types;

public class familyplanning {
	public static void firstName() {
		System.out.println("This is static method of familyplanning");
		String firstname = "Rachi";
		System.out.println("Firstname is "+firstname);
	}
	
	public void lastName() {
		System.out.println("This is non static method lastName");
		String lastname = "Dibbe";
		System.out.println("Last name is"+lastname);
		
	}
	
	public static void main(String[] args) {
		System.out.println("This is static method for fullname");
	firstName();
		familyplanning f1 = new familyplanning();
		f1.lastName();
//		System.out.println(firstName());
	}

}
