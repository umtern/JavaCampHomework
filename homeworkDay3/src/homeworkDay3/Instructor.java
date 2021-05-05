package homeworkDay3;

public class Instructor extends User{

	
	
	private String InstructorKullanici;
	private String InstructorPassaword;
	private String VerilenDers;
	
	
	
	
	
	public Instructor() {
		
	}
	
	
	
	public Instructor(String instructorKullanici, String instructorPassaword, String verilenDers) {
		super();
		this.InstructorKullanici = instructorKullanici;
		this.InstructorPassaword= instructorPassaword;
		this.VerilenDers = verilenDers;
	}



	public String getInstructorKullanici() {
		return InstructorKullanici;
	}



	public void setInstructorKullanici(String instructorKullanici) {
		InstructorKullanici = instructorKullanici;
	}



	public String getInstructorPassaword() {
		return InstructorPassaword;
	}



	public void setInstructorPassaword(String instructorPassaword) {
		InstructorPassaword = instructorPassaword;
	}



	public String getVerilenDers() {
		return VerilenDers;
	}



	public void setVerilenDers(String verilenDers) {
		VerilenDers = verilenDers;
	}
	
	
	
}
