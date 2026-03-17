// Problem 4: Calculate profit and loss percentage
// Cost price of INR 129 and selling price of INR 191
// Profit = selling price - cost price
// Profit Percentage = profit / cost price * 100
// I/P => NONE

class ProfitAndLossCalculator {
    public static void main(String[] args) {
        // Create variable for cost price
        double costPrice = 129.0;
        
        // Create variable for selling price
        double sellingPrice = 191.0;
        
        // Calculate profit
        double profit = sellingPrice - costPrice;
        
        // Calculate profit percentage
        double profitPercentage = (profit / costPrice) * 100;
        
        // Display the result using a single print statement
        System.out.println("Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice);
        System.out.println("The Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage + "%");
    }
}
