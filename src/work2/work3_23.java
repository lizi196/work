package work2;
import java.util.Scanner;

public class work3_23 {
	public static void main(String[] args) {
	  	Scanner input = new Scanner(System.in);
	  	System.out.print("Enter a point with two coordinates: ");
	  	double a = input.nextDouble();
	  	double b = input.nextDouble();
	  	System.out.print("Point ("+ a + ", "+ b + ") is");
	  	if(a <= 5 && b <= 2.5) System.out.print(" in the rectangle");
	  	else  System.out.print(" not in the rectangle");
		
	}


}
