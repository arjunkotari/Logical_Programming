package DailyTasks;

import java.util.Scanner;

public class PrimeNumber {
	/*
	 * program of Prime Number
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		//Accepting input at run time 
		int num= sc.nextInt();
		int count = 0;
		for (int i=2; i<num; i++) {
			if(num % i == 0) {
				count++;
			}
		}
		if( count < 1) {
			System.out.println("Given number is Prime number");
		}
		else
			System.out.println("Given number is not Prime number");
		
	}

}
