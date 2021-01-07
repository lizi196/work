package work5;

import java.util.Random;

public class work9_4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random1 = new Random(1000);
		for(int i = 1; i <= 50; i++) {
			System.out.println(random1.nextInt(100));
		}
	}

}
