package Decorator;

public abstract class SandwichDecorator implements Sandwich {

	protected Sandwich customSandwich;
	
	public SandwichDecorator(Sandwich customSandwich) {
		// TODO Auto-generated constructor stub
		this.customSandwich=customSandwich;
	}
	
	@Override
	public String make() {
		// TODO Auto-generated method stub
		return this.customSandwich.make();
	}

}
