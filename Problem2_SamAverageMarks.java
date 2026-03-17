// Problem 2: Sam's average mark in PCM
// Sam's mark in Maths is 94, Physics is 95 and Chemistry is 96 out of 100
// I/P => NONE
// O/P => Sam's average mark in PCM is __

class SamAverageMarkCalculator {
    public static void main(String[] args) {
        // Create variable for Sam's name
        String name = "Sam";
        
        // Create variables for marks in each subject
        int mathsMarks = 94;
        int physicsMarks = 95;
        int chemistryMarks = 96;
        
        // Define maximum marks per subject
        int maxMarksPerSubject = 100;
        
        // Calculate total marks obtained
        int totalMarksObtained = mathsMarks + physicsMarks + chemistryMarks;
        
        // Calculate total maximum marks
        int totalMaxMarks = maxMarksPerSubject * 3;
        
        // Calculate average percent
        double averagePercent = (double) totalMarksObtained / totalMaxMarks * 100;
        
        // Display the result
        System.out.println(name + "'s average mark in PCM is " + averagePercent + "%");
    }
}
