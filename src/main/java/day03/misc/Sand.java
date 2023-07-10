package day03.misc;

public class Sand {

	private static int numShovels;
	
	private static int numRakes;
	
	
	
	public static int getNumShovels() {
	
	return numShovels;
	
	}
	
	
	
	public static int getNumRakes() {
	
	return numRakes;
	
	}
	
	
	
	public Sand() {
	
	System.out.print("a");
	
	}
	
	
	
	public void Sand() {
	
	System.out.print("b");
	
	}
	
	
	
	public void run() {
	
	new Sand();//a
	
	Sand();//b
	
	}
	
	
	
	public static void main(String[] args) {
	
	new Sand().run();//aab
	
	}

}
