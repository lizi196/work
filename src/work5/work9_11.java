package work5;
import java.util.Scanner;

public class work9_11 {
	public static void main(String[] args)
    {
        System.out.print("Enter a b c d e f: ");
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();
        LinearEquation ass = new LinearEquation(a,b,c,d,e,f);
        if(ass.isSolvable())
            System.out.println(ass.getX()+" "+ass.getY());
        else
            System.out.println("The equation has no solutions.");
    }
}

class LinearEquation
{
    private double a,b,c,d,e,f;
    public LinearEquation(double A,double B,double C,double D,double E,double F){
        a=A;
        b=B;
        c=C;
        d=D;
        e=E;
        f=F;
    }
    public double getA(){
        return a;
    }
    public double getB(){
        return b;
    }
    public double getC(){
        return c;
    }
    public double getD(){
        return d;
    }
    public double getE(){
        return e;
    }
    public double getF(){
        return f;
    }
    public boolean isSolvable(){
        return a*d-b*c!=0;
    }
    public double getX(){
        return (e*d-b*f)/(a*d-b*c);
    }
    public double getY(){
        return (a*f-e*c)/(a*d-b*c);
    }
}
