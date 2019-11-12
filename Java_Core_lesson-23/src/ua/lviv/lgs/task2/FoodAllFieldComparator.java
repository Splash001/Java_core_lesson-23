package ua.lviv.lgs.task2;

import java.util.Comparator;

public class FoodAllFieldComparator implements Comparator<Food>{	
	
	@Override
	public int compare(Food i1, Food i2) {
		if (i1.getName().compareTo(i2.getName()) > 0) {
			return 1;
		} else if (i1.getName().compareTo(i2.getName()) < 0) {
			return -1;
		} else if (i1.getCost() > i2.getCost()) {
			return 1;
		} else if (i1.getCost() < i2.getCost()) {
			return -1;
		}		
		return 0;
	}
}
