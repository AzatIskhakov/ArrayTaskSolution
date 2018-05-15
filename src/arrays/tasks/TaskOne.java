package arrays.tasks;

import java.io.IOException;
import java.util.Scanner;

/*
 * Implement a function that calculates the sum of digits for a given char array consisting of
 * the digits '0' to '9'. The function should return the digit sum as a long value.
 */

public class TaskOne {
	
	private static Scanner scanner = new Scanner(System.in);
	
	private static int capacity;
	
	public TaskOne(int capacity) {
		this.capacity = capacity;
	}
	
	static int setCapacity() throws IOException, NumberFormatException
	{
		int capacity = scanner.nextInt();
		return capacity;
	}
	
	
	
	public char[] createArrayOfChars() {
		
		
		char arr[] = new char[capacity];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scanner.next().charAt(0);	
		}
		printChars(arr);
		intArray(arr);
		return arr;
	}
	
	public static int[] intArray(char[] arrayOfChars) {
		int[] arrInt = new int[capacity];
		for(int i = 0; i < arrayOfChars.length; i++) {
			arrInt[i] = Integer.valueOf(arrayOfChars[i]).intValue();
		}
		sumOfElem(arrInt);
		return arrInt;
	}

	
	public static void printChars(char[] array) {
		
		for(int i = 0; i < array.length; i++) {
			System.out.print(" a[" + i + "]=" + array[i]);
		}
	}
	
	public static long sumOfElem(int[] arrInt)
	{
		long result = 0;
		for(int i = 0; i < arrInt.length; i++)
	    {
	    	result += arrInt[i];
	    }
		System.out.print("\nThe sum of digits is: ");
		System.out.println(result);
		return result;
		
		
	}	

}
