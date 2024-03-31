class Train{

int trainNo;
String trainName;
FuelType type;

void displayDetails()
{
	System.out.println("DISPLAYING TRAIN DETAILS");
	int trainNo1=1980;
	System.out.println("Train Number ="+trainNo1);
	String trainName1="SIMHAPURI";
	System.out.println("TRAIN NAME ="+trainName1);
	FuelType type1=FuelType.STEAMPOWER;
	System.out.println("TRAIN TYPE ="+type1);
	
	
}

Train(int trainNo)
{
	System.out.println("running train constructor with single parameter");
	this.trainNo=trainNo;
	System.out.println("TRAIN NUMBER"+trainNo);
	
}

Train(String trainName)
{
	System.out.println("RUNNING TRAIN NAME CONSTRUCTOR");
	this.trainName=trainName;
	System.out.println("TRAIN NAME ="+trainName);
}

Train(FuelType type)
{
	System.out.println("TRAIN TYPE ="+type);
	this.type=type;
	System.out.println("TRAIN TYPE ="+type);
}

Train(int trainNo,String trainName,FuelType type)
{
	System.out.println("RUNNING THREE ARGUEMENT TRAIN CONSTRUCTOR");
	this.trainNo=trainNo;
	this.trainName=trainName;
	this.type=type;
	System.out.println("TRAIN NUMBER ="+trainNo);
	System.out.println("TRAIN NAME ="+trainName);
	System.out.println("Train type ="+type);
	
}






}