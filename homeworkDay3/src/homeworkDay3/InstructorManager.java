package homeworkDay3;

public class InstructorManager {
	
	
	public void add(Instructor instructor) {
		System.out.println("e�itmen eklendi : "+ instructor.getFirstName());
	}
	
	public void delete(Instructor instructor) {
		System.out.println("e�itmen silindi : " + instructor.getFirstName());
	}
	public void update(Instructor instructor) {
System.out.println("e�itmen g�ncellendi :" + instructor.getFirstName());
	}

}
