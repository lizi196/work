package work2;
import java.util.Scanner;

public class work3_9 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int sum=0,num=1;
		System.out.print("Enter the first 9 digits of an ISBN as integer:");
        String isbn=s.next();
        for(int i=0;i<9;i++) {
        	int j=isbn.charAt(i)-'0';
//        	System.out.println(j);
        	sum+=j*num++;
        }
        System.out.println("The ISBN-10 number is "+(((sum%11)==10)?(isbn+"X"):(isbn+(sum%11))));

	}

}
