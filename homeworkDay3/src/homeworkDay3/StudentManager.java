package homeworkDay3;

public class StudentManager {
	
	
	// bir student ne yapýlabilir  iþler buraya yazýlýr.Studentin iþleri

	 public void add(Student student ) {
		 System.out.println("öðrenci eklendi : " +   student.getFirstName() +""+ "" + student.getLastName());
	 }
	
	public void delete(Student student ) {
		System.out.println("öðrenci silindi :" + student.getFirstName()+ student.getLastName());
	}
	 
	public void update(Student student ) {
		System.out.println("öðrenci güncellendi :" + student.getFirstName()+ student.getLastName());
	}
	
	public void Lesson(Student student ) {
		System.out.println("öðrenci dersi aldý"+ student.getAlinanDers());
	}
	
	public void Information(Student student)
	
{
    System.out.println("öðrenci kullanýcý adi : " + student.getStudentKullanici());
    System.out.println("öðrenci þifresi : "  +student.getStudentPasswords());	
	System.out.println("öðrencinin aldýðý ders"+ student.getAlinanDers());
	System.out.println("öðrenci ismi:"+student.getFirstName());
	System.out.println("öðrenci soyismi:"+student.getLastName());
	System.out.println("öðrenci yaþý:"+student.getAge());
	System.out.println("öðrenci mail adresi :"+student.getEmail());
	
	
	}
	
	
	
	
	
}
