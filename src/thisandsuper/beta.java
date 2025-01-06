package thisandsuper;

public class beta extends superandthis{
	public static void main(String[] args) {
		beta b = new beta();
		b.myproperties();
	}
	
	public void myproperties() {
		System.out.println(super.a);
	}

}
