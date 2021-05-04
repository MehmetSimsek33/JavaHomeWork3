
public class Student extends User 
{
	private double average;
	private int age;
	private String studentNumber;
	
	public Student(int id, String firsName, String lastName, String email, double average, int age,
			String studentNumber) {
		super(id, firsName, lastName, email);
		this.average = average;
		this.age = age;
		this.studentNumber = studentNumber;
	}
	public String getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	public double getExamResult() {
		return average;
	}
	public void setExamResult(int examResult) {
		this.average = average;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
