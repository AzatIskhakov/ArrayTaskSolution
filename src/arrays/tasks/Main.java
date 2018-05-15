package arrays.tasks;

import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	private void taskSum() throws NumberFormatException, IOException {
		
		/*
		 * Implement a function that calculates the sum of digits for a given char array consisting of
		 * the digits '0' to '9'. The function should return the digit sum as a long value.
		 */
		TaskOne taskOne;
		
		try {
			System.out.print("Enter characters: ");
			taskOne = new TaskOne(TaskOne.setCapacity());
			System.out.println("Insert chars: ");
			taskOne.createArrayOfChars();
			
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}
	

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		Main main = new Main();
		main.taskSum();
		

	}

}
