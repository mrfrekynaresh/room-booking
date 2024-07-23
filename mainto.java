package moreroom.org;
import java.util.ArrayList;
import java.util.Scanner;

public class mainto {
	
	    public static void main(String[] args) {
	    roomdata[]r1=new roomdata[10];
	    ArrayList<studentdata> s1 =new ArrayList<studentdata>();
	    r1[0]=new roomdata(1,4);
	    r1[1]=new roomdata(2,4);
	    r1[2]=new roomdata(3,4);
	    r1[3]=new roomdata(4,4);
	    r1[4]=new roomdata(5,4);
	    r1[5]=new roomdata(6,8);
	    r1[6]=new roomdata(7,8);
	    r1[7]=new roomdata(8,8);
	    r1[8]=new roomdata(9,12);
	    r1[9]=new roomdata(10,12);   
	    
	    	String start ="YES";
	    	while(start.equals("YES")) {
	    		Scanner m1 =new Scanner(System.in);
	    		System.out.println("you booking (yes/no) ");
	    		start=m1.nextLine().toUpperCase();
	    		if(start.equals("YES")) {
	    			for(roomdata ra:r1) {
	    				ra.show();
	    			}
	    			System.out.println("count 4 $10000 ,count 8 $6000,count 12 $3000");
	    			System.out.println("enter your room number ");
	    			int ra=m1.nextInt();  
	    			studentdata a1=new studentdata();
	    			if(a1.available(ra)) {
	    				s1.add(a1);
	    				System.out.println("is booked ");
	    			}
	    			else {
	    				System.out.println("fully booked");
	    			}
	    		}
	    		
	    	}
	    }
	}


