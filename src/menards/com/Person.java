package menards.com;

public class Person {
	
	private String FName;
	private String Lname;
	private static String Employer = "Menards";
	
	
	public String getFName() {
		return FName;
	}
	public void setFName(String fName) {
		FName = fName;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	public static String getEmployer() {
		return Employer;
	}
	public static void setEmployer(String employer) {
		Employer = employer;
	}
	
	
}
