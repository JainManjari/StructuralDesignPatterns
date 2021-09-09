package BridgeUsage2;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Movie movie=new Movie();
		movie.setClassification("Action");
		movie.setRuntime("2 hours");
		movie.setTitle("John Wick");
		movie.setYear("2010");
		
		Formatter pf=new PrintFormatter();
		Printer moviePrinter=new MoviePrinter(movie);
		
		String printedMaterials=moviePrinter.print(pf);
		
		System.out.println(printedMaterials);
		
	}

}
