package day02.practice;

//Question#1 (For Encapsulation): 
//Create a User class with attribute id, name, password, emailId and 
//create setters and getters for the same.
//Please note no attribute should be available publicly they should be only be accessible via the access modifiers.

public class user{
	private int userid;
	private String username;
	private String userpassword;
	private String useremail;
	
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserpassword() {
		return userpassword;
	}
	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}
	public String getUseremail() {
		return useremail;
	}
	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}
}

