package homeworkDay3;

public class UserManager {
	
	public void add(User user) {
		System.out.println("ana sistemden user getirildi:" +user.getFirstName() );
	}

	public void delete(User user) {
		System.out.println("ana sistemden user silindi:" +user.getFirstName() );
	}
	
	public void update(User user) {
		System.out.println("ana sistemde user güncellendi:" +user.getFirstName() );

	
	}
	
}
