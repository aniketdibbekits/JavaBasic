package strings;

public class stringsmethods {
	public static void main(String[] args) {
		String name1 = "ANieket";
		String name2 = "Raachi";
		String fruits = String.join("-", "A","B","C");
		
//		System.out.println(name1.charAt(1));
//		System.out.println(name1.compareTo("ANiket"));
//		System.out.println(name1.concat(name2));
//		System.out.println(name1.contains("Nit"));
//		System.out.println(name1.indexOf("e"));
//		System.out.println(fruits);
//		System.out.println(name1.split(" "));
		char[] chars = name1.toCharArray();
		System.out.println(chars[2]);
		
	}

}
