package ArrayOneDimensional;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		// write a program that creates an array of 10 element size
		// your program should prompt the user to input numbers in array and then display the sum of all array elements
		final int num = 10;
		int[] numbers = new int[num];
		
		Scanner in=new Scanner(System.in);
		
		System.out.print("Enter numbers: ");
		for(int i=0; i<numbers.length; i++) {
			numbers[i] = in.nextInt();
		}
		
		int sum = 0;
		for(int i=0; i<num; i++) {
			sum = sum += numbers[i];
		}
		System.out.println("Sum numbers= " + sum);
	}

}
