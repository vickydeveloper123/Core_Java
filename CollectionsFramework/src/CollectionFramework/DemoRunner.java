package CollectionFramework;

import java.util.ArrayList;

public class DemoRunner {
	public static void main(String[] args) {

		ArrayList<X> arrayX = new ArrayList<X>();

		System.out.println("Initially the size of an array ==>" + arrayX.size());
		System.out.println(arrayX.isEmpty());
		for (int d = 0; d < 10; d++) {
			{
				X aa = new X();
				aa.i = d;
				arrayX.add(aa);
			}
			System.out.println("Size of an Array==>" + arrayX.size());

		}
		for(int k=0;k<10;k++) {
			Y bb=new Y();
			bb.i=k;
			arrayX.add(bb);
			
		}
		System.out.println("Size of an array"+arrayX.size());
		
		System.out.println("===================================");
		
		for(X o:arrayX) {
			o.show();
		}
	}

}
