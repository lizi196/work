package work8;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.io.PrintStream;

public class test2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        Set<Student> stuSet = new TreeSet<Student>();
        System.out.println("请输入学生的学号、姓名和年龄");
        while (true){
            String id = input.next();
            if (id.equals("exit")){
                break;
            }
            String name = input.next();
            int age = input.nextInt();
            Student stu = new Student(id, name, age);
            stuSet.add(stu);
        }
        try {
        	Iterator<Student> it = stuSet.iterator();
        	PrintStream ps = new PrintStream("F:\\1.txt");
	        while (it.hasNext()){
	            String info = it.next().toString();

	            System.setOut(ps);
	            System.out.println(info);
	        }
        }
        catch(Exception e) {
        }
	}

}
