package Decorator;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sandwich sandwich=new DressingDecorator(new MeatDecorator(new Simplesandwich()));
		
		System.out.println(sandwich.make());

	}

}
