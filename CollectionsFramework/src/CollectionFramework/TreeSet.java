package CollectionFramework;

public class TreeSet {
	
	public static void main(String[] args) {
		
		TreeSet<Integer> treeSet=new TreeSet<Integer>();
		
		int j=5;
		
		for(int i=0;i<=5;i++) {
			
			System.out.println(--j);
			treeSet.add(j);
		}
		
	}

}
