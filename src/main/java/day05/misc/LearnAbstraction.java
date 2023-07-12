package day05.misc;

abstract class Shapeabs{
	public abstract void draw();
}

class Rectangleabs extends Shapeabs{
	
	@Override
	public void draw() {
		System.out.println("Draw a Rectangle");
	}
	
}

class Squareabs extends Rectangleabs{
	
	@Override
	public void draw() {
		System.out.println("Draw a Square");
	}
}

public class LearnAbstraction {
	
	public static void main(String[] args) {
		
		Rectangleabs rec = new Rectangleabs();
		
		Squareabs sqr = new Squareabs();
		
		rec.draw();
		sqr.draw();
	}

}

