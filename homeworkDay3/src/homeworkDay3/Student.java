package homeworkDay3;

public class Student extends User{
	  
	
	// �ncelikle extend ettik : miras almak : User�n i�indekileri Student class�da kullanabilsin.
	// ortak �zellikleri tek bir yerden da��ymak i�in extend ettik.
	// bir userda old gibi student�n da ismi ya�� ve maili olabilir yani ortak kullan�m.
	
   private String studentKullanici;
   private String studentPasswords;
   private String alinanDers;
   
   
   public Student() {  // bo� constructor blo�unu olu�turmay� unutma.
	   
   }
   
public Student(String studentKullanici, String studentPasswords, String alinanDers) {
	super();
	this.studentKullanici = studentKullanici;
	this.studentPasswords = studentPasswords;
	this.alinanDers = alinanDers;
}

public String getStudentKullanici() {
	return studentKullanici;
}

public void setStudentKullanici(String studentKullanici) {
	this.studentKullanici = studentKullanici;
}

public String getStudentPasswords() {
	return studentPasswords;
}

public void setStudentPasswords(String studentPasswords) {
	this.studentPasswords = studentPasswords;
}

public String getAlinanDers() {
	return alinanDers;
}

public void setAlinanDers(String alinanDers) {
	this.alinanDers = alinanDers;
}
	
	
	
}
