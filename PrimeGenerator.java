import java.util.Scanner;

public class PrimeGenerator {

	public static void main(String[] args) {
		//take userInput for number of test cases
		//for every test case take 2 integers m and n in the input.
		// 1<=m<=n<=1000000000, n-m<=100000
		//print all prime numbers between m and n.
		
		Scanner testCases = new Scanner(System.in);
		while(testCases.nextInt() != 0) {
			
			Scanner input1 = new Scanner(System.in);
			int m = input1.nextInt();
			
			Scanner input2 =new Scanner(System.in);
			int n = input2.nextInt();
			
			for(int offset = m; offset <=n ; offset++ ){
				if(checkPrime(offset) == true){
					System.out.println(offset);
				}
			}
			
		}
	}
	
	private static boolean checkPrime(int number){
		//return true if number is prime; else false
		int checkingCriteria = number/2;
		for(int i = 2; i <= checkingCriteria; i++){
			if(number % i == 0){
				return false;
			}
		}
		return true;
	}

}
