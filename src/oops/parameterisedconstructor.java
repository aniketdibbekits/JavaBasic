package oops;

public class parameterisedconstructor {
	int age;
	String name;
	public parameterisedconstructor(int janm,String naav) {
		age = janm;
		name = naav;
		
	}
	public static void main(String[] args) {
		parameterisedconstructor obj = new parameterisedconstructor(24,"Rachi");
		System.out.println(obj.name+" "+"and my age is"+obj.age);
		
	}

}
