package ua.lviv.lgs.task2;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Consumer;

public class FoodApplication {
	
	public static void main(String[] args) {
		
		Set<Food> setOfFood = new HashSet<>();
		Consumer<Food> addFood = food -> setOfFood.add(food);
		setOfFood.add(new Food("Banana", 10));
		setOfFood.add(new Food("Kokoa", 5));
		setOfFood.add(new Food("Bread", 2));
		setOfFood.add(new Food("Mustard", 12));
		setOfFood.add(new Food("Milk", 25));
		setOfFood.add(new Food("Coke", 5));
		setOfFood.add(new Food("Candy", 22));
		setOfFood.add(new Food("Peach", 3));
		setOfFood.add(new Food("Apple", 6));
		setOfFood.add(new Food("Plum", 13));
		setOfFood.add(new Food("SweetPotato", 1));
		setOfFood.add(new Food("Juice", 12));
		setOfFood.add(new Food("Grape", 11));
		setOfFood.add(new Food("Liquer", 38));
		setOfFood.add(new Food("Vodka", 27));
		setOfFood.add(new Food("Cogniac", 44));
		setOfFood.add(new Food("Tea", 5));
		setOfFood.add(new Food("Marmelade", 18));
		
		setOfFood.forEach(System.out::println);
		System.out.println();
		System.out.println("/****************************************/");
		System.out.println();
		
		Set<Food> sortedFood = new TreeSet<>();
		sortedFood.addAll(setOfFood);
		sortedFood.stream().sorted(new FoodAllFieldComparator()).forEach(System.out::println);
	}

}
