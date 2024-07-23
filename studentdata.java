package moreroom.org;
import java.util.Scanner;

public class studentdata {
String student_name;
byte student_age;
long phone_number;
String address;
    studentdata(){
    	Scanner d1=new Scanner(System.in);
    	System.out.println("enter your name");
    	student_name=d1.nextLine();
    	System.out.println("enter your age ");
    	student_age=d1.nextByte();
    	System.out.println("enter your number");
    	phone_number=d1.nextLong();
    	d1.nextLine();
    	System.out.println("your address");
    	address=d1.nextLine();
    	
    }
    boolean available(int f) {
    	byte count=1;
    	byte Count=1;
    	byte COUNT=1;
    	boolean c4=false;
    	if(f<=5 && count<=4 ) {
    		c4=true; 
    		count++;
    	}
    	
    	else if(6<=f && f>=8 && (Count<=8)) {
    		c4=true;
    	Count++;	
    	}
    	else if (9<=f && f>=10 && (COUNT<=12) ) {
    		c4=true;
    		COUNT++;
    	}
    	else {
    		c4=false;
    	}
    	return c4;
  }
}
