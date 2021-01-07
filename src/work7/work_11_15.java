package work7;
import java.util.Scanner;
import java.util.ArrayList;

public class work_11_15 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of the points: ");
		int n = input.nextInt();
		System.out.println("Enter the coordinates of the points:");
		Point [] P = new Point[1010];
		double x, y;
		for(int i = 0; i < n; i++) {
			x = input.nextDouble();
			y = input.nextDouble();
			P[i] = new Point(x, y);
		}
		System.out.print("The total area is ");
		double area = 0;
		for(int i = 0; i < n; i++) {
			area += P[i].Cross(P[(i + 1) % n] );
		}
		System.out.printf("%.3f", Math.abs(area / 2));
	}

}
class Point{
	  private double x;
	  private double y;

	  Point(double x,double y){
	    this.x=x;
	    this.y=y;
	  }
	  
	  public double getX(){return x;}
	  public double getY(){return y;}
	  public double Cross(Point a) {
		  return this.x * a.getY() - this.y * a.getX();
	  }
}