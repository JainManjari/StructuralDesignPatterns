package Adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {
	
	
	public List<Employee> getEmployeeList()
	{
		List<Employee> employees=new ArrayList<Employee>();
		
		EmployeeDB edb=new EmployeeDB("12", "harry", "potter", "hogwarts@edu.com");
		
		employees.add(edb);
		
		
		EmployeeLadp eladp=new EmployeeLadp("23", "jain", "mohan", "73@sk");
		
		employees.add(new EmployeeAdapterLadp(eladp));
		
		
	    EmployeeCSV ecsv=new EmployeeCSV("45,jivan,jain,raj@12");
		
		employees.add(new EmployeeAdapterCSV(ecsv));
		
		return employees;
	}
	
	
	public static void main(String args[])
	{
		EmployeeClient client=new EmployeeClient();
		
		List<Employee> employees=client.getEmployeeList();
		
		System.out.println(employees);
	}

}
