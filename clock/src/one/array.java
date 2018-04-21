package one;

import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		int[] a1= {1,2,3,4,5};
		int[] a2=a1;
		for(int i=0;i<a1.length;i++) {
		a2[i]++;
		}
		for(int i=0;i<a1.length;i++) {
			System.out.print(a1[i]+" ");
			}
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
			String s =in.nextLine();
			System.out.println(s);
	}

}
