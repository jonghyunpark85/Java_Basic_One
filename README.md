# Java_Basic_One

##Generating Electric Bills

A local energy provider SuperPower is looking for a simple program to produce energy bills for customers. 

The following is a sample output. (Input is shown in bold underline):

Enter the Customer name: Harvey Wallbanger
Enter the Customer account number: 5764-3948-3049-001
Enter the address: 123 Main St
Enter the city province and postalCode separated by spaces: Vulcan AB T0L-2B7
Enter the start date for the billing cycle (mm dd yyyy): 12 19 2019
How many days in the billing period? 31
How many KWh at Tier 1 (first 500 Kwh): 500
How many KWh at Tier 2 (above 500 KWh): 100


SuperPower - Powering the nation
132 Main Street, Vulcan, AB, T0L 2B0 


Billing Period (MM/DD/YYYY): 19/12/2019 to 19/01/2020 (31 days)

Delivery charges - Cost to deliver your electrictiy
Basic Charge                                 31 days x $0.0240            0.74
Energy                        
     Tier 1 (first 500 KWh)                  500 KWh x $0.08905           44.53
     Tier 2 (above 500 KWh)                  100 KWh x $0.1419           14.19

Generation charges - Cost to generate your electrictiy
Energy                        
     Tier 1 (first 500 KWh)                  500 KWh x $0.1900           95.00
     Tier 2 (above 500 KWh)                  100 KWh x $0.2400           24.00
Subtotal of your new charges                                            178.46

Your new charges                                                        187.39

Pay $187.39 by 01/19/2020 to avoid late fees
Google how to set the current date and how to add a fixed number of days to a date. Your program should calculate and print the end date based on a current date and the number of days in the billing period. The numbers shown in bold italic are constants are should be stored a final double in your program.

You are NOT expected to error check your inputs for this assignment.  Use System.out.printf() to output and String.format() to generate the report within Java.
