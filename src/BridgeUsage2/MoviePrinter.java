package BridgeUsage2;

import java.util.ArrayList;
import java.util.List;

public class MoviePrinter extends Printer {
	
	private Movie movie;
	
	public MoviePrinter(Movie movie) {
		// TODO Auto-generated constructor stub
		this.movie=movie;
	}

	@Override
	protected String getHeader() {
		// TODO Auto-generated method stub
		return this.movie.getClassification();
	}

	@Override
	protected List<Detail> getDetails() {
		// TODO Auto-generated method stub
		List<Detail> details=new ArrayList<>();
		
		details.add(new Detail("Title",movie.getTitle()));
		details.add(new Detail("Year",movie.getYear()));
		details.add(new Detail("Runtime",movie.getRuntime()));

		return details;
	}

}
