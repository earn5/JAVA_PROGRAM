public class MultiDiamentionalArrayDemo {
    public static void main(String[] args){
        int[][] number = new int[2][3];
		
		for(int n=0; n<=1; n++) {
			for(int m=0; m<=2; m++) {
				number[n][m] = (int) (Math.random() * 10);
				//System.out.println(number[n][m] + " ");
			}
		}
		
        for(int n=0; n<=1; n++) {
			for(int m=0; m<=2; m++) {
				System.out.print(number[n][m] + " ");
			}
			System.out.println();
		}
        
    }
}
