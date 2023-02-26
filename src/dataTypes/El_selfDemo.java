package dataTypes;

public class El_selfDemo {

	public static void main(String[] args) {
	
		/** Else If syntax
		 * 
		 * if (condition
		 * {code to be executed 
		 * } else if (condition)
		 * {
		 * Code to be executed
		 * } else
		 * {
		 * Code to be executed
		 * } 
		 */

		
		int age = 16;
		if (age >=18 && age <= 80) {
			System.out.println("It is high time to get married");
			
		}else if (age > 80 && age >= 129)
		{
			System.out.println("Pray to God that you are in really good health");
		}
		else
		{
			System.out.println("You are too young!! \nWait for a while");
		}
	}

}
