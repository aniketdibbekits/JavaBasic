package loops;

public class loopspractice {
	public void sampleloop() {
		System.out.println("this is sample method to demonstrate loops");
		for(int i=1;i<99;i++) {
			System.out.println(i);
		}
	}
	
	public void whileloop() {
//		The while loop loops through a block of code as long as a specified condition is true:


		System.out.println("This is while loop demo");
		int i = 9;
		while(i>10) {
			System.out.println(i);
		}
	}
	
	public void dowhile() {
		System.out.println("This is do while loop demo");
		int i = 0;
		do {
			System.out.println("do loop"+i);
			i++;
		}while( i<8);
//		 The loop will always be executed at least once, even if the condition is false, because the code block is executed before the condition is tested
	}
	public static void main(String[] args) {
		System.out.println("This is main method ");
		loopspractice loop = new loopspractice();
//		loop.sampleloop();
		loop.whileloop();
		loop.dowhile();
	}

}
