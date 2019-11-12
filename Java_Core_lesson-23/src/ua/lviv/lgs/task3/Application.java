package ua.lviv.lgs.task3;

import java.util.Scanner;
import java.util.function.Supplier;

public class Application {

	public static void main(String[] args) {

		Supplier<Integer> menu = () -> {
			System.out.println("Press 1 to add product:");
			System.out.println("Press 2 to delete product:");
			System.out.println("Press 3 to change product:");
			System.out.println("Press 4 to sort by name:");
			System.out.println("Press 5 to sort by length product:");
			System.out.println("Press 6 to sort by width:");
			System.out.println("Press 7 to sort by weight:");
			System.out.println("Press 8 to print the product by index number: ");
			System.out.println("Press 9 to exit");
			Scanner sc = new Scanner(System.in);
			int number = sc.nextInt();
			return number;
		};

		Commodity commodity = new Commodity();

		while (true) {

			switch (menu.get()) {
			case 1: {
				commodity.addCommodity();
				commodity.printList();
				break;
			}
			case 2: {
				commodity.deleteCommodity();
				commodity.printList();
				break;
			}
			case 3: {
				commodity.changeCommodity();
				commodity.printList();
				break;
			}
			case 4: {
				commodity.nameSorted();
				break;
			}
			case 5: {
				commodity.lenghtSorted();
				break;
			}
			case 6: {
				commodity.widthSorted();
				break;
			}
			case 7: {
				commodity.weightSorted();
				break;
			}
			case 8: {
				commodity.printEnteredCommodity();
				;
				break;
			}
			case 9: {
				System.exit(0);
				break;
			}
			}
		}

	}

}
