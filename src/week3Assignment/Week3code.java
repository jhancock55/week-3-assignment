package week3Assignment;

public class Week3code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        //coding step 1) 
		
		int[] ages = new int[8];
		
		ages[0] = 3;
		ages[1] = 9;
		ages[2] = 23;
		ages[3] = 64;
		ages[4] = 2;
		ages[5] = 8;
		ages[6] = 28;
		ages[7] = 93;
		
		//code step 1a
		System.out.println("answer to code step 1a) is " + (ages[ages.length - 1] - ages[0]));
		
		//code step 1b
		
		//code step 1c
		
		double ageSum = 0;
		for (int i = 0; i < ages.length; i++) {
			ageSum += ages[i];
		}
		System.out.println("code step 1c, average age is " + (ageSum / ages.length));
		
		//2.	Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		//		a.	Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
		//		b.	Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
		String[] names = new String[6];
		
		names[0] = "Sam";
		names[1] = "Tommy";
		names[2] = "Tim";
		names[3] = "Sally";
		names[4] = "Buck";
		names[5] = "Bob";
		
		double totalLettersInNames = 0;
		for (int i = 0; i < names.length; i++) {
			totalLettersInNames += names[i].length();
		}
		System.out.println("Average letters per name is " + totalLettersInNames / names.length);
		
		
		//code step 5: Create a new array of int called nameLengths. 
		//Write a loop to iterate over the previously created names array 
		//and add the length of each name to the nameLengths array.
		
		int[] nameLengths = new int[6];
		
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
		}
		
		//6.	Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
		
		int nameLengthSum = 0;
		for (int i = 0; i < nameLengths.length; i++) {
			nameLengthSum += nameLengths[i];
		}
		System.out.println("Sum of all of the letters in the Names array is " + nameLengthSum);
		
		
	}

}
