package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapRunner {

	public static void main(String[] args) {

		HashMap<K, V> hashmap = new HashMap<K, V>();

		K keyArr[] = new K[5];
		for (int i = 0; i< 5; i++) {

			K aa = new K();
			aa.key = i;
			keyArr[i]=aa;

			V aaa = new V();
			aaa.value = i + 5;

			hashmap.put(aa, aaa);
		}
		
	 Set<Map.Entry<K,V>>  V=hashmap.entrySet();
		
		for(Map.Entry<K,V> x:V) {
			K z=x.getKey();
			System.out.println("For Key:"+z.key+"Value");
			
			V VV=x.getValue();
			System.out.println(VV.value);
		}

	}

}
