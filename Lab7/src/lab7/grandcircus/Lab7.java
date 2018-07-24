package lab7.grandcircus;

import java.util.Scanner;

public class Lab7 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		System.out.println(
				"Hello! I'd like to know your name, email and phone number in order to initiate your annuitiy payments.\n");

		String name = Validator.getName(scnr, "Now, Enter your first name so I know who I'm speaking with:\n",
				"^[A-Z][a-z ]{0,30}$");

		String mail = Validator.getMail(scnr, "Now, please enter a valid email: (eddiecane@gmail.com)\n",
				"^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$");

		String number = Validator.getNumber(scnr,
				"Okay, now input a valid phone number that includes an area code and dashes: (313-555-1212)\n",
				"\\d{10}|(?:\\d{3}-){2}\\d{4}|\\(\\d{3}\\)\\d{3}-?\\d{4}");

		String date = Validator.getDate(scnr,
				"Sounds good... Now alls I need from you is a date that you'd like your payment to go into effect: (DD/MM/YYYY)\n",
				"^(1[0-2]|0[1-9])/(3[01]|[12][0-9]|0[1-9])/[0-9]{4}$");

		System.out.println(".\n" + ".\n" + ".\n" + ".\n" + ".\n" + ".\n" + ".\n" + ".\n" + ".\n");
		System.out.println("We now have all we need to get you going, " + name
				+ "! We'll be starting your payments on: " + date + "\n");
		System.out.println("We'll email you a statement every month on the first to: " + mail + "\n");
		System.out.println("We'll call you at " + number
				+ " if we have any issues processing your payments.\n\nHave a wonderful day, " + name + "!-)");

		scnr.close();
	}
}
