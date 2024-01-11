
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class ExtraCredit{
	public static void main(String[] args) throws IOException {
		if (args.length != 1) {
		//check for proper number of args
			System.out.print("ERROR: Invalid number of arguments! Please select only one file as input!" + 
								"\nExiting Program!");
			return;			
		}

		//declare and instantiate objects
		SortSearch sortSearchObj = new SortSearch();
		FileInputStream fileInput = new FileInputStream(args[0]);
		Scanner inFS = new Scanner(fileInput);
		Scanner scnr = new Scanner(System.in);

		while (inFS.hasNextLine()) {
			String nextLine = inFS.nextLine();
			Scanner inInputLine = new Scanner(nextLine); //?

			while (inInputLine.hasNextInt()) {
			//parse lineInput for ints and add to sortSearchObj's array
				sortSearchObj.addElem(inInputLine.nextInt());
			}
			inInputLine.close();
		}
		//close input stream and scanners 
		inFS.close();
		fileInput.close();
		//call insertion sort and printArray methods
		sortSearchObj.insertionSort();
		sortSearchObj.printArr();

		//prompt user to search for an element and display results
		System.out.print("Please input the integer you would like to find: ");
		
		if (!scnr.hasNextInt()) {
			System.out.println("Invalid Input! Exiting Program!");
			return;
		}

		int inputInt = scnr.nextInt();
		scnr.nextLine();
		System.out.println();

		//call binarySearch() and display results
		int foundAt = sortSearchObj.binarySearch(inputInt, 0, sortSearchObj.getNumElem(), 0);

		if (foundAt == -1) {
			System.out.println("The integer you searched was not in the array! Exiting Program!");
			return;
		}
		System.out.println("The integer you searched was found at index number: " + foundAt + ". Goodbye!");
	}
}