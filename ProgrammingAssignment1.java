
/*
 * Jessica Craw
 Using the formula to determine future investments this program will display the
investment after getting input for the initial investment amount, the annual
interest rate, and the number of years it will accumulate.
The formaula is (as taken from assignment):
futureInvestmentValue = investmentAmount * (1 + (monthlyInterestRate/100))^numberOfYears
I've adjusted the formula so it's now:
futureInvestmentValue = initialInvestment * (1 + (interestRate/100))^ numberOfYears
I also have added the variable decimalInterestRate to calculate the percentage into the decimal form.
Also did decimal formatting so it'll appear as a monetary amount.
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class ProgrammingAssignment1 {
    public static void main(String[] args){
        
        //declare variables
        double initialInvestment;
        double interestRate;
        double numberOfYears;
        double futureInvestmentValue;
        double decimalInterestRate;
        
        //Create a scanner object to accept input
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat(".00");
        
        //request initial investment amount, interest rate, and the number of years from user
        System.out.println("Enter an initial investment amount: ");
        initialInvestment = input.nextDouble();
        System.out.println("Enter the interest rate without the percent sign: ");
        interestRate = input.nextDouble();
        System.out.println("Enter the number of years your investment will accumulate: ");
        numberOfYears = input.nextDouble();
        
        //declare the Math.pow(a,b) method
        //double interestRateToThePowerOfYears = Math.pow((1 + interestRate), (numberOfYears * 12));
        //have program calculate the formula
        decimalInterestRate = interestRate / 100;
        futureInvestmentValue = (initialInvestment * Math.pow((1 + decimalInterestRate), (numberOfYears)));
        String format = df.format(futureInvestmentValue);
        
        //Display the results
        System.out.println("Your future investment will be $" + format);
    }
}
