package laurenAndrewsCodingProject;

public class Week04CodingProject {

	public static void main(String[] args) {
		// array of int called ages that contains the following values:
		// 3, 9, 23, 64, 2, 8, 28, 93
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		
		//now to do some math on the last element. I need to subtract 3 from 93
		int firstSum = ages[0] - ages[ages.length -1];
		//to get the last value you'll need its index. 
		//The index is the length of the overall array -1 because the index starts at 0
		System.out.println(firstSum);
		//as expected i got -90. 
		
		int[] ages2 = {14, 3, 23, 9, 64, 8, 28, 93, 60};
		int secondSum = ages2[0] - ages2[ages2.length -1];
		System.out.println(secondSum);
		//-46 is what it came up with. 
		//now to find the average age from the first array, ages.
		int sum = 0;
		for (int age : ages) {
			sum += age;
		}
		 int averageAges = sum / ages.length;
		 System.out.println("Average Age = " + averageAges);
		 // the output was 28 which is the correct math.
		 
		 
		 
		 
		 
		 
		 //Now for strings
		 String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		 
		 //Find the average letters per name
		 int sumLetters = 0;
		 for (String name : names) {
			 sumLetters += name.length();
		 }
		 int averageLetters = sumLetters / names.length;
		 System.out.println("Average Letters = " + averageLetters);
		 System.out.println("  ");
		 
		 //List the names
		 String allNames = "";
		 for (String name : names) {
			 allNames += name + ", ";
		 }
		 System.out.println(allNames);
		 System.out.println("  ");
		 
		 String question3 = "How do you access the last element of any array?";
		 String answer3 = "By subtracting 1 from the length of the array to find the index";
		 System.out.println(question3 + ":");
		 System.out.println(answer3);
		 System.out.println("ages[ages.length -1]");
		 System.out.println("  ");
		 
		 String question4 = "How do you access the first element of any array?";
		 String answer4 = "Simple. The index is 0";
		 System.out.println(question4 + ":"); 
		 System.out.println(answer4);
		 System.out.println("ages[0]");
		 System.out.println("  ");
		 
		 //Question 5: number of letters in each name
		 System.out.println("Name Lengths Array:");
		 int[] nameLengths = new int[names.length];
		 for (int i = 0; i < names.length; i++) {
			 nameLengths[i] = names[i].length();
			 System.out.print(nameLengths[i] + " ");
		 }
		 System.out.println(" ");
		 
		 //Question 6: sum of all letters
		 System.out.println("The Sum of all the Name Lengths:");
		 int nameSum = 0;
		 for (int name : nameLengths) {
			 nameSum += name;
		 }
		 System.out.println(nameSum);
		 System.out.println("  ");
		 
		 //Now for Methods
		 //Prompt 7
		 System.out.println("Concatenate method");
		 System.out.println(concatenateWord("Hello", 5));
		 System.out.println("  ");
		 
		 //Prompt 8
		 System.out.print("Print a full name: ");
		 System.out.println(fullName("Lauren", "Andrews"));
		 System.out.println("  ");
		 
		 
		 //Prompt 9
		 System.out.println("For this one, lets reuse the array of ages from earlier.");
		 printArray(ages);
		 System.out.println("The sum of all the ages is greater than 100.");
		 System.out.println(sumIsGreater100(ages));
		 System.out.println("  ");
		 
		 //Prompt 10
		 System.out.println("An average of a double array");
		 double[] prices = {2.50, 10.99, 4.20};
		 printDoubleArray(prices);
		 System.out.println("  ");
		 System.out.println(averageOfArray(prices));
		 System.out.println("  ");
		 
		 //Prompt 11
		 System.out.println("Two double arrays, Averaged");
		 double[] prices2 = {14.92, 3.99, 9.59};
		 System.out.println("Using the same array as before plus a new one");
		 printDoubleArray(prices);
		 System.out.println("  ");
		 printDoubleArray(prices2);
		 System.out.println("  ");
		 System.out.println("The first array has a higher average than the second. " + firstHasGreaterAverage(prices, prices2));
		 System.out.println("  ");
		 
		 System.out.println("Do I want to buy a drink?");
		 boolean hotOutside = false;
		 System.out.println("Is it hot outside?");
		 System.out.println(hotOutside);
		 double moneyInPocket = 15.42;
		 System.out.println("How much money do I have in my pocket?");
		 System.out.println(moneyInPocket);
		 if (willBuyDrink(hotOutside, moneyInPocket) == true) {
			 System.out.println("I think I will get something to drink.");
		 } else {
			 System.out.println("I don't think I want something to drink.");
		 }
		 System.out.println("  ");
		 
		 //Prompt 13 , a method to solve a problem
		 
		 
		  
	} 

	public static String concatenateWord(String word, int n) {
		String finalWord = "";
		for (int i = 0; i < n; i++) {
			finalWord += word;
		}
		return finalWord;
	}
	
	public static String fullName(String firstName, String lastName) {
		String fullName = firstName + " " + lastName;
		
		return fullName;
	}
	
	public static boolean sumIsGreater100(int[] numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		if (sum > 100) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void printArray(int[] someArray) {
		for (int n : someArray) {
			System.out.print(n + " ");
		}
	}
	public static void printDoubleArray(double[] someArrays) {
		for (double n : someArrays) {
			System.out.print(n + " ");
		}
	}
	
	public static double averageOfArray(double[] decimalArray) {
		double average = 0;
		double sum = 0;
		int count = 0;
		for (double num : decimalArray) {
			sum += num;
			count ++;
		}
		average = sum / count;
		return average;
	}
	
	public static boolean firstHasGreaterAverage(double[] firstArray, double[] secondArray) {
		double firstSum = 0;
		int firstLength = firstArray.length;
		for (double n : firstArray) {
			firstSum += n;
		}
		double firstAverage = firstSum / firstLength;
		
		double secondSum = 0;
		int secondLength = secondArray.length;
		for (double nn : secondArray) {
			secondSum += nn;
		}
		double secondAverage = secondSum / secondLength;
		
		if (firstAverage > secondAverage) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if (isHotOutside == true && moneyInPocket > 10.50) {
			return true;
		} else {
			return false;
		}
	}
	
	static boolean isCommandValid(String[] clArgs) {
		boolean isValid = true;
		if (clArgs.length != 0) {
			isValid = true;
		} else {
			System.out.println("Please enter an Argument.");
			isValid = false;
		}
		return isValid;
	}
	
	
	
	}


