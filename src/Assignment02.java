/*
 * Author: Hanna Felix
 * Lab Prof: Shavit Lupo
 * Date: November 25, 2022
 * Description: main method of inputing the value for the program
 */

public class Assignment02 {

	
	public static void main(String[] args) {
		CircularSawBlade blade = new CircularSawBlade();
		String 	confirmation = "yes";
		int numberOfBlades = 0;
		

		// (other variables as needed)
		
		
		while(confirmation.equalsIgnoreCase("yes")){
			blade.setDiameter(User.inputPositiveDouble("Enter measure diameter: "));
			blade.setKerf(User.inputPositiveDouble("Enter measure kerf: "));
			
			System.out.println(blade.toString());
			CircularSawBladeVerifier.isDiameterInTolerance(blade);
			CircularSawBladeVerifier.isKerfInTolerance(blade);
			
			
			System.out.println("Blades entered " + ++numberOfBlades);
			System.out.println("Diameter(s) out of tolerance:" + CircularSawBladeVerifier.notDi);
			System.out.println("Kerf(s) out of tolerance:"+ CircularSawBladeVerifier.notKerf);
			confirmation = User.inputString("Would you like to continue? (yes/no)");

			System.out.println("Program by Hanna Felix");
			
		}
		
		System.out.println("Program shut down");

	}
}

/*
 * References:
 * [1] C. Baylor. What Does the Term "Kerf" Mean in Woodworking?. thesprucecrafts.com.
 * https://www.thesprucecrafts.com/definition-of-kerf-3536563 (Accessed Oct 28, 2022).
 */