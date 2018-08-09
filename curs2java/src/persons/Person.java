package persons;

public class Person {
	//Persons have a first name a last name and an age. 
	private String FirstName;
	private String LastName;
	private int varsta;
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public int getVarsta() {
		return varsta;
	}
	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}
	public Person(String firstName, String lastName, int varsta) {
		super();
		FirstName = firstName;
		LastName = lastName;
		this.varsta = varsta;
	}
	@Override
	public String toString() {
		return "Person [FirstName=" + FirstName + ", LastName=" + LastName + ", varsta=" + varsta + "]";
	}

}
