package BridgeUsage2;

import java.util.List;

public abstract class Printer {
	
	public String print(Formatter formatter)
	{
		return formatter.format(this.getHeader(), this.getDetails());
	}
	
	protected abstract String getHeader();
	protected abstract List<Detail> getDetails();

}
