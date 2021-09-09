package Flyweight;

public class Order {
	
	private final int orderNo;
	private final Item item;
	
	public Order(int orderNo,Item item)
	{
		this.orderNo=orderNo;
		this.item=item;
	}
	
	public void processOrder()
	{
		System.out.println("Processing order for "+item+" and orderNo is "+orderNo);
	}

}
