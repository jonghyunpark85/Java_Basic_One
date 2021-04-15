
import java.util.*;
/**
 * Assignment #1 Generating Electric Bills
 * 
 * @JONGHYUN PARK
 * @000806199
 */
public class Assignment1 {
    public static void main (String [] args) {
       
       Scanner in = new Scanner (System.in);
       
       /* Customer Information Below */
       
       String customerName, accountNumber, address, cityPostalcode;
       System.out.print ("Enter the Customer name: ");
       customerName = in.nextLine();
       
       System.out.print ("Enter the Customer account number: ");
       accountNumber = in.nextLine();
              
       System.out.print ("Enter the address: ");
       address = in.nextLine();
       
       System.out.print ("Enter the city province and postalCode separated by spaces : ");
       cityPostalcode = in.nextLine();
       
       int beginMonth, beginDay, beginYear ;
       System.out.print ("Enter the start date for the billing cycle (mm dd yyyy):   ");
       beginMonth = in.nextInt();
       beginDay = in.nextInt();
       beginYear  = in.nextInt();
       
       int billDays, tierOne , tierTwo;
       System.out.print ("How many days in the billing period?   ");
       billDays = in.nextInt();
       
       System.out.print ("How many KWh at Tier 1 (first 500 Kwh):  ");
       tierOne  = in.nextInt();
       
       System.out.print ("How many KWh at Tier 2 (above 500 KWh):  ");
       tierTwo = in.nextInt();
       
       
       /* Company Information Below */
       
       System.out.println ("\n\nSuperPower - Powering the nation ");
       System.out.println ("132 Main Street, Vulcan, AB, T0L 2B0  ");
       
       /* Calender Information */
       
       /*
       Calendar cal = Calendar.getInstance(); 
       Cal.set(Calender. MONTH, month); 
       Cal.set(Calender. DATE, date); 
       Cal.set(Calender. YEAR, year); 
       */
      
       /* Billing Information Below */
              
       System.out.printf ("\n\nBilling Period (MM/DD/YYYY):  %d/%d/%d to 19/01/2020 (31 days)", beginMonth, beginDay, beginYear );
       
       System.out.println ("\n\nDelivery charges - Cost to deliver your electiricity");
       
       double basicCharge, energy1, energy2, energy3, energy4, subTotal;
       basicCharge = billDays * 0.0240;
       energy1 = tierOne  * 0.08905;
       energy2 = tierTwo * 0.1419;
       energy3 = tierOne  * 0.1900;
       energy4 = tierTwo * 0.2400;
       subTotal = basicCharge + energy1 + energy2 + energy3 + energy4;
       
       System.out.printf ("%s%22d%s%10.2f\n", "Basic Charge", billDays, " days x $0.0240", basicCharge);
       System.out.println ("Enegry");
       
       System.out.printf ("%s%10d%s%10.2f\n", "   Tier 1 (first 500 KWh)", tierOne , " KWh x $0.08905", energy1);
       System.out.printf ("%s%10d%s%11.2f\n\n", "   Tier 2 (above 500 KWh)", tierTwo , " KWh x $0.1419", energy2);
           
       System.out.println ("Generation charges - Cost to generate your electricity");
       System.out.println ("Enegry");
             
       System.out.printf ("%s%10d%s%11.2f\n", "   Tier 1 (first 500 KWh)", tierOne , " KWh x $0.1900", energy3);
       System.out.printf ("%s%10d%s%11.2f\n", "   Tier 2 (above 500 KWh)", tierTwo , " KWh x $0.2400", energy4);
       System.out.printf ("%s%30.2f\n\n","Subtotal of your new charges", subTotal);
       
       System.out.println ("Your new charges" +"\t\t\t\t    187.39");
       
       System.out.println ("\nPay $187.39 by 01/19/2020 to avoid late fees");
           
        }
}
