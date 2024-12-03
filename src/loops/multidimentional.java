package loops;

public class multidimentional {
	public static void main(String[] args) {
		int[][] mynumbers = {{11,43,56,34,89,9,32},{99,35,2,1,7,94}};
		System.out.println(mynumbers[0][2]);
		for(int i=0;i<mynumbers.length;i++) {
			for(int j=0;j<mynumbers[i].length;j++) {
				System.out.println(mynumbers[i][j]);
			}
		}
	}

}
