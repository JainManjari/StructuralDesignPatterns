package Composite;

import java.util.*;

public class example {
	
	public static void main(String args[])
	{
		HashMap<String,String> map=new HashMap<String, String>();
		
		map.put("p1","v1");
		map.put("p2","v2");
		
		
       HashMap<String,String> map2=new HashMap<String, String>();
		
		map2.put("v3","p3");
		map2.put("v4","p4");
		
		HashMap<String,String> map3=new HashMap<String, String>();
		
		map3.putAll(map);
		map3.putAll(map2);
		
		System.out.println(map3);
		
		
	}

}
