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
		 
		 //List the names
		 String allNames = "";
		 for (String name : names) {
			 allNames += name + ", ";
		 }
		 System.out.println(allNames);
		
	}

}
