import java.util.Scanner;

public class WageCalculatorApp
{

   public static void main(String [] args)
   {
      double a=0;
      int b=0;
      double d=0;
      String c;
      
     Scanner input = new Scanner(System.in);
   
     System.out.print("Base Rate: ");
     a = input.nextDouble();
     input.nextLine();
     
     System.out.print("Hours: ");
     b = input.nextInt();
         input.nextLine();    
   
     System.out.print("Would you like to enter an overtime multiplier (yes/no)?");
     c = input.nextLine(); 
      
        if (c.equalsIgnoreCase("Yes"))
            {
                System.out.print("Overtime Multiplier: ");
                d = input.nextDouble();                   
            }
      
              if (c.equalsIgnoreCase("Yes"))
            {
                 WageCalculator myWageCalculator = new WageCalculator(a,d,b);
      
                 System.out.printf("Base Wage: %.2f%n", myWageCalculator.getbaseWage());
                 System.out.printf("Overtime Wage: %.2f%n", myWageCalculator.getovertimeWage());
                 System.out.printf("Total Wage: %.2f", myWageCalculator.gettotalWage());
            }
      
         else if (c.equalsIgnoreCase("No"))
            {
                 WageCalculator myWageCalculator = new WageCalculator(a, 1.5, b);
      
                 System.out.printf("Base Wage: %.2f%n", myWageCalculator.getbaseWage());
                 System.out.printf("Total Wage: %.2f", myWageCalculator.gettotalWage());
            } 
   }

}