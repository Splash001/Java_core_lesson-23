package ua.lviv.lgs.task1;

public class Human {
	private int wieght;
	private int height;
	
	public Human(int wieght, int height) {
		super();
		this.wieght = wieght;
		this.height = height;
	}
	public int getWieght() {
		return wieght;
	}
	public int getHeight() {
		return height;
	}
	public void setWieght(int wieght) {
		this.wieght = wieght;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	@Override
	public String toString() {
		return "Human [wieght=" + wieght + ", height=" + height;
	}	
}
