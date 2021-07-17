package DailyTasks;

public class SimulateStopwatch {
	/*
	 * Simulate Stop watch Program
	 */
	public static void main(String[] args) {
		long start = 0;
		long stop = 0;			
		System.out.println("Press enter to start time: ");
		Utility.getUserEnter();
		//generating time in milli seconds
		start= System.currentTimeMillis();
		System.out.println("start time 0 Min 0 Sec ");
		System.out.println("press enter to stop time");
		Utility.getUserEnter();
		stop = System.currentTimeMillis();
		//calculating time 
		long resultTime =stop-start;
		//converting milli sec into seconds
		long mSec = resultTime % 1000;
        resultTime = (resultTime - mSec) / 1000;
        long min=0;
        long sec=resultTime;      
        // if time is in minutes then this block will be executed else it directly go to printing statement
        if(resultTime>60)       
        {
        	sec=60;
            while(resultTime >= 0) {
            	if(resultTime >60) {
            		sec =resultTime-sec;
            		min++;
            	}
            	resultTime -= 60;
            }
        }
        
        System.out.println("stop time"+min+" Min "+sec+" Sec");
	}

}
