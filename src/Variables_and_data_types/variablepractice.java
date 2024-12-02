package Variables_and_data_types;

public class variablepractice {
	public static void main(String[] args) {
		System.out.println("This is main method used to call all the methods");
		//stattic method cha object create nhi krt
		name();
		//for non-static method syntax class_name variablename = new classname()
		variablepractice v1 = new variablepractice();
		v1.lastname();
		
		
		//we can also create a object of  the aother method which is in different file
		variable_practice2 v2 = new variable_practice2();
		v2.nonstatic();
		
		//static method call from another class
		variable_practice2.staticmethod();
	}
	
	
	
	public static void name() {
		System.out.println("this is the static method");
		
	}
	
	public void lastname() {
		int a = 100;
		System.out.println("value of a is:"+a);
	}

}
