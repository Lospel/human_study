package exam02;

import java.util.HashMap;
public class KeyExam {
	public static void main(String[] args) {
		HashMap<Key, String> hashMap = new HashMap<Key, String>();

//		hashMap.put(new Key(1), "강현준");
		Key k1 = new Key(1);
		hashMap.put(k1, "강현준");

//		String value = hashMap.get(new Key(1));
		Key k2 = new Key(1);
		String value = hashMap.get(k2);
		System.out.println (value);

		
		
		
		
		
		
		
		
		System.out.println (k1 + "-" + k2);

	}

}
