package DailyTasks;

public class FibonacciSeries {
	/*
	 * program: Generating N number of Fibonacci series numbers.
	 */

	public static void main(String[] args) {
		int n=0;
		int m=1;
		System.out.println("How many positions you want");
		int num=Utility.getUserInteger();
		System.out.print("Fibonacci Series is :"+n+" "+m+" ");
		for(int i=2;i<num;i++)
		{
			int res=n+m;
			System.out.print(res+" ");
			//Swapping the positions
			n = m;
			m = res;
		}
	}

}
