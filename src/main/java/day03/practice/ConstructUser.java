package day03.practice;

class User{
	
	private String name;
	private String emailId;
	private String password;
	
//	Default constructor 
	User(){
		
	}
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getEmailId() {
		return emailId;
	}



	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	//	Overloaded Constructor
	User(String name, String password, String emailId){
		this.name = name;
		this.password = password;
		this.emailId = emailId;
	}
	
	public String toString() {
		return name + "\n" + emailId + "\n" + password;
	}
}

public class ConstructUser {
	
	public static void main(String[] args) {
		
		User userOne = new User();
		
		userOne.setName("Aravind");
		userOne.setEmailId("Aravind@gmail.com");
		userOne.setPassword("Aravind21");
		
		System.out.println(userOne);
		
		User userTwo = new User("Sarvesh", "sarvesh@email.com", "Sarvesh04");
		System.out.println(userTwo);
	}

}
