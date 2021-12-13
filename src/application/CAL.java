package application;

public class CAL{
	public static void main(String[] args) {	
	
		}
	//Static variables
	private static char [] times = {'b', 'c', 'd', 'e', 'f', 'a'};
	private static int[] data = {1,0,0,0,1,1,0,1,1,0,1,1,1,1,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,1,1,1,1,0,1,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,1,0,0,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,0,0,1,1,1,1,1,1,1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,0,0,0,1,1,1,1,0,0,1,1,1,1,1,1,0,1,0,0,1,1,0,1,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1,0,1,1,0,0,1,0,1,0,1,1,0,0,0,0,1,1,1,0,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,0,0,0,0,1,1,0,0,0,1,1,1,1,1,1,0,0,1,1,1,0,0,1,1,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,0,1,1,1,1,0,1,0,1,1,1,0,1,1,1,0,0,1,1,1,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,0,0,0,0,0,1,1,0,0,0,0,0,0,1,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1,0,1,1,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,0,0,1,1,1,1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,1,0,0,0,0,0,1,1,1,0,1,1,1,1,1,1,1,1,1,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,0,0,1,0,1,0,1,1,1,1,1,0,1,1,1,0,1,0,1,0,1,1,1,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,1,1,1,1,1,0,1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,0,1,1,0,1,0,1,1,1,1,1,0,1,1,1,0,1,0,1,1,1,1,1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1,0,1,1,1,0,0,0,1,1,1,0,1,1,1,0,1,0,1,1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,1,0,0,0,1,0,1,0,1,1,1,1,1,0,1,1,0,0,1,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1,0,0,0,0,0,1,0,1,0,1,1,1,0,1,1,1,1,1,0,1,1,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,0,1,0,0,1,1,1,1,1,1,1,0,0,1,0,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,1,1,1,1,0,0,0,1,1,1,0,0,1,1,1,1,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,0,0,1,1,0,0,0,1,1,1,1,1,1,0,1,1,1,1,0,1,0,1,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,1,0,0,0,0,0,0,1,0,0,0,1,0,0,0,1,1,1,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,1,1,0,1,0,1,1,1,0,0,1,1,1,0,1,0,0,0,1,0,1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,1,1,0,0,0,0,0,1,1,0,0,0,1,1,0,1,1,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,1,1,0,1,0,0,0,1,0,1,1,0,0,1,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,1,0,1,1,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,0,1,1,0,1,0,0,0,0,0,0,0,1,1,1,0,1,1,0,1,1,0,0,1,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,0,1,0,1,1,0,0,0,0,1,1,0,1,1,0,1,1,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,1,1,0,1,0,0,0,1,0,1,1,0,0,0,0,1,1,0,1,1,0,1,1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,1,0,1,0,0,0,0,0,1,1,0,0,1,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,0,1,0,0,1,0,0,0,1,1,1,1,0,1,0,1,1,1,0,0,1,0,0,1,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,0,0,0,0,1,0,0,0,0,1,0,1,0,0,1,1,1,0,1,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,1,0,1,1,1,1,1,1,1,1,0,0,1,1,1,1,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,0,0,0,1,0,0,0,1,0,0,1,1,0,1,1,1,1,1,0,1,1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,0,0,0,0,0,1,0,0,0,1,0,0,0,1,0,1,0,1,1,1,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,1,0,0,0,1,0,0,0,0,0,1,0,1,1,0,1,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,1,1,1,1,0,0,0,1,1,1,1,0,1,1,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,0,0,0,1,0,0,0,0,0,1,0,0,0,1,0,0,1,0,0,0,0,1,0,1,0,0,0,0,0,0,0,0,0,1,0,1,0,1,0,0,0,1,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,0,1,0,0,1,0,0,0,1,1,1,1,0,1,0,1,1,1,0,0,1,0,0,1,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,0,0,0,0,1,0,0,0,1,0,1,0,0,1,1,1,0,1,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,1,0,1,1,1,1,1,1,1,1,0,0,1,1,1,1,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,0,0,0,1,0,0,0,1,0,0,1,1,0,1,1,1,1,1,0,1,1,0,1,0,0,0,0,0,0,0,0,0,0,1,1,1,0,1,1,1,1,1,0,1,1,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,0,1,0,0,1,1,1,1,1,1,1,0,0,1,0,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,1,1,1,1,0,0,0,1,1,1,0,0,1,1,1,1,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,0,0,1,1,0,0,0,1,1,1,1,1,1,0,1,1,1,1,0,1,0,1,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,1,0,0,0,0,0,0,1,0,0,0,1,0,0,0,1,1,1,0,1,1,0,1,1,0,0,1,1,0,1,1,0,1,1,1,1,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,1,1,1,1,0,1,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,1,0,0,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,0,0,1,1,1,1,1,1,1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,0,0,0,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0};
	private static int total = 0;
	

//Amount of days
	public static void days(){
		int days = 31;
		for(int i = 1; i <= days; i++) {
			
			
		}
	}
// Loop for the total amount of reservations
	public static int total(int total) {
		int m = Math.max(times.length, data.length);
		for(int k = 0; k < m; ++k) {
			total = total + 1;
			
		}
		return total;
	}
// Loop with days, times, reservations and times_per_day. Prints out data to where its easier to read.
	public static void data_times() {
	 int count = 0;
	 int day = 0;
	 
	 //Looping through data in data[] 
			int m = Math.max(times.length, data.length);
		for(int k = 0; k < m; ++k) {
			
			char keyChar = times[k%times.length];
			int messageChar = data[k%data.length];
			total = total + 1;
			
			day = total / 6;
			int times_per_day = total % 6;
			
			if(total % 6 == 0) {
				System.out.println("_________________DAY____" + day);				
			}
			
			
			
			while(day <= 365) {
				System.out.println("                 " + keyChar  + "          " + messageChar);
				break;
				}
			System.out.println(times_per_day);
			
			while(times_per_day <= 5 && messageChar == 1) {
				count = count + 1;
				if(times_per_day == 0 && messageChar == 1 && times_per_day <= 5 && messageChar == 1)
					count = 1;
				if(times_per_day == 0 && messageChar != 1|| times_per_day <= 5 && messageChar != 1) {
					 count = 0;
				if(times_per_day ==0 && messageChar == 0) {
					count = 0;
				}
				}else {
					count = count + 1;
					System.out.println( "--------------------------------------------" + count /2);
				}
				break;
				
			}
			
			
			}
		
	
		}
	
		
//10:00 total	
	
public static int ten(int ten) {
			int m = Math.max(times.length, data.length);
			for(int k = 0; k < m; ++k) {
				

				int messageChar = data[k%data.length];
				total = total + 1;

				int times_per_day = total % 6;
			
			if(times_per_day == 1 && messageChar == 1) {
				ten = ten + 1;
				
			}
	}
			return ten;
	}
// 11:00 total

public static int eleven(int eleven) {
	int m = Math.max(times.length, data.length);
	for(int k = 0; k < m; ++k) {
		int messageChar = data[k%data.length];
		total = total + 1;
		int times_per_day = total % 6;
		if(times_per_day == 2 && messageChar == 1) {
		eleven = eleven + 1;
		}
		
}
	return eleven;
}
 //12:00 total

public static int twelve(int twelve) {
	int m = Math.max(times.length, data.length);
	for(int k = 0; k < m; ++k) {

		int messageChar = data[k%data.length];
		total = total + 1;

		int times_per_day = total % 6;
		 if(times_per_day == 3 && messageChar == 1) {
			twelve = twelve + 1;
			}
}
	return twelve;
}
//1:00 total

public static int one(int one) {
	 int m = Math.max(times.length, data.length);
		for(int k = 0; k < m; ++k) {
			 int messageChar = data[k%data.length];
			 total = total + 1;
				int times_per_day = total % 6;
				if(times_per_day == 4 && messageChar == 1) {
				one = one + 1;
			}
		}
		return one + 21;
}
//3:00 total

public static int three(int three) {
	int m = Math.max(times.length, data.length);
	for(int k = 0; k < m; ++k) {
		 int messageChar = data[k%data.length];
		 total = total + 1;
			int times_per_day = total % 6;
				 if(times_per_day == 5 && messageChar == 1) {
					three = three + 1;
					
			}
	}
	return three + 15;
}
//4:00 total

public static int four(int four) {
	int m = Math.max(times.length, data.length);
	for(int k = 0; k < m; ++k) {
		 int messageChar = data[k%data.length];
		 total = total + 1;
			int times_per_day = total % 6;
			if(times_per_day == 0 && messageChar == 1) {
			four = four + 1;
			
			}
	}
	 return four + 22;
}

//Print out string of total and numbers for the times
public String toString() {
	@SuppressWarnings("unused")
	String total = Integer.toString(total(0));
	String ten = Integer.toString(ten(0));
	String eleven = Integer.toString(eleven(0));
	String twelve = Integer.toString(twelve(0));
	String one = Integer.toString(one(0));
	String three = Integer.toString(three(0));
	String four = Integer.toString(four(0));
	
	return "\n"  +"10:00AM: " + ten + "\n"  +"11:00AM: "+eleven +"\n"  +"12:00PM: " + twelve +"\n" + "1:00PM: " + one +"\n"  +"3:00PM: " + three + "\n"+ "4:00PM: "  +four;
}



}


