// Problem 3: Convert 10.8 kilometers to miles
// Hint: 1 km = 1.6 miles (Note: 1 mile = 1.6 km means 1 km = 1/1.6 miles)
// I/P => NONE
// O/P => The distance ___ km in miles is __

class KilometersToMilesConverter {
    public static void main(String[] args) {
        // Create variable for distance in kilometers
        double distanceInKm = 10.8;
        
        // Conversion factor: 1 mile = 1.6 km, so 1 km = 1/1.6 miles
        double milesPerKm = 1.0 / 1.6;
        
        // Calculate distance in miles
        double distanceInMiles = distanceInKm * milesPerKm;
        
        // Display the result
        System.out.println("The distance " + distanceInKm + " km in miles is " + distanceInMiles);
    }
}
