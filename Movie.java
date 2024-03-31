class Movie{
	
String movieName;
float ticketPrice;
MovieType movieType;
Language language;
RatingType ratingType;


Movie(String movieName,float ticketPrice,MovieType movieType,Language language)
{ 
    System.out.println("PARAMETERISED CONSTRUCTOR");
	this.movieName=movieName;
	this.ticketPrice=ticketPrice;
	this.movieType=movieType;
	this.language=language;
	System.out.println(movieName);
	System.out.println(ticketPrice);
	System.out.println(movieType);
	System.out.println(language);
}	

Movie()
{
	System.out.println("DEFAULT NO ARGUEMENT CONSTRUCTOR");
}	
	
	
void displayDetails(String movieName,float ticketPrice,MovieType movieType,Language language)
{
	System.out.println("DISPLAYING DETAILS ");
	
	String mov=this.movieName;
    System.out.println(mov);
	
	float ticket=this.ticketPrice;
	System.out.println(ticket);
	
	
	
}

void intRating()
{
	System.out.println("DISPLAYING MOVIE RATING ");
	RatingType rating=this.ratingType.GOOD;
	System.out.println(rating);
	
}
	
}