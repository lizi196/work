package work2;

import java.util.Scanner;


public class work3_15 {
	public static void main(String[] args) {
		 int l= (int) (Math.random() * 1000);
		 Scanner s=new Scanner(System.in);
		 System.out.print("Enter your lottery pick (three digits):");
		 int g=s.nextInt();
		 
		 int ld1=l/100;
		 int ld2=l%100/10;
		 int ld3=l%10;
		 int gd1=g/100;
		 int gd2=g%100/10;
		 int gd3=g%10;
		 
		 System.out.println("The lottery number is " + l);
		 if (g == l) {
	            System.out.println("Exact match: you win $10000");
	     }else if(((gd1 == ld1) && (gd2 == ld3)
	                && (gd3 == ld2)) || ((gd1 == ld2) && (
	                        gd2 == ld3) && (gd3 == ld1)) ||
	                        ((gd1 == ld2) && (gd2 == ld1) && (gd3 == ld3)) ||
	                        ((gd1 == ld3) && (gd2 == ld1) && (gd3 == ld2)) ||
	                        ((gd1 == ld3) && (gd2 == ld2) && (gd3 == ld1))) {
	                    System.out.println("Match all digits: you win $3000");
	                }
	     else if ((gd1 == ld1) || (gd1 == ld2) || (gd1 == ld3) ||
	                (gd2 == ld2) || (gd2 == ld3) ||
	                (gd3 == ld3)) {
	            System.out.println("Match one digits: you win $1000");
	        } else {
	            System.out.println("Sorry, no match");
	        }

		 
		 
		 
		
	}

}
