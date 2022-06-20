
public class WageCalculator
{
 
 
 //Fields
 
   private double baseRate;
   private double overtimeMultiplier;
   private int hours;
   private double overtimeWage;
   private double baseWage;
   private double totalWage;
   
   //Constructors
             
   public WageCalculator(double baseRate, double overtimeMultiplier, int hours)
     {
       if(baseRate >= 7.25)
               {
                  this.baseRate = baseRate;
               }
            else{throw new IllegalArgumentException("You Must Enter a base rate equal to or greater than 7.25");}
         
         
          if(overtimeMultiplier >= 1.5)
               {this.overtimeMultiplier = overtimeMultiplier;}
          else{throw new IllegalArgumentException("You must Enter a overtime multiplier less than 1.5");}
        
         
          if(hours > 0)
            {
               this.hours = hours;
            }
          else{throw new IllegalArgumentException();} 
     }
     
     public WageCalculator(double baseRate, int hours)
      {
        new WageCalculator(baseRate, 1.5, hours);
      }
   
   //Methods
   
    public double getbaseWage()
       {
           baseWage = (baseRate*hours);
           return baseWage;       
       } 
       
    public double getovertimeWage()
       {
       if(hours > 40)
            {
               overtimeWage = ((baseRate)*(hours-40)*(overtimeMultiplier));
            }
            
            else 
               {
                  overtimeWage = 0;
               }
            return overtimeWage;
       }
       
    public double gettotalWage()
       {
           totalWage = (overtimeWage + baseWage);   
           return totalWage;  
       }   
    
    @Override
    public String toString()
      {
            return String.format ("baseRate: %d Hour: %d OverTime Multiplier: %d" + baseRate, hours, overtimeMultiplier);
      }
}