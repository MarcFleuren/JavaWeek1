
public class WhileAttemptFactorials {

	public static void main(String[] args) {
		int i = 0;
		double a = 120;
		
		while(a > 1)
		{
			i++;
			a = a / i;
			
			}
		if( a == 1) {
			System.out.println(i + "!");
		} else { 
				System.out.println("None");
			}
		}
		
		
		
	}


