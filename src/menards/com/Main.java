package menards.com;

public class Main {

	public static void main(String[] args) {
		
		
		Person casey = new Person();
		
		casey.setFName("Casey");
		casey.setLname("Capozzi");
		
		
		System.out.println("Hello " + casey.getFName() + " " + casey.getLname() + " from " + Person.getEmployer() + "!!");
		
		Person joe = new Person();
		
		joe.setFName("Joe");
		joe.setLname("Capozzi");
		
		System.out.print("Also hey " + joe.getFName() + " " + joe.getLname() + "...");
		
		Person tyty = new Person();
		tyty.setFName("Tyler");
		tyty.setLname("Capozzi");
		

		System.out.print(" and hey " + tyty.getFName() + " " + tyty.getLname() + "!");
		
	}

}
