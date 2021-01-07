package work8;

public class Student implements Comparable<Student> {
	private String id;
	private String name;
	private int age;
	
	public Student(String id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public int compareTo(Student stu) {
		return this.age - stu.age;
	}
	
	public String toString() {
		return  "name=" + name + ", id=" + id + ", age=" + age;
	}

}
