package CollectionFramework;

import java.util.ArrayList;

public class DeletingStringInCollection {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("PVR SIR");
		arrayList.add("VCUBE FOUNDER AND DIRECTOR");
		arrayList.add("Hyderabad");
		arrayList.add("contact Number =9652756762");

		arrayList.add(
				"negativety is the powerful weapon for ur mind to become weak and it will do so harmful not developing ourself");

		for (String ss : arrayList) {
			System.out.println(ss);
		}

		arrayList.remove(
				"negativety is the powerful weapon for ur mind to become weak and it will do so harmful not developing ourself");

		for (String ss : arrayList) {
			System.out.println(ss);
		}

	}

}
