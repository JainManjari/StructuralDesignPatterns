package Flyweight;

import java.util.*;

public class Catalog {

	private HashMap<String,Item> items=new HashMap<String, Item>();
	
	public Item lookUp(String itemName)
	{
		if(!items.containsKey(itemName))
		{
			items.put(itemName,new Item(itemName));
		}
		return items.get(itemName);
	}
	
	public int totalSizesMade()
	{
		return items.size();
	}
}
