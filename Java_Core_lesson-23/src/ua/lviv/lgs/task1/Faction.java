package ua.lviv.lgs.task1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import javax.imageio.event.IIOReadProgressListener;

public class Faction {

	Deputy deputy;
	private String name;
	// boolean bribeTaker;

	ArrayList<Deputy> deputies = new ArrayList<Deputy>();

// 1 - Add new deputy
	public void addDeputy() {
		Deputy deputy = new Deputy(0, 0);
		Scanner scanner = new Scanner(System.in);
		System.out.println("¬вед≥ть вагу депутата:");
		int weight = scanner.nextInt();
		System.out.println("¬вед≥ть його зр≥ст:");
		int height = scanner.nextInt();
		System.out.println("¬вед≥ть пр≥звище депутата:");
		String surname = scanner.next();
		System.out.println("¬вед≥ть ≥м€ депутата:");
		String name = scanner.next();
		System.out.println("¬вед≥ть його в≥к:");
		int age = scanner.nextInt();
		System.out.println("„и Ї цей депутат хаба ником (так чи н≥)?");
		String str = scanner.next();
		if (str.equals("так")) {
			deputy.bribeTaker = true;
			deputy.takeBribe();
			deputies.add(new Deputy(weight, height, surname, name, age, deputy.bribeTaker, deputy.bribeSize));
		} else {
			deputy.bribeTaker = false;
			deputies.add(new Deputy(weight, height, surname, name, age, deputy.bribeTaker));
		}

	}

// 2 - Delete deputy
	public void deleteDeputy() {
		boolean isDeleted = false;
		Scanner scanner = new Scanner(System.in);
		System.out.println("¬вед≥ть п ≥звище депутата: ");
		String str = scanner.nextLine();

		Iterator<Deputy> iterator = deputies.iterator();
		while (iterator.hasNext()) {
			Deputy next = iterator.next();

			if (next.getSurname().equals(str)) {
				iterator.remove();
				isDeleted = true;
			}
			if (isDeleted == false) {
				System.out.println("Ўкода, та в наш≥й ф акц≥њ такого депутата немаЇ");
			}
		}
	}

// 3 - Print all briber
	public void printAllBriber() {
		Iterator<Deputy> iterator = deputies.iterator();
		while (iterator.hasNext()) {
			Deputy next = iterator.next();

			if (next.isBribeTaker()) {
				System.out.println(next.toString());
			}
		}
	}

//	4 - Print most briber taker
	public void printMostBriberTaker() {
		int max = 0;
		Iterator<Deputy> iterator = deputies.iterator();
		while (iterator.hasNext()) {
			Deputy next = iterator.next();

			if ((next.isBribeTaker()) && (next.getBribeSize() > max)) {
				max = next.getBribeSize();
			}
		}

		Iterator<Deputy> iterator2 = deputies.iterator();
		while (iterator2.hasNext()) {
			Deputy next = iterator2.next();

			if ((next.isBribeTaker()) && (next.getBribeSize() == max)) {
				System.out.println(next.toString());
			}
		}
	}

// 5 - Print all deputy	
	public void printAllDeputy() {
		Iterator<Deputy> iterator = deputies.iterator();
		while (iterator.hasNext()) {
			Deputy next = iterator.next();
			System.out.println(next.toString());
		}
	}

// 6 - Delete all deputy	
	public void deleteAllDeputy() {
		deputies.clear();
	}

	public Faction(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "‘ракц≥€= " + name;
	}

	public String toStringAllDeputy() {
		return "‘ракц≥€= " + name + ": ƒепутати= " + deputies;
	}


}
