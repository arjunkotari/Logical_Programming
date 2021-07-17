package DailyTasks;

public class ReverseNumber {
	/*
	 * program of Reverse a number
	 */
	public static void main(String[] args) {
		System.out.println("Enter number...");
		int num=Utility.getUserInteger();
		int rem,sum=0;
		//logic for reverse number
		while(num>0)
		{
			rem = num%10;
			sum = (sum*10)+rem;
			num /= 10;
		}
		System.out.println("Result: "+sum);
	}

}
