package one;

import java.util.HashMap;
import java.util.Scanner;

public class Hash {

	private HashMap<Integer,String> numbernames = new HashMap<Integer,String>();
	
	public  Hash() {
		numbernames.put(1, "type number one");
		numbernames.put(2, "type number two");
		numbernames.put(3, "type number three");
		numbernames.put(4, "type number four");	
	}
	
	public String getHash(int a) {
		if(numbernames.containsKey(a)) 
		return numbernames.get(a);
		else
			return "not found";
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int a =0;
		while(a !=-1) {
		 a =in.nextInt();
		Hash c = new Hash();
		String name  = c.getHash(a);
		System.out.println(name);
		}
	}

}
