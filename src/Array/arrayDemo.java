package Array;

public class arrayDemo {

	public static void main(String[] args) {
		// declaring array
		String[] myArray = new String[3];
		// assigning value to the array
		myArray[0] = "Selenuim";
		myArray[1] = "Eclipse";
		myArray[2] = "Java";

		System.out.println(myArray[1]);

		for (int i = 0; i < myArray.length; i++) {
			System.out.println(myArray[i]);
		}

		int[] number = { 4, 2, 7 };
		for (int i = 0; i < number.length; i++) {
			System.out.println("Example for enhance for loop");
		}
		// example for enhanced for loop
		for (int v : number) {
			System.out.println(v);
		}
	}
}
