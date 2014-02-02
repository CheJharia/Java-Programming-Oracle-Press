/*
 * Show the use of one dimensional array
 */

import java.io.*;
public class TestScoreAverage {
	public static void main(String[] args) {
//		a variable declared with final can only be initialized once
//		and its value can't be modified throughout the program 
		final int NUMBER_OF_STUDENTS = 3;
		int[] marks = new int[NUMBER_OF_STUDENTS];
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			for (int i = 0; i < NUMBER_OF_STUDENTS; i++) {
				System.out.println("Enter marks for student #" + (i+1) + ": ");
				String str = reader.readLine();
				marks[i] = Integer.parseInt(str);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		int total = 0;
		for (int i = 0; i < NUMBER_OF_STUDENTS; i++) {
			total +=marks[i];
		}
		System.out.println("Average Marks " + (float) total / NUMBER_OF_STUDENTS);
	}
}
