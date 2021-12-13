package application;
import java.io.*;

public class newData{
	

    public static void main(String[] args)
    {
    	
}
// Static variables
    
	@SuppressWarnings("unused")
	private static int ch1 = 0;
	private static int ten = 0;
	private static int eleven = 0;
	private static int twelve = 0;
	private static int one = 0;
	private static int three = 0;
	private static int four = 0;

//Method for reading data from newDate.txt, looping through and counting if there is a 1 in each position
  public static String setter(){
	  
//Returning variables
    	String ten1 = null;
    	String eleven1 = null;
    	String twelve1 = null;
    	String one1 = null;
    	String three1 = null;
    	String four1 = null;
    	
 //Reading file newData.txt
        File file = new File("newData.txt");
 
        try (BufferedReader br = new BufferedReader(new FileReader(file)))
        {
        	
 //Looping through characters is newData.txt
            String line;
            while ((line = br.readLine()) != null) {
                char[] ch = new char[line.length()];
                
               for(int i = 0; i < line.length(); i++) {
            	   ch[i] = line.charAt(i);
            	   
//            		   System.out.println(ch[i]);
            	   
            	   ch1 = ch.length;

  //If i % 6 == position 0 and character ch[i] == 1 add 1 to the ten variable convert to string
            	   if(i % 6 == 0 && ch[i] == '1') {
            		   ten = ten + 1;
            		    ten1 = Integer.toString(ten);
            	   }
 //If i % 6 == position 1 and character ch[i] == 1 add 1 to the eleven variable convert to string        	   
            	   if(i % 6 == 1 && ch[i] == '1') {
            		   eleven = eleven + 1;
            		   eleven1 = Integer.toString(eleven);
            	   }
 //If i % 6 == position 2 and character ch[i] == 1 add 1 to the twelve variable convert to string
            	   if(i % 6 == 2 && ch[i] == '1') {
            		   twelve = twelve + 1;
            		    twelve1 = Integer.toString(twelve);
            	   }
  //If i % 6 == position 3 and character ch[i] == 1 add 1 to the one variable convert to string        	   
            	   if(i % 6 == 3 && ch[i] == '1') {
            		   one = one + 1;
            		    one1 = Integer.toString(one);
            	   }
  //If i % 6 == position 4 and character ch[i] == 1 add 1 to the three variable convert to string
            	   if(i % 6 == 4 && ch[i] == '1') {
            		   three = three + 1;
            		    three1 = Integer.toString(three);
            	   }
 //If i % 6 == position 5 and character ch[i] == 1 add 1 to the four variable convert to string
            	   if(i % 6 == 5 && ch[i] == '1') {
            		   four = four + 1;
            		    four1 = Integer.toString(four);
            	   }
                   
            	   }}}
               catch (IOException e) {
            	    System.out.println("There has been an error.");
            	    
            	 
            	}      
             
  //Return a string of the numbers.     
		return "\nThese are the current numbers: \n" + "10:00AM: " + ten1 + "\n" + "11:00AM: " + eleven1 + "\n" +"12:00PM: " + twelve1 + "\n" + "1:00PM: " + one1 +
      		   "\n" + "3:00PM " +  three1 + "\n" + "4:00PM " + four1;
                
             
            }   
 
 //Returning integers of the same numbers.
  
  //ten
  public static int ten() {
	  File file = new File("newData.txt");
      try (BufferedReader br = new BufferedReader(new FileReader(file)))
      {
          String line;
          while ((line = br.readLine()) != null) {
              char[] ch = new char[line.length()];
              
             for(int i = 0; i < line.length(); i++) {
          	   ch[i] = line.charAt(i);
          	   ch1 = ch.length;
          	   if(i % 6 == 0 && ch[i] == '1') {
          		   ten = ten + 1;    
          	   } 
          	   }}}
             catch (IOException e) {
          	    System.out.println("There has been an error."); 
          	}
      return ten;
  }
 //eleven
  public static int eleven() {
	  File file = new File("newData.txt");
      try (BufferedReader br = new BufferedReader(new FileReader(file)))
      {
          String line;
          while ((line = br.readLine()) != null) {
              char[] ch = new char[line.length()];
              
             for(int i = 0; i < line.length(); i++) {
          	   ch[i] = line.charAt(i);
          	   ch1 = ch.length;
          	 if(i % 6 == 1 && ch[i] == '1') {
      		   eleven = eleven + 1;   
      	   }
          	   }}}
             catch (IOException e) {
          	    System.out.println("There has been an error."); 
          	}
      return eleven;
  }
  //twelve
  public static int twelve() {
	  File file = new File("newData.txt");
      try (BufferedReader br = new BufferedReader(new FileReader(file)))
      {
          String line;
          while ((line = br.readLine()) != null) {
              char[] ch = new char[line.length()];
              
             for(int i = 0; i < line.length(); i++) {
          	   ch[i] = line.charAt(i);
          	   ch1 = ch.length;
          	  if(i % 6 == 2 && ch[i] == '1') {
       		   twelve = twelve + 1;
       	   }
          	   }}}
             catch (IOException e) {
          	    System.out.println("There has been an error."); 
          	}
      return twelve;
  }
  //one
  public static int one() {
	  File file = new File("newData.txt");
      try (BufferedReader br = new BufferedReader(new FileReader(file)))
      {
          String line;
          while ((line = br.readLine()) != null) {
              char[] ch = new char[line.length()];
              
             for(int i = 0; i < line.length(); i++) {
          	   ch[i] = line.charAt(i);
          	   ch1 = ch.length;
          	 if(i % 6 == 3 && ch[i] == '1') {
      		   one = one + 1;
      	   }
          	   }}}
             catch (IOException e) {
          	    System.out.println("There has been an error."); 
          	}
      return one;
  }
  //three
  public static int three() {
	  File file = new File("newData.txt");
      try (BufferedReader br = new BufferedReader(new FileReader(file)))
      {
          String line;
          while ((line = br.readLine()) != null) {
              char[] ch = new char[line.length()];
              
             for(int i = 0; i < line.length(); i++) {
          	   ch[i] = line.charAt(i);
          	   ch1 = ch.length;
          	 if(i % 6 == 4 && ch[i] == '1') {
      		   three = three + 1;
      	   }
          	   }}}
             catch (IOException e) {
          	    System.out.println("There has been an error."); 
          	}
      return three;
  }
  //four
  public static int four() {
	  File file = new File("newData.txt");
      try (BufferedReader br = new BufferedReader(new FileReader(file)))
      {
          String line;
          while ((line = br.readLine()) != null) {
              char[] ch = new char[line.length()];
              
             for(int i = 0; i < line.length(); i++) {
          	   ch[i] = line.charAt(i);
          	   ch1 = ch.length;
          	   if(i % 6 == 5 && ch[i] == '1') {
        		   four = four + 1;
        	   }
          	   }}}
             catch (IOException e) {
          	    System.out.println("There has been an error."); 
          	}
      return four;
  }
  
}
 





