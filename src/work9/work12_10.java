package work9;

import java.util.*;

public class work12_10 {
	public static void main(String[] args)
    {
        ArrayList<Double> h = new ArrayList<Double>();
        double i = 114514;
        while(true){
            i++;
            try{
                h.add(i);
            }
            catch(OutOfMemoryError killerQueen){
                System.out.print("Ohhhhhh!");
                System.exit(1);
            }
        }
    }

}
