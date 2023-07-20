package day10.misc;

class Division{
	public static int divides(int a, int b) throws IllegalArgumentException {
		if(b == 0) throw new IllegalArgumentException("Denominator can't be zero");
		else return a/b;
	}
}

public class DivisionCheckedvUnchecked {
	
	public static void main(String[] args) {
		System.out.println(Division.divides(10, 0));
	}

}
