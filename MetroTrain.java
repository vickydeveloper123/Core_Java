class MetroTrain extends Train{

String cityName;
int ticketPrice;

MetroTrain(String cityName)
{

super(1122,"GODAVARI",FuelType.STEAMPOWER);
this.cityName=cityName;
System.out.println("CITY NAME ="+cityName);
this.ticketPrice=100;
System.out.println("TICKET PRICE ="+ticketPrice);

}

MetroTrain(int ticketPrice)
{
	super("CHARMINAR EXPRESS");
	System.out.println("INVOKING PARAMETERS FROM PARENT CLASS Train");
	this.ticketPrice=ticketPrice;
	System.out.println("TICKET PRICE"+ticketPrice);
}

MetroTrain(String cityName,int ticketPrice)
{
	super(1232,"GODAVARI KRISHNA",FuelType.ELECTRICPOWER);
	System.out.println("INVOKING PARAMETERS FROM THE PARENT CLASS TRIAN USING THE SUPER KEYWORD");
	this.cityName=cityName;
	this.ticketPrice=ticketPrice;
	System.out.println("CITY NAME ="+cityName);
	System.out.println("TICKET PRICE ="+ticketPrice);
	
}












}


