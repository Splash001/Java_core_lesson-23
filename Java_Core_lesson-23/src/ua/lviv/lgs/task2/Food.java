package ua.lviv.lgs.task2;

public class Food implements Comparable<Food> {
	
	private String name;
	private int cost;
	
	public Food(String name, int cost) {
		super();
		this.name = name;
		this.cost = cost;
	}
	
	public String getName() {
		return name;
	}
	public int getCost() {
		return cost;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	@Override
	public String toString() {
		return "Food [name=" + name + ", cost=" + cost + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cost;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Food other = (Food) obj;
		if (cost != other.cost)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	@Override
	public int compareTo(Food i) {		
		return this.name.compareTo(i.getName());
	}
}
