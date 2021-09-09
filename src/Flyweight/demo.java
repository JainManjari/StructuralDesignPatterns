package Flyweight;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Inventory iv=new Inventory();
		
		iv.takeOrder("Ramen", 22);
		iv.takeOrder("Naruto", 16);
		iv.takeOrder("Headphones", 9);
		iv.takeOrder("MacBook", 456);
		iv.takeOrder("Harry Potter 7", 78922);
		iv.takeOrder("Naruto",349);
		iv.takeOrder("Headphones", 1);
		
		iv.process();
		
		System.out.println(iv.report());
		

	}

}
