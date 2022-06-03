package resources;

public class HostelRunner {
	
	public static void main(String[] args)
	{
		
		HostelDatabase hostel1=new HostelDatabase("VIGNESH","venkat");
		System.out.println(hostel1);
		System.out.println("Room Members after changin the values");
		hostel1.name="pani";
		hostel1.name1="pratep";
		System.out.println(hostel1.name+hostel1.name1);
		
	}

}
