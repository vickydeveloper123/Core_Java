class BagStarter{

public static void main(String[] args){

Bag bag=new Bag();
Price price1=Price.THOUSAND;
System.out.println(price1);
Gender gender1=Gender.MALE;
System.out.println(Gender.MALE);
System.out.println(BagType.HANDBAG);
boolean proof=false;
System.out.println(proof);

System.out.println("INVOKING PARENT PROPERITIES AS WELL CHILD CLASS WildCraftBag properitites");

Bag bag1=new WildCraftBag();
Price price2=Price.TWOTHOUSAND;
System.out.println(price2);
Gender gender2=Gender.FEMALE;
System.out.println(Gender.MALE);
System.out.println(BagType.HANDBAG);
boolean proof1=true;
System.out.println(proof1);
float warenty=3;
System.out.println(warenty);
System.out.println(Color.WHITE);



System.out.println("INVOKING PARENT PROPERITIES AS WELL CHILD CLASS WildCraftBag properitites and AmericanToristerBag properities");

Bag bag2=new AmericanTouristerBag();
Price price3=Price.TWOTHOUSAND;
System.out.println(price3);
Gender gender3=Gender.MALE;
System.out.println(Gender.MALE);
System.out.println(BagType.LAPTOPBAG);
boolean proof2=true;
System.out.println(proof2);
float warenty1=5;
System.out.println(warenty1);
System.out.println(Color.WHITE);
String wallet="ribon";
System.out.println(wallet);
int noOfCompartments=6;
System.out.println(noOfCompartments);



System.out.println("INVOKING PARENT PROPERITIES AS WELL CHILD CLASS WildCraftBag properitites and AmericanToristerBag properities and BagOperator");
Bag bag3=new BagOperater();
Price price4=Price.THREETHOUSAND;
System.out.println(price4);
Gender gender4=Gender.MALE;
System.out.println(Gender.MALE);
System.out.println(BagType.LAPTOPBAG);
boolean proof3=true;
System.out.println(proof3);
float warenty3=9;
System.out.println(warenty3);
System.out.println(Color.WHITE);
String wallet1="SUNRISE";
System.out.println(wallet1);
int noOfCompartments1=5;
System.out.println(noOfCompartments1);
System.out.println(this.waterProof);
	System.out.println(this.price);
	System.out.println(this.gender);


























}







}