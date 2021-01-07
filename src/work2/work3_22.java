package work2;
import java.util.Scanner;

public class work3_22 {
	public static void main(String[] args) {
	  	Scanner input = new Scanner(System.in);
	  	System.out.print("Enter a point with two coordinates: ");
	  	double a = input.nextDouble();
	  	double b = input.nextDouble();
		    double d = Math.sqrt(a*a + b*b);
		    System.out.print("Point ("+ a + ", "+ b + ") is");
		    if(d <= 10) System.out.print(" in the circle");
		    else  System.out.print(" not in the circle");
	}


}
