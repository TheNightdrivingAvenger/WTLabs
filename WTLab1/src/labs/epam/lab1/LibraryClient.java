package labs.epam.lab1;

public class LibraryClient {
	
	private int passportID;
	private int innerID;
	private String firstName;
	private String lastName;
	private String middleName;
	
	public LibraryClient(int passportID, String firstName, String lastName, String middleName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
		this.passportID = passportID;
		// TODO: add generating with checking for existing inner system ID
	}

	public int getPassportID() {
		return passportID;
	}

	public void setPassportID(int passportID) {
		this.passportID = passportID;
	}

	public int getInnerID() {
		return innerID;
	}

	public void setInnerID(int innerID) {
		this.innerID = innerID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
}
