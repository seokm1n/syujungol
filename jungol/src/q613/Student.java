package q613;

public class Student{
	String name;
	String school;
	int grade;
	
	public Student(String name, String school, int grade) {
		this.name = name;
		this.school = school;
		this.grade = grade;
	}
	
	public void printInfo() {
        System.out.println("Name : "+name);
        System.out.println("School : "+school);
        System.out.println("Grade : "+grade);
    }
}
