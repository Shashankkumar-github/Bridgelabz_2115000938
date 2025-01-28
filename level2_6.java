public class level2_6 {

    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }

    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }

    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }

    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }

    public static void main(String[] args) {
        double fahrenheit = 98.6;
        double celsius = 37.0;
        double pounds = 150.0;
        double kilograms = 68.0;
        double gallons = 10.0;
        double liters = 20.0;

        double fahrenheitToCelsius = convertFahrenheitToCelsius(fahrenheit);
        System.out.println(fahrenheit + " Fahrenheit is " + fahrenheitToCelsius + " Celsius.");

        double celsiusToFahrenheit = convertCelsiusToFahrenheit(celsius);
        System.out.println(celsius + " Celsius is " + celsiusToFahrenheit + " Fahrenheit.");

        double poundsToKilograms = convertPoundsToKilograms(pounds);
        System.out.println(pounds + " pounds is " + poundsToKilograms + " kilograms.");

        double kilogramsToPounds = convertKilogramsToPounds(kilograms);
        System.out.println(kilograms + " kilograms is " + kilogramsToPounds + " pounds.");

        double gallonsToLiters = convertGallonsToLiters(gallons);
        System.out.println(gallons + " gallons is " + gallonsToLiters + " liters.");

        double litersToGallons = convertLitersToGallons(liters);
        System.out.println(liters + " liters is " + litersToGallons + " gallons.");
    }
}
