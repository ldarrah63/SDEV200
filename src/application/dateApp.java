package application;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

//Figuring out and displaying today's date and last year's date
public class dateApp {
	public static void main(String[] args) {
		
		
	}
	
	public static String toStringToday() {
		CAL cal = new CAL();
		@SuppressWarnings({ "static-access", "unused" })
		int jj = cal.total(0);
		
	//Formatting date and time for today's date
		 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");  
		   LocalDateTime now = LocalDateTime.now();  
		LocalDate date = LocalDate.parse(dtf.format(now));
	    
		//Subtract 0 days;
		LocalDate date2 = date.minusDays(0);

	//Return string of todays date
		return "Date " +  date2;
	}
	
	public String toStringThen() {
		CAL cal = new CAL();
		@SuppressWarnings({ "static-access", "unused" })
		int jj = cal.total(0);
		
	//Formatting date and time of last years date	
		 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");  
		   LocalDateTime now = LocalDateTime.now();  
		LocalDate date = LocalDate.parse(dtf.format(now));
	    
	//Subtracting 365 days from today's date
		LocalDate date2 = date.minusDays(365);
		
	//Return string of last years date.
		return  "Last year: "  + date2 + "\n" + "These are last year's numbers:";
	}
}