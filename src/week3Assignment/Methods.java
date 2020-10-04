package week3Assignment;

import java.util.Scanner;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//7. method test				
		System.out.println("code step 7. " + concatStrings("Hello", 3));
		
		//8. method test
		String firstName = "John";
		String lastName = "Hancock";
		System.out.println("code step 8. " + fullName(firstName, lastName));
		
		//9. method test
		int[] myNumbers = new int [6];
		myNumbers[0] = 3;
		myNumbers[1] = 9;
		myNumbers[2] = 23;
		myNumbers[3] = 64;
		myNumbers[4] = 2;
		myNumbers[5] = 8;
		System.out.println("code step 9. is my number array big? " + isBig(myNumbers));
		
		//10. method test
		double[] doubleNumbers = new double[5];
		doubleNumbers[0] = 4.6;
		doubleNumbers[1] = 5.2;
		doubleNumbers[2] = 2.1;
		doubleNumbers[3] = 8.9;
		doubleNumbers[4] = 10.2;
		System.out.println("code step 10. average of array is " + aveNumbers(doubleNumbers));
		
		//11. method test
		double[] doubleNumbers2 = new double[3];
		doubleNumbers2[0] = 4.6;
		doubleNumbers2[1] = 5.2;
		doubleNumbers2[2] = 2.1;
		System.out.println("code step 11. is array 1 ave biger than array 2 ave: " + firstGreaterthanSecond(doubleNumbers, doubleNumbers2));
		
		//12. method test
		boolean hot = true;
		double money = 10.20;
		System.out.println("code step 12. is it hot and do I have enough money? " + willBuyDrink(hot, money));
		
		//13. use method to add new item to a packing list
		
		String[] packingList = new String[4];
		
		Scanner newItem = new Scanner(System.in);

		System.out.println("Enter an item to add to packing list:");
		String answer;
		int i = 0;
		do {
			answer = newItem.nextLine();
			addToList(packingList, answer, i);	
			i++;
		} while (i < packingList.length);
		System.out.println("done with packing list");
	}

	//7.	Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. 
			//(i.e. if I pass in “Hello” and 3, I would expect the method to return “HelloHelloHello”).
	public static String concatStrings(String word, int n) {
		
		String fullString = "";
		for (int i = 1; i <= n; i++) {
			fullString += word;
		}
		return fullString;
	}

	//8.	Write a method that takes two Strings, firstName and lastName, and returns a full name 
	//(the full name should be the first and the last name as a String separated by a space).
	public static String fullName (String first, String last) {
		return (first + " " + last);
	}
	
	//9.	Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
	public static boolean isBig (int[] numbers) {
		int arrayTot = 0;
		for (int i = 0; i < numbers.length; i++) {
			arrayTot += numbers[i];
		}
		return (arrayTot > 100);
	}
	
	//10.	Write a method that takes an array of double and returns the average of all the elements in the array.
	public static double aveNumbers (double[] elements) {
		double arrayTot = 0;
		for (int i = 0; i < elements.length; i++) {
			arrayTot += elements[i];
		}
		return (arrayTot / (elements.length + 1));
	}
	
	//11.	Write a method that takes two arrays of double and returns true if the average of the elements in the 
	//first array is greater than the average of the elements in the second array.
	public static boolean firstGreaterthanSecond(double[] array1, double[] array2) {
		return (aveNumbers (array1) > aveNumbers (array2));
	}
	
	//12.	Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, 
	//and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
	public static boolean willBuyDrink (boolean isHotOutside, double moneyInPocket) {
		return (isHotOutside && moneyInPocket > 10.50);
	}
	
	//13.	Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
	//This method adds string items to any string array and tells the user that the item has been added
	
	public static void addToList(String[] list, String newItem, int itemNum) {
	
		list[itemNum] = newItem;
		System.out.println(newItem + " has been added as number " + (itemNum + 1) + " in your list");
//		int i = 0;
//		while ((i < list.length) && (list[i] != "")) {
//			i++;
//		}
//		if (i < list.length - 1) {
//			list[i] = newItem;
//			return true;			
//		} else return false;
	}
	
	//public static String mealPlan (int dayOfWeek, String[] meals, string ingredient) {
		
	//}
}
