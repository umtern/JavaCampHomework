package homeworkDay3;

public class Main {

	public static void main(String[] args) {
		
		
	
		
		//bu i�ine yazd���m�z bilgileri set ederek yapaniliiz.
		
		
		
	// kodun uzun hali userdaki bo� constructor blo�u bunun i�in var.
		
//		user1.setFirstName("�mit");
//		user1.setLastName("eren");
//		user1.setAge(24);
//		user1.setEmail("blublu.com");
		
		
		Student student1 = new Student("kullan�ci1","sifre","Java");
		
		student1.setFirstName("�mit");
		student1.setLastName("eren");
		student1.setAge(24);
		student1.setEmail("blublu.com");
		
		StudentManager studentManager = new StudentManager();
		
		studentManager.add(student1);
		studentManager.delete(student1);
		studentManager.update(student1);
		studentManager.Information(student1);
		
		System.out.println("----------------------------------");
		
		
	   Instructor instructor1 = new Instructor("kullan�c�3","sifre","ingilizce");
		
	   instructor1.setFirstName("necmettin");
	   instructor1.setLastName("k�lt�r");
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
