package work4;

public class TestCircleWithStaticMembers {
	public static void main(String[] args) {
		System.out.println("Before creating objects");
		System.out.println("The number of Circle objects is " +
				CircleWithStaticMembers.numberOfObjects);
		CircleWithStaticMembers c1=new CircleWithStaticMembers() ;
		System.out.println("\nAfter creating cl");
		System.out.println("cl: radius (" + c1. radius +
				") and number of Circle objects (" +
				c1.numberOfObjects +")");
		CircleWithStaticMembers c2=new CircleWithStaticMembers(5);
		c1.radius = 9;
		System.out.println("\nAfter creating c2 and modifying cl");
		System.out.println("c1: radius (" + c1.radius +
				") and numeber of Circle objects (" +
				c1.numberOfObjects +")");
		System.out.println("c2: radius (" + c2.radius +
				") and numeber of Circle objects (" +
				c2.numberOfObjects +")");
	}
	


}
