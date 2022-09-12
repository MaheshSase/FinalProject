package POM;

import java.util.Iterator;
import java.util.Vector;

public class Collectionframework {
	public static void main(String[] args) {
		Vector v = new Vector();
		v.add("one");
		v.add("double");
		v.add("Mumbai");
		v.add("2568");
		Iterator i = v.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
