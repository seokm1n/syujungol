package q614;

public class Student{
	String school;
	int grade;
	
	public Student(String school, int grade) {
		this.school = school;
		this.grade = grade;
	}
	
	public void printInfo() {
        System.out.println(grade+" grade in "+school+" School");
    }
}