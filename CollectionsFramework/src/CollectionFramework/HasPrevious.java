package CollectionFramework;

import java.util.ArrayList;
import java.util.ListIterator;

public class HasPrevious {

	public static void main(String[] args) {
		ArrayList<X> arrayList=new ArrayList<X>();
		
		for(int i=0;i<5;i++) {
			
			X a=new X();
			a.i=i;
			arrayList.add(a);
			
			System.out.println(i);
			
		}
		
		System.out.println("=========Forword Traversing =============");
		ListIterator<X> listIterater=arrayList.listIterator();
		
		while(listIterater.hasNext()) {
			X a1=listIterater.next();
			System.out.println(a1.i);
		}
		
		
		System.out.println("=========Backword Traversing =============");
		ListIterator<X> listIteraterr=arrayList.listIterator();
		
		while(listIterater.hasPrevious()) {
			X a2=listIterater.previous();
			System.out.println(a2.i);
		}
		
	
	
	   }
		
	
}
