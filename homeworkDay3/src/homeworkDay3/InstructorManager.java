package homeworkDay3;

public class InstructorManager {
	
	
	public void add(Instructor instructor) {
		System.out.println("eðitmen eklendi : "+ instructor.getFirstName());
	}
	
	public void delete(Instructor instructor) {
		System.out.println("eðitmen silindi : " + instructor.getFirstName());
	}
	public void update(Instructor instructor) {
System.out.println("eðitmen güncellendi :" + instructor.getFirstName());
	}

}
