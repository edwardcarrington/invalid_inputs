package lab7.grandcircus;

import java.util.Scanner;

public class Validator {

	public static String getString(Scanner scnr, String prompt) {
		// This approach uses exception handling.
		System.out.print(prompt);
		return scnr.nextLine();
	}

	public static String getName(Scanner scnr, String prompt, String regex) {
		boolean isValid = false;
		String input;
		do {
			input = getString(scnr, prompt);

			if (input.matches(regex)) {
				isValid = true;
			} else {
				System.out.println(
						"You must enter in a name that starts with a capital letter, and with no more than 30 characters.");
				isValid = false;
			}

		} while (!isValid);
		return input;
	}

	public static String getMail(Scanner scnr, String prompt, String regex) {
		boolean isValid = false;
		String input;
		do {
			input = getString(scnr, prompt);

			if (input.matches(regex)) {
				isValid = true;
			} else {
				System.out.println("Input must enter your email using the appropriate fomat.");
				isValid = false;
			}

		} while (!isValid);
		return input;
	}

	public static String getNumber(Scanner scnr, String prompt, String regex) {
		boolean isValid = false;
		String input;
		do {
			input = getString(scnr, prompt);

			if (input.matches(regex)) {
				isValid = true;
			} else {
				System.out.println("Your phone number must be in the appropriate format.");
				isValid = false;
			}

		} while (!isValid);
		return input;
	}

	public static String getDate(Scanner scnr, String prompt, String regex) {
		boolean isValid = false;
		String input;
		do {
			input = getString(scnr, prompt);

			if (input.matches(regex)) {
				isValid = true;
			} else {
				System.out.println("The date that you enter must be in the appropriate format.");
				isValid = false;
			}

		} while (!isValid);
		return input;
	}

}