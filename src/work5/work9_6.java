package work5;
import java.util.Random;

public class work9_6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random1 = new Random(1000);
		StopWatch watch = new StopWatch();
		int[] a = new int[100010];
		for(int i = 1; i <= 100000; i++) a[i] = random1.nextInt(1000000);
		int minn = 0, p = 0;
		watch.start();
		for(int i = 1; i <= 99999; i++) {
			minn = a[i];
			p = i;
			for(int j = i + 1; j <= 100000; j++) {
				if(a[j] < minn) {
					minn = a[j];
					p = j;
				}
			}
			int tmp = a[i];
			a[i] = a[p];
			a[p] = tmp;
		}
		watch.stop();
		System.out.println(watch.getElapsedTime());
	}

}
