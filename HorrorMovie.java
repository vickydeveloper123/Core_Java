class HorrorMovie extends Movie
{
	Language lang1=Language.KANNADA;
	
HorrorMovie()
{
	super("CHANDRAMUKHI",400,MovieType.HORROR,Language.KANNADA);
	System.out.println("INVOKING PROPERITIES FROM THE PARENT CLASS Movie by using SUPER() constructor");

}

void display()
{
	System.out.println("DISPLAYING DISPLAY PROPERITIES");
	MovieType typ=MovieType.ACTION;
	System.out.println(typ);
	Language lag=this.language;
	System.out.println(lag);
	String movi=this.movieName="BILLA5";
	System.out.println(movi);
	float pric=this.ticketPrice=900;
	System.out.println(pric);
	RatingType tpe2=RatingType.MEDIUM;
	System.out.println(tpe2);
}



}