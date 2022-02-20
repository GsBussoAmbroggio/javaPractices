package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String arg[]){

        //1. Get the number of hours worked
        //System.out.println("Enter the number of hours the employee worked");
        //Scanner scanner = new Scanner(System.in);
        //int hours = scanner.nextInt();

        //2. Get the hourly pay rate
        //System.out.println("Enter the employee´s pay rate");
        //double rate = scanner.nextDouble();
        //scanner.close();

        //3. Multiply hours and pay rate
        //double grossPay = hours * rate;

        //4. Display result
        //System.out.println("The employee´s gross pay is $" + grossPay);

        //SECOND PROGRAM IN JAVA

        //1. Get the season of the year

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the season of the year");
        String season = scanner.next();

        //2. Get the number of coffe cups
        System.out.println("Enter the number of coffe cups that you will consume");
        int coffeCups = scanner.nextInt();

        //3. Get the Adjetive
        System.out.println("Enter the adjetive");
        String adjetive = scanner.next();

        scanner.close();

        //4. Display result
        System.out.println("On a " + adjetive + " " + season + " day, I drink a minimum of " + coffeCups + " cups of coffee");


    }
}
