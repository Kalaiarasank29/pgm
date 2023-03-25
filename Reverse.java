package Practice;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        int b = a.length();
        String rev ="";
        
		for (int i =b-1; i>=0 ;i-- )
        {
        	rev = rev + a.charAt(i);
        }
     System.out.println(rev);
	        
		}


	}


