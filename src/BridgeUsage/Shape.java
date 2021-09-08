package BridgeUsage;

public abstract class Shape {
	
	protected Color color;
	
	public Shape(Color color)
	{
		this.color=color;
	}
	public abstract void applyColor();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Color blue=new Blue();
		
		Shape circle=new Circle(blue);
		
		circle.applyColor();

	}

}
