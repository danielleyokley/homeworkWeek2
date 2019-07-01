
public class booleanOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Conditionals - If statement example
		
		String petName = "Mr. Kitty";
		if (petName == "Mr. Kitty") {
			System.out.println("Mr. Kitty is my pet cat.");
		}
		// Conditionals - If else statement example
		
		double amountInAccount = 28.50;
		if (amountInAccount > 70.00) {
			System.out.println("You can buy the purse.");	
		} else {
			System.out.println("You cannot buy the purse.");
		// Conditionals - Else if statement example
		
		int weatherConditions = 75;
		if (weatherConditions >= 70 && weatherConditions <= 80) {
			System.out.println("I will wear pants.");
		} else if (weatherConditions > 80 && weatherConditions <= 100) {
			System.out.println("I will wear shorts.");
		} else if (weatherConditions > 100) {
			System.out.println("It's too dang hot to go outside.");
		} else if (weatherConditions < 70) {
			System.out.println("I don't want to turn into a popsicle");	
				
		}
		
	}

}
}	