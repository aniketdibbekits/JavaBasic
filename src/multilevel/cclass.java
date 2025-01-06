package multilevel;

public class cclass  extends bclass{
	public void cmethod() {
		System.out.println("c class method");
		
	}
	
	public static void main(String[] args) {
		cclass s = new cclass();
		s.amethod();
		s.bnethod();
		s.cmethod();
	}

}
