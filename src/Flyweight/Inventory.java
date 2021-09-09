package Flyweight;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class Inventory {
	
	private final Catalog catalog=new Catalog();
	private final List<Order> orders=new CopyOnWriteArrayList<Order>();
	
	public void takeOrder(String orderName,int orderNo)
	{
		Item item=catalog.lookUp(orderName);
		Order order=new Order(orderNo, item);
		
		orders.add(order);
	}
	
	public void process()
	{
		for(Order order:orders)
		{
			order.processOrder();
			orders.remove(order);
		}
	}
	
	public String report()
	{
		return "Total Items made in Catalog "+catalog.totalSizesMade();
	}

}
