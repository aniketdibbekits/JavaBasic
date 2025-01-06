package multilevel;

public class whatsapp extends facebook {
	
	public void chatting() {
		System.out.println("whats app chatting");
		
	}
	public static void main(String[] args) {
		whatsapp wp = new whatsapp();
		wp.login();
		wp.chatting();
	}

}
