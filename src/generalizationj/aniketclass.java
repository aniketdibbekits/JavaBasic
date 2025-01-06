package generalizationj;

public class aniketclass implements generalinterface {

	@Override
	public void accountnumber() {
		System.out.println("this is account numbetr");
		
	}

	public void loan() {
		System.out.println("This is loan 123");
		
	}

	@Override
	public void investment() {
		System.out.println("sbi mutual funds");
		
	}
	
	public static void main(String[] args) {
		aniketclass ac = new aniketclass();
		ac.accountnumber();
		ac.investment();
		ac.loan();
	}
	

}
