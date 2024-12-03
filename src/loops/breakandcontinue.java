package loops;

public class breakandcontinue {
	public static void main(String[] args) {
		for(int i =0;i<=10;i++) {
			if(i==2) {
				break;
				//break is use to jump out of loop if any condition matches
			}
//			System.out.println(i);
		}
		
//The continue statement breaks one iteration (in the loop), if a specified condition occurs, and continues with the next iteration in the loop.
		
		for (int i = 0; i < 10; i++) {
			  if (i == 4) {
			    continue;
			  }
			  System.out.println(i);
			}
	}

}
