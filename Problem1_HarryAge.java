// Problem 1: Find Harry's age given birth year 2000 and current year 2024
// I/P => NONE
// O/P => Harry's age in 2024 is __

class HarryAgeCalculator {
    public static void main(String[] args) {
        // Create variable for Harry's birth year
        int birthYear = 2000;
        
        // Create variable for current year
        int currentYear = 2024;
        
        // Calculate Harry's age
        int harrysAge = currentYear - birthYear;
        
        // Display the result
        System.out.println("Harry's age in " + currentYear + " is " + harrysAge);
    }
}
