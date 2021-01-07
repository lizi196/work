package work9;
import java.util.*;

public class work12_8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a hex number: ");
		String hex = input.nextLine();
		int decimalValue = 0;
		int f = 0;
		for(int i = 0; i < hex.length(); i++) {
			char hexChar = hex.charAt(i);
			int x = 0;
			try {
				if(hexChar >= 'A' && hexChar <= 'F')
					x = 10 + hexChar - 'A';
				else if(hexChar >= '0' && hexChar <= '9')
					x = hexChar - '0';
				else throw new HexFormatException("自定义的异常");
			}
			catch(HexFormatException e) {
				if(f == 0)
					System.out.println("输入的字符串不是十六进制字符串!");
				f = 1;
			}
			decimalValue = decimalValue * 16 + x;
		}
		if(f == 0)
			System.out.println("The decimal value for hex number "
					+ hex + " is " + decimalValue);
		}

}

