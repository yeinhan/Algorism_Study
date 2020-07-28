package study;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class ex5403 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int size;
		System.out.print("사이즈 입력:");
		size = sc.nextInt();
		
//		int a[] = new int[size];
//		
//		for(int i=0; i<size; i++) {
//			a[i] = sc.nextInt();
//			
//		}
//		
//		
//		R(a,size);
//		
//		for(int i=0; i<size; i++) {
//			System.out.printf("%d  ",a[i]);
//		}
//		System.out.println();
//		
//		D(a,size);
//		
//		for(int i=0; i<size; i++) {
//			System.out.printf("%d  ",a[i]);
//		}
		ArrayList<Integer> a1 = new ArrayList<Integer>(size);
		
		for(int i=0; i<size; i++) {
			a1.add(sc.nextInt());
			
		}
		
		
		R(a1,size);
		
		
		D(a1,size);
		
		R(a1,size);
		
	}
	
	
	public static void R(ArrayList<Integer> a1, int size) {
//		int temp;
//		
//		for(int i=0; i<size/2; i++) {
//			temp = a[i];
//			a[i] = a[(size-1)-i];
//			a[(size-1)-i] = temp;
//			
//		}
		Collections.reverse(a1);
		System.out.println(a1);
		
		
	}
	
	public static void D(ArrayList<Integer> a1, int size) {
//		for(int i=0; i<size-1; i++) {
//			a[i] = a[i+1];
//		}
		
//		int cnt = 0;
//		Scanner sc = new Scanner(System.in);
//		
//		while(true) {
//		        for(int i=0; i<size-1; i++) {
//		             a[i] = a[i + 1];
//		        }
//		        size = size - 1;
//		}
		
		a1.remove(1);
		System.out.println(a1);
		
	}
  
}
