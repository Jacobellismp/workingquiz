import java.util.Scanner;

public class quiz
{
  public static void main (String[] args) 
  {
    Scanner scan = new Scanner( System.in );
    double salary;
    double wagegap;
    double age;
    double children;
    float taxrate;
    float discount;
    double moneyoff;
    double amount;

    System.out.print("How much do you make? ");
    salary =  scan.nextDouble();

    System.out.print("How many kids do you have? ");
    age =  scan.nextDouble();

    System.out.print("How many children do you have? ");
    children =  scan.nextDouble();

    if (salary < 10000 && salary >= 0) 
      taxrate = 0;
    if (salary < 25000 && salary >= 10000) 
      taxrate = .1;
      wagegap = (salary - 10000);
    if (salary < 75000 && salary >= 25000) 
      taxrate = .2;
      wagegap = ((salary - 25000) * .1);
    if (salary < 250000 && salary >= 75000) 
      taxrate = .3;
      wagegap = ((salary - 75000) * .2);
    if (salary >= 250000) 
      taxrate = .5;
      wagegap = ((salary - 250000) * .3);
    if (age <= 15 && age >= 0) 
      discount = .5;
    if (age <= 21 && age >= 16) 
      discount = .25;
    if (age <= 63 && age >= 22) 
      discount = 0;
    if (age <= 72 && age >= 64) 
      discount = .33;
    if (age <= 80 && age >= 73) 
      discount = .66;
    if (age >= 81) 
      discount = 1;
    if (children < 1  && children >= 0) 
      moneyoff = 0;
    if (children >= 1 && children <= 2.5) 
      moneyoff = 1000;
    if (children > 2.5) 
      moneyoff = 2000;
    amount = (salary - (salary * taxrate));
    
    System.out.println(amount);
  }
}