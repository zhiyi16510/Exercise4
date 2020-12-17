package ArrayOneDimensional;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		// The variable list1 and list2 are reference arrays that each have 5 elements 
		// Write code that copies the values in list1 to list2. Values in list1 are input by user
		
		Scanner in = new Scanner(System.in);
		
		String[] list1 = new String[5];
		String[] list2 = new String[5];
		
		System.out.println("Enter five elements for list 1: ");
		for(int i=0; i<list1.length; i++) {
			list1[i] = in.next();
		}
		System.out.println();
		
		System.out.println("List 1: ");
		for(int i=0; i<list1.length; i++) {
			System.out.println(list1[i]);
		}
		System.out.println();
		
		System.out.println("List 2: ");
		for(int i=0; i<list1.length; i++) {
			list2[i] = list1[i];
			System.out.println(list2[i]);
		}
		System.out.println();
		
		in.close();

	}

}
