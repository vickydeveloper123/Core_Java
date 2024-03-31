class MovieStarter{

public static void main(String[] args){

Movie movie=new Movie("BheemlaNayak",150,MovieType.ACTION,Language.TELUGU);

Movie movie1=new Movie();

Movie movie2=new Movie("DARLING",200,MovieType.COMEDY,Language.TELUGU);

movie2.intRating();



ActionMovie movie4=new ActionMovie();
ActionMovie movie5=new ActionMovie(MovieType.HORROR,Language.KANNADA);
movie5.display();


HorrorMovie movie6=new HorrorMovie();
movie6.display();




}




}