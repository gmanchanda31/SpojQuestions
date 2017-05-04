import java.util.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//Take 5 integers from user.
		//store the integers in a 5-integer array.
		//print elements of the array, starting from first while integer != 42.
		int[] input = new int[5];
		Scanner sc = new Scanner(System.in);
		int i = 0, j = 0;
		while(i < 5){
			input[i] = sc.nextInt();
			i++;
		}
		sc.close();
		while(input[j] != 42) {
			System.out.println(input[j]);
			j++;
		}
	}
}