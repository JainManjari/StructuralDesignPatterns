package Bridge;

public abstract class Shape {
	
	public abstract void applyColor();
	
	
	public static void main(String args[])
	{
		Circle circle=new RedCircle();
		Square square=new BlueSquare();
		
		circle.applyColor();
		square.applyColor();
		
		//this leads to a problem arising when we want to do the same code for purple rectangle, again write the whole code=> tedious task
	}

}
