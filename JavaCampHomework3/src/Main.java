
public class Main {

	public static void main(String[] args) {
		
		User user1=new User(1, "Mehmet", "�im�ek", "mehmetsimsek3212368@hotmail.com");
		UserManager userManager=new UserManager();
		userManager.Log(user1);
		
		Instructor instructor=new Instructor(1, "Ak�n", "�z�ift", "Ak�nozcift@gmail.com", "Derin Ogrenme", "151");
		InstructorManager instructorManager=new InstructorManager();
		instructorManager.addInstructor(instructor);

		Student student=new Student(1, "Mehmet", "�im�ek", "mehmetsimsek3212368@hotmail.com", 3.14, 23, "172805012");
		StudentManager studentManager=new StudentManager();
		studentManager.addStudent(student);
			
	}

}
