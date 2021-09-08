package Adapter;

public class EmployeeAdapterLadp implements Employee {
	
	private EmployeeLadp instance;
	
	public EmployeeAdapterLadp(EmployeeLadp instance) {
		this.instance=instance;
	}

	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return instance.getCn();
	}

	@Override
	public String getFirstName() {
		// TODO Auto-generated method stub
		return instance.getGivenName();
	}

	@Override
	public String getLastName() {
		// TODO Auto-generated method stub
		return instance.getSurname();
	}

	@Override
	public String getEmail() {
		// TODO Auto-generated method stub
		return instance.getMail();
	}

}
