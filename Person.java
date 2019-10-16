
public class Person extends NameHolder {
	private String lastName;
	
	
	public Person() throws NameException {
		String temp1 = "Bo";
		String temp2 = "Alex";
		lastName = temp1;
		super.setFirstName(temp2);
		
	}
	
	public Person(String firstName, String lastName) throws NameException {
		this.lastName = lastName;
		
		super.setFirstName(firstName);
	}
	
	protected  String getLastName() {
		return new String(lastName);
	}
	
	@Override
	public String describeSelf() {
		String description = "*** First Name: " + super.getFirstName() +
				" Last Name: " + lastName + "***";
		return description;

	}

}
