package CollectionFramework;

import java.util.ArrayList;

public class ArrayListClass {
	
	public static void main(String[] args) {
		ArrayList<X> arrayList=new ArrayList<X>();
		System.out.println("Initially size of an Array===>"+arrayList.size());
		
		for(int i=0;i<=5;i++) {
			
			X a=new X();
			a.i=i+5;
			
			arrayList.add(a);
			
		}
		
		System.out.println("Now size of an Array ==> "+arrayList.size());
		
		for(int i=0;i<=5;i++) {
			
			X a1=new X();
			a1.i=i+10;
			
			arrayList.add(a1);
			
		}
		System.out.println("After Adding Extra Elements==>"+arrayList.size());
		
		System.out.println("Printing all elements in the list in the sequential order");
		
		for(X elements:arrayList) {
			System.out.println(elements.i);
		}
	}
	

}
