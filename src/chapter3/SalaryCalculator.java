package chapter3;

import java.util.Scanner;

/*
if Statemant.
All salespeople get a payment of $1000 a week.
Salespeople who exceded 10 sales get an additiaonal bonus of $250
 */
public class SalaryCalculator {

    public static void main(String args[]){

        //Initialize know values
        int salary = 1000;
        int bonus = 250;

        //Get values for the unknown
        System.out.println("How many sales did the employee make this week? ");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //Quick detour for the bonus earners
        if(sales > 10){
            salary = salary + bonus;
        }

        //Display output
        System.out.println ("The employee´s pay is $" + salary);

    }
}
