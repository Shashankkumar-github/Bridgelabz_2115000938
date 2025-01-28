public class level2_5{

    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3.0;
        return yards * yards2feet;
    }
	
    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }
	
    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }
	
    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }
	
    public static double convertInchesToCentimeters(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }

    public static void main(String[] args) {
        double yards = 5.0;
        double feet = 15.0;
        double meters = 2.0;
        double inches = 12.0;
		
        double yardsToFeet = convertYardsToFeet(yards);
        System.out.println(yards + " yards is " + yardsToFeet + " feet.");
		
        double feetToYards = convertFeetToYards(feet);
        System.out.println(feet + " feet is " + feetToYards + " yards.");

        
        double metersToInches = convertMetersToInches(meters);
        System.out.println(meters + " meters is " + metersToInches + " inches.");

       
        double inchesToMeters = convertInchesToMeters(inches);
        System.out.println(inches + " inches is " + inchesToMeters + " meters.");
		
        double inchesToCentimeters = convertInchesToCentimeters(inches);
        System.out.println(inches + " inches is " + inchesToCentimeters + " centimeters.");
    }
}
