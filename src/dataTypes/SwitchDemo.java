package dataTypes;

public class SwitchDemo {

	public static void main(String[] args) {

		/*
		 * Switch Statement Syntax Switch (expression){ case value 1: //code to be
		 * executed break; case value 2: // code to be executed break
		 * 
		 * default: //code to be executed
		 * 
		 */

		int dayNumber = 3;

		switch (dayNumber) {
		case 1: {
			System.out.println("IT is Monday today!");
		}
			break;
		case 2: {
			System.out.println("IT is Tuesday today!");
		}
			break;
		case 3: {

			System.out.println("IT is Wednesday today!");
		}
			break;
		case 4: {
			System.out.println("IT is Thursday today!");
		}
			break;
		case 5: {
			System.out.println("IT is Friday today!");
		}
			break;
		case 6: {
			System.out.println("IT is Saturday today!");
		}
			break;
		case 7: {
			System.out.println("IT is Sunday today!");
		}
		default:
			System.out.println("Sorry it is not a day");

		}

	}

}
