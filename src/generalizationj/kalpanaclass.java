package generalizationj;

public class kalpanaclass implements generalinterface{

	@Override
	public void accountnumber() {
		// TODO Auto-generated method stub
		System.out.println("kalpana account number");
		
	}

	@Override
	public void loan() {
		// TODO Auto-generated method stub
		System.out.println("Kalpana loan account");
		
	}

	@Override
	public void investment() {
		// TODO Auto-generated method stub
		System.out.println("icici mutual funds");
		
	}
	
	public static void main(String[] args) {
		kalpanaclass ks = new kalpanaclass();
		ks.accountnumber();
		ks.loan();
		ks.investment();
	}
	

}
