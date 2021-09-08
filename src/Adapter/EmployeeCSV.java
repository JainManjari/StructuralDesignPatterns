package Adapter;

import java.util.*;

public class EmployeeCSV {
	

	private String id;
	private String firstName;
	private String lastName;
	private String email;
	
	
	public EmployeeCSV(String exp)
	{
		StringTokenizer st=new StringTokenizer(exp,",");
		
		if(st.hasMoreElements())
		{
			this.id=st.nextToken();
		}
		
		if(st.hasMoreElements())
		{
			this.firstName=st.nextToken();
		}
		
		if(st.hasMoreElements())
		{
			this.lastName=st.nextToken();
		}
		
		if(st.hasMoreElements())
		{
			this.email=st.nextToken();
		}
	}
	
	
	
	public String getId() {
		return id;
	}


	public String getFirstName() {
		return firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public String getEmail() {
		return email;
	}
	
	
	
}
