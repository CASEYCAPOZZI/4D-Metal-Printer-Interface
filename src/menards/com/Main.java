package menards.com;

public class Main {

	public static void main(String[] args) {
		
		
		Person casey = new Person();
		
		casey.setFName("Casey");
		casey.setLname("Capozz");
		
		
		System.out.println("Hello " + casey.getFName() + " " + casey.getLname() + " from " + casey.getEmployer() + "!!");
		
		
	}

}
