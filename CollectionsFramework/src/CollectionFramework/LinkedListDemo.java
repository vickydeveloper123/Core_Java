package CollectionFramework;

import java.util.LinkedList;

public class LinkedListDemo {
	
	public static void main(String[] args) {
		LinkedList<X> setting=new LinkedList<X>();
		
		for(int i=0;i<=5;i++) {
			X x=new X();
			x.i=i;
			setting.add(x);
		}
		
		X x1=new X();
		x1.i=100;
		setting.set(1,x1);

		for(X B:setting) {
			System.out.println(B.i);
		}
		
		X vv=new X();
		vv.i=200;
		setting.set(2,vv);
		
		for(X ioi:setting) {
			System.out.println(ioi.i);
		}
		
		
		X df=new X();
		df.i=300;
		setting.set(3,df);
		
		for(X er:setting) {
			System.out.println(er.i);
		}
		
		X f=new X();
		
		setting.set(4,df);
		setting.set(5, df);
		
	    for(X j:setting) {
	    	System.out.println(j.i);
	    }
		
	}
	
	

}
