package work1;
import java.util.Scanner;

public class ComputeChange {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter an amount in double, for example 11.56:");
		double amount= input.nextDouble();
		int remainingAmount =(int)(amount * 100);
		int number0fOneDollars = remainingAmount / 100;
		int number0fQuarters = remainingAmount / 25;
		int number0fDimes = remainingAmount / 10;
		remainingAmount = remainingAmount % 10;
		int number0fNickels= remainingAmount / 5;
		remainingAmount = remainingAmount % 5;
		int number0fPennies = remainingAmount;
		System.out.println("Your amount"+amount+"consists of");
		System.out.println("   "+number0fOneDollars +" dollars");
		System.out.println("   "+number0fQuarters +" Quarters");
		System.out.println("   "+number0fDimes +" Dimes");
		System.out.println("   "+number0fNickels +" Nickels");
		System.out.println("   "+number0fPennies +" Pennies");
	
	}

}
