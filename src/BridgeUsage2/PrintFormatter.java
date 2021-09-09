package BridgeUsage2;

import java.util.List;

public class PrintFormatter implements Formatter {

	@Override
	public String format(String header, List<Detail> details) {
		// TODO Auto-generated method stub
		StringBuilder sb=new StringBuilder();
		sb.append("Classification:"+header+"\n");
		
		for(Detail dt:details)
		{
			sb.append(dt.getLabel());
			sb.append(":");
			sb.append(dt.getValue()+"\n");
		}
		
		return sb.toString();
	}

}
