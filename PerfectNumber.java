package DailyTasks;

public class PerfectNumber {

	public static void main(String[] args) {
		int result=0;
		System.out.println("Enter number...");
		int num = Utility.getUserInteger();
		//Finding num factors
		for (int i=1;i<num; i++)
		{
			if(num%i == 0)
				result += i;			
		}
		if(result == num)
			System.out.println("Given number is perfect number: "+num);
		else
			System.out.println("Given number is not perfect number: "+num);
	}

}
