
public class Take1 {
	int[][] arrayOfFactorials = new int[20][2];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i <= 20 ; i++ ) {
			long counter = 1;
			for(int j = 1; j <= i ; j++) {
				counter = counter*j;
			}
			arrayOfFactorials[i][1]= counter;
		}

	}
	
}
