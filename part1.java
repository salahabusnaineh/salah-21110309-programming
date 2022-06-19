# salah-21110309-programming
import java.util.Scanner;

public class Main {
	static void binaryToDecimal(int binary) {
		int n = binary;
		int decimal = 0;
		int base = 1;
		int lastDigit = 1;
		while (n > 0) {
			lastDigit = n % 10;
			n = n / 10;
			decimal += lastDigit * base;
			base = base * 2;
		}
		String Digits = Integer.toString(decimal);
		int[] numbers = new int[Digits.length()];
		for (int i = 0; i < Digits.length(); i++) {
			numbers[i] = Digits.charAt(i) - '0';
		}
		for (int i = 0; i < numbers.length; i++) {

			digitalFormat(numbers[i]);
		}
	}

	static void digitalFormat(int digital) {
		String format = "";

		if (digital == 0 || digital == 2 || digital == 3 || digital == 5 || digital == 6 || digital == 7 || digital == 8
				|| digital == 9) {
			System.out.print("\n _ \n");
		}
		if (digital == 6) {
			System.out.println("|_");
		}
		if (digital == 5 || digital == 4) {
			System.out.print("|");
		}
		if (digital == 0) {
			System.out.print("| ");
		}
		if (digital == 8) {
			System.out.print("|_|");
		}
		if (digital == 9) {
			System.out.println("|_|");
		}
		if (digital == 4) {
			System.out.println("_|");

		}

		if (digital == 1) {
			System.out.print("\n  |\n");
		}
		if (digital == 0 || digital == 7) {
			System.out.print("  |\n");
		}
		if (digital == 3 || digital == 2 || digital == 9) {
			System.out.println(" _|");
		}
		if (digital == 5) {
			System.out.println("_");

		}
		if (digital == 0 || digital == 2) {
			System.out.print("|");
		}
		if (digital == 5 || digital == 3) {
			System.out.print(" _");

		}
		if (digital == 0 || digital == 1 || digital == 4 || digital == 7) {
			System.out.print("  |\n");
		}
		if (digital == 5 || digital == 3) {
			System.out.println("|");
		}
		if (digital == 0) {
			System.out.print(" _");
		}
		if (digital == 2) {
			System.out.print("_");
		}
		if (digital == 8) {
			System.out.print("\n|_|");
		}
		if (digital == 6) {
			System.out.print("|_|");
		}
	}

	public static void main(String[] args) {
		Scanner numberObj = new Scanner(System.in); // Create a Scanner object
		System.out.println("Enter Binary Number");
		int number = numberObj.nextInt();
		binaryToDecimal(number);
	}

}
