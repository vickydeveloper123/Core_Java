class ActionMovie extends Movie{

MovieType type=MovieType.COMEDY;
Language language=Language.KANNADA;


ActionMovie()
{
	super("DARLING",200,MovieType.COMEDY,Language.KANNADA);
	System.out.println("INVOKING PROPERITIES FROM THE PARENT CLASS Movie by using SUPER() constructor");

}

ActionMovie(MovieType type,Language language)
{
	System.out.println("INVOKING PARAMETERISED CONSTRUCTOR");
	this.type=type;
	this.language=language;
	System.out.println(type);
	System.out.println(language);
}

void display()
{
	System.out.println("DISPLAYING DISPLAY PROPERITIES");
	MovieType type1=this.type;
	System.out.println(type1);
	Language lang=this.language;
	System.out.println(lang);
	String movie1=this.movieName="BILLA";
	System.out.println(movie1);
	float price1=this.ticketPrice=500;
	System.out.println(price1);
	RatingType type2=RatingType.MEDIUM;
	System.out.println(type2);
}








}