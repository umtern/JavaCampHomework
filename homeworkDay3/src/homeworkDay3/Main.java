package homeworkDay3;

public class Main {

	public static void main(String[] args) {
		
		
	
		
		//bu içine yazdığımız bilgileri set ederek yapaniliiz.
		
		
		
	// kodun uzun hali userdaki boş constructor bloğu bunun için var.
		
//		user1.setFirstName("ümit");
//		user1.setLastName("eren");
//		user1.setAge(24);
//		user1.setEmail("blublu.com");
		
		
		Student student1 = new Student("kullanıci1","sifre","Java");
		
		student1.setFirstName("ümit");
		student1.setLastName("eren");
		student1.setAge(24);
		student1.setEmail("blublu.com");
		
		StudentManager studentManager = new StudentManager();
		
		studentManager.add(student1);
		studentManager.delete(student1);
		studentManager.update(student1);
		studentManager.Information(student1);
		
		System.out.println("----------------------------------");
		
		
	   Instructor instructor1 = new Instructor("kullanıcı3","sifre","ingilizce");
		
	   instructor1.setFirstName("necmettin");
	   instructor1.setLastName("kültür");
	   instructor1.setAge(31);
	   instructor1.setEmail("kultur.com");
		
		
		InstructorManager instructorManager = new InstructorManager();
		
	instructorManager.add(instructor1);
	instructorManager.delete(instructor1);
	instructorManager.update(instructor1);
	
	System.out.println("------------------------------------------");
	
	UserManager userManager = new UserManager();
	userManager.add(instructor1);
		
		
		
		
		
		
	}

}
