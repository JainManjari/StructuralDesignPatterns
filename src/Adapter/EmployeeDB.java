package Adapter;

public class EmployeeDB implements Employee{
	
	private String id;
	private String firstName;
	private String lastName;
	private String email;
	
	public EmployeeDB(String id,String firstName,String lastName,String email) {
		this.id=id;
		this.firstName=firstName;
		this.lastName=lastName;
		this.email=email;
	}

	public String getId() {
		// TODO Auto-generated method stub
		return this.id;
	}

	public String getFirstName() {
		// TODO Auto-generated method stub
		return this.firstName;
	}

	public String getLastName() {
		// TODO Auto-generated method stub
		return this.lastName;
	}

	public String getEmail() {
		// TODO Auto-generated method stub
		return this.email;
	}

}
