class TrainStarter{

public static void main(String[] args){

Train train=new Train(1122);
Train train1=new Train("KRISHNA");
Train train2=new Train(FuelType.ELECTRICPOWER);
Train train3=new Train(1122,"KRISHNA",FuelType.ELECTRICPOWER);

train.displayDetails();

System.out.println("==================================================");

MetroTrain train4=new MetroTrain("NELLORE");

MetroTrain train5=new MetroTrain(500);

MetroTrain train6=new MetroTrain("HYDERBAD-CHENNAI",1000);


Train train7=new MetroTrain("HYDERBAD-BANGLORE",1500);



}






}