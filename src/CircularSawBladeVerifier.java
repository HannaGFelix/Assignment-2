/*
 * Author: Hanna Felix
 * Lab Prof: Shavit Lupo
 * Date: November 25, 2022
 * Description: This class is the verifier for the blades.
 */
public class CircularSawBladeVerifier {
	
	//       i.e. one-64th of an inch 1/64
	
	public static final double EPSILON = 0.015625;
	public static int notDi = 0;
	public static int notKerf = 0;
	/*
	 * This is a utility class with only static members, prevent
	 * Instantiation.
	 */
	private CircularSawBladeVerifier() {
	}
	
	//ToDo: Supervisor wants programmer comments (use /* */ comment)
	public static boolean isDiameterInTolerance(CircularSawBlade blade) {
		// check that the diameter does not differ more than EPSILON and expected diameter
		boolean inTolerent = true;
		double differMeasureDiameter = blade.getDiameter() - CircularSawBlade.EXPECTED_DIAMETER;
	
			while (inTolerent) {
				inTolerent = Math.abs(differMeasureDiameter) <= EPSILON;
				// expDiameter;
					if(inTolerent) {
							System.out.println("Diameter in tolerance");
							inTolerent = false;
						}
							else {
								System.out.println("Diameter not within tolerance");
								notDi++;
							}
			}	
		return inTolerent; //placeholder so the code will compile, update with the actual true or false
	}
	
	public static boolean isKerfInTolerance(CircularSawBlade blade) {
		// check that the kerf does not differ more than EPSILON and expected kerf
		
		boolean inTolerent = true;
		double kDifferMeasure = blade.getKerf() - CircularSawBlade.EXPECTED_KERF;
		
		
		while (inTolerent) {
			inTolerent = Math.abs(kDifferMeasure) <= EPSILON;
		
			if(inTolerent) {
				System.out.println("Kerf in tolerance");
				inTolerent = false;
			}
				else {
					System.out.println("Kerf not within tolerance");
					notKerf++;
				}
			}
		return inTolerent; //placeholder so the code will compile, update with the actual true or false
	}
}

/*
 * References:
 * [1] C. Baylor. What Does the Term "Kerf" Mean in Woodworking?. thesprucecrafts.com.
 * https://www.thesprucecrafts.com/definition-of-kerf-3536563 (Accessed Oct 28, 2022).
 */
