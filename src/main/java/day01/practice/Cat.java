package day01.practice;

public class Cat {
    // Attributes
    private boolean hasDots;
    private String color;
    private int age;
    private String sound;


	// Getters and setters
    public boolean hasDots() {
        return hasDots;
    }

    public void setHasDots(boolean hasDots) {
        this.hasDots = hasDots;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void speaks(String sound) {
		this.sound = sound;
	}

    // Main method to create Cat objects
    public static void main(String[] args) {
    	
        // Create two Cat objects
        Cat Cat1 = new Cat();
        Cat1.setColor("purple");
        Cat1.setHasDots(false);
        Cat1.setAge(6);
        Cat1.speaks("Meow");
        
        
        Cat Cat2 = new Cat();
        Cat2.setColor("blue");
        Cat2.setHasDots(true);
        Cat2.setAge(2);
        Cat2.speaks("wohhhhhh");

        // Print the attributes of each Cat
        System.out.println("Cat 1:");
        System.out.println("Has Dots: " + Cat1.hasDots());
        System.out.println("Color: " + Cat1.getColor());
        System.out.println("Age : " + Cat1.getAge());
        System.out.println("Makes Sound: " + Cat1.sound);

        System.out.println("Cat 2:");
        System.out.println("Has Dots: " + Cat2.hasDots());
        System.out.println("Color: " + Cat2.getColor());
        System.out.println("Age : " + Cat2.getAge());
        System.out.println("Makes Sound: " + Cat2.sound);
    }
}