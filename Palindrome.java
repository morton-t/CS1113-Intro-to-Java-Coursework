import java.util.Scanner;

public class Palindrome{
	public static String print(Scanner scnr){
		System.out.print("Type a letter: ");
		String s = "" + scnr.nextLine().charAt(0);

		System.out.print("Done?" );

		if (scnr.nextLine().charAt(0) == ('y')) {
			return s + s;
		}

		else if (scnr.nextLine().charAt(0) == 'z') {
			return s;
		}

		return s + print(scnr) + s;

	}


	public static void main(String[] args){
		System.out.print("Do eet: ");
		Scanner scnr = new Scanner(System.in);
		System.out.println(print(scnr));
	}
}