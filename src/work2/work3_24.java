package work2;

public class work3_24 {
	public static void main(String[] args) {
	      int a = (int)(Math.random()*13+1);
	      int b = (int)(Math.random()*4+1);
	      System.out.print("The Card you picked is ");
	      if(a == 1) System.out.print("Ace");
	      else if(a == 11) System.out.print("Jack");
	      else if(a == 12) System.out.print("Queen");
	      else if(a == 13) System.out.print("King");
	      else System.out.print(a);
	      System.out.print(" of ");
	      if(b == 1) System.out.print("Clubs ");
	      else if(b == 2) System.out.print("Diamonds ");
	      else if(b == 3) System.out.print("Hearts ");
	      else System.out.print("Spades ");
}


}
