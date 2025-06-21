

import java.util.Scanner;

public class FinancialForecast {

   
    public static double calculateFutureValue(double presentValue, double growthRate, int years) {
       
        if (years == 0) {
            return presentValue;
        }
     
        return calculateFutureValue(presentValue * (1 + growthRate), growthRate, years - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the initial investment amount: ");
        double initialValue = scanner.nextDouble();

        System.out.print("Enter the annual growth rate (in %): ");
        double annualGrowthPercent = scanner.nextDouble();
        double annualGrowthRate = annualGrowthPercent / 100.0;  

        System.out.print("Enter the number of years: ");
        int numberOfYears = scanner.nextInt();

        
        double futureValue = calculateFutureValue(initialValue, annualGrowthRate, numberOfYears);

        System.out.printf("Future Value after %d years: %.2f\n", numberOfYears, futureValue);
        
        scanner.close();
    }
}
