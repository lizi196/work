package work9;
import java.util.*;

public class work12_7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a binary number: ");
		String B = input.nextLine();
		double result = 0;
		int f = 0;
		for(int i = B.length() - 1; i >= 0; i--) {
			char BChar = B.charAt(i);
			double x = 0;
			try {
				if(BChar == '0')
					continue;
				else if(BChar == '1') {
					x = Math.pow(2, B.length() - 1 - i);
				}
				else throw new Exception("自定义的异常");
			}
			catch(Exception e) {
				if(f == 0)
					System.out.println("输入的字符串不是二进制字符串!");
				f = 1;
			}
			result = result + x;
		}
		if(f == 0)
			System.out.println("The decimal value for Binary number "
					+ B + " is " + (int)result);
		}

}
