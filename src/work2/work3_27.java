package work2;
import java.util.Scanner;

public class work3_27 {
	public static void main(String[] args) {
	  	Scanner input = new Scanner(System.in);
	  	System.out.print("Enter a point's x- and y-coordinates: ");
	  	double x = input.nextDouble();
	  	double y = input.nextDouble();
	  	if(x >= 0&&y >= 0&&(y + x/2.0 -100 <=0)) System.out.print("The point is in the triangle");
	  	else System.out.print("The point is not in the triangle");
		
	}


}
