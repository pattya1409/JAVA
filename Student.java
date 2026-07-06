package objectOriented;

public class Student {
	String name;
	int age;
	int roll;
	
	void sleep() {
		System.out.println("studnts are sleeping");
	}

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "prathamesh";
		s1.age = 24;
		s1.roll = 21;

		System.out.println("Name: " + s1.name);
		System.out.println("age : " + s1.age);
		System.out.println("roll: " + s1.roll);
		
		s1.sleep();
		
	}

}
