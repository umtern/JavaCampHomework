package homeworkDay3;

public class Student extends User{
	  
	
	// öncelikle extend ettik : miras almak : Userýn içindekileri Student classýda kullanabilsin.
	// ortak özellikleri tek bir yerden daðýymak için extend ettik.
	// bir userda old gibi studentýn da ismi yaþý ve maili olabilir yani ortak kullaným.
	
   private String studentKullanici;
   private String studentPasswords;
   private String alinanDers;
   
   
   public Student() {  // boþ constructor bloðunu oluþturmayý unutma.
	   
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
