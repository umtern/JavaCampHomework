package homeworkDay3;

public class StudentManager {
	
	
	// bir student ne yap�labilir  i�ler buraya yaz�l�r.Studentin i�leri

	 public void add(Student student ) {
		 System.out.println("��renci eklendi : " +   student.getFirstName() +""+ "" + student.getLastName());
	 }
	
	public void delete(Student student ) {
		System.out.println("��renci silindi :" + student.getFirstName()+ student.getLastName());
	}
	 
	public void update(Student student ) {
		System.out.println("��renci g�ncellendi :" + student.getFirstName()+ student.getLastName());
	}
	
	public void Lesson(Student student ) {
		System.out.println("��renci dersi ald�"+ student.getAlinanDers());
	}
	
	public void Information(Student student)
	
{
    System.out.println("��renci kullan�c� adi : " + student.getStudentKullanici());
    System.out.println("��renci �ifresi : "  +student.getStudentPasswords());	
	System.out.println("��rencinin ald��� ders"+ student.getAlinanDers());
	System.out.println("��renci ismi:"+student.getFirstName());
	System.out.println("��renci soyismi:"+student.getLastName());
	System.out.println("��renci ya��:"+student.getAge());
	System.out.println("��renci mail adresi :"+student.getEmail());
	
	
	}
	
	
	
	
	
}
