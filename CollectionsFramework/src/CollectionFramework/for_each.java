package CollectionFramework;

public class for_each {

	public static void main(String[] args) {

		int numbers[] = new int[7];
		for (int i = 1; i <= 6; i++) {

			numbers[i] = i;
		}

		for (int k : numbers) {
			System.out.println(k);
		}
	}

}
