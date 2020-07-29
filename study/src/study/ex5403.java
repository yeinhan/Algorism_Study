package study;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ex5403 extends Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> a = null;
		int size1;
		size1 = sc.nextInt();

		for (int i = 0; i < size1; i++) {
			int size;

			String str = sc.next();

			String[] strArray;
			strArray = str.split("");

			size = sc.nextInt();

			a= new ArrayList<Integer>(size);
			try {
				for (int k = 0; k < size; k++) {
					a.add(sc.nextInt());
				}
				
				for (int j = 0; j < strArray.length; j++) {
					if (strArray[j].equals("R")) {
						a = R(a, size);
					} else if (strArray[j].equals("D")) {
						a = D(a, size);
					}
				}
				
				System.out.println(a);
				
			} catch (Exception e) {
				System.out.println("error");
			}

		}
//		System.out.println(a);
	}

	public static ArrayList<Integer> R(ArrayList<Integer> a, int size) {
		Collections.reverse(a);
		return a;

	}

	public static ArrayList<Integer> D(ArrayList<Integer> a, int size) {
		a.remove(0);
		return a;

	}

}
