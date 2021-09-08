package Adapter;

public class EmployeeAdapterCSV implements Employee {
	
	private EmployeeCSV instance;
	
	public EmployeeAdapterCSV(EmployeeCSV instance) {
		this.instance=instance;
	}

	public String getId() {
		// TODO Auto-generated method stub
		return this.instance.getId();
	}

	public String getFirstName() {
		// TODO Auto-generated method stub
		return this.instance.getFirstName();
	}

	public String getLastName() {
		// TODO Auto-generated method stub
		return this.instance.getLastName();
	}

	public String getEmail() {
		// TODO Auto-generated method stub
		return this.instance.getEmail();
	}

}
