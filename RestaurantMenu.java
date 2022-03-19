//Restaurant Management System
package PartTwo;

import java.util.Scanner;

public class RestaurantMenu {
	public static Scanner input = new Scanner(System.in);
	public static int choice, quantity = 1;
	public static String again;
	public static double total = 0, pay;

	public static void menu() {
		System.out.println("=======================================");
		System.out.println("\t WELCOME TO OUR RESTAURANT        ");
		System.out.println("\t  Restaurant Menu :               ");
		System.out.println("\t  1.Barger         BDT:90.00");
		System.out.println("\t  2.Pizza          BDT:180.00");
		System.out.println("\t  3.Coffee         BDT:30.00");
		System.out.println("\t  4.Cancel                  ");
		System.out.println("=======================================");
	}

	public static void order() {
		System.out.println(
				"Press 1 to order Barger!! Press 2 to order Pizza!! Press 3 to order Coffee!! Press 4 to cancel");
		System.out.print("Press you want to Order : ");
		choice = input.nextInt();
		if (choice == 1) {
			System.out.println("You Choice Barger");
			System.out.print("How many Barger you to want to order : ");
			quantity = input.nextInt();
			total = total + (quantity * 55);
			System.out.println("Total Amount is : " + total);
			System.out.println("You want to buy again ? ");
			System.out.print("Press Y for [YES] and N for [NO] : ");
			again = input.next();
			if (again.equalsIgnoreCase("Y")) {
				order();
			} else {

				System.out.print("Enter Payment : ");
				pay = input.nextDouble();
				if (pay < total) {

					System.out.println("Not Enough Payment");
				} else {
					// System.out.println("Total Amount is : " + total);
					total = pay - total;
					System.out.println("Customer's Return Amount is : " + total);
				}

			}
		}

		else if (choice == 2) {
			System.out.println("You Choice Pizza");
			System.out.print("How many Pizza you to want to order : ");
			quantity = input.nextInt();
			total = total + (quantity * 80);
			System.out.println("Total Amount is : " + total);
			System.out.println("You want to buy again ? ");
			System.out.print("Press Y for [YES] and N for [NO] : ");
			again = input.next();
			if (again.equalsIgnoreCase("Y")) {
				order();
			} else {
				System.out.print("Enter Payment : ");
				pay = input.nextDouble();
				if (pay < total) {

					System.out.println("Not Enough Payment");
				} else {
					// System.out.println("Total Amount is : " + total);
					total = pay - total;
					System.out.println("Customer's Return Amount is : " + total);
				}

			}
		}

		else if (choice == 3) {
			System.out.println("You Choice Coffee");
			System.out.print("How many Cup of Coffee you to want to order : ");
			quantity = input.nextInt();
			total = total + (quantity * 30);
			System.out.println("Total Amount is : " + total);
			System.out.println("You want to buy again ? ");
			System.out.print("Press Y for [YES] and N for [NO] : ");
			again = input.next();
			if (again.equalsIgnoreCase("Y")) {
				order();
			} else {
				System.out.print("Enter Payment : ");
				pay = input.nextDouble();
				if (pay < total) {
					
					System.out.println("Not Enough Payment");
				} else {
					// System.out.println("Total Amount is : " + total);
					total = pay - total;
					System.out.println("Customer's Return Amount is : " + total);
				}

			}
		} else if (choice == 4) {
			System.exit(0);
		} else {
			System.out.println("Choose 1 to 3 only");
			order();
		}
	}

	public static void main(String[] args) {

		String user, pass;
		String setname = "abcd";
		String setpas = "wxyz";

		System.out.print("Enter User name : ");
		user = input.nextLine();
		System.out.print("Enter Password : ");
		pass = input.nextLine();
		if (user.equals(setname) && pass.equals(setpas)) {
			menu();
			order();
		} else {
			System.out.println("Log in failed ! Try again");
		}

	}
}
