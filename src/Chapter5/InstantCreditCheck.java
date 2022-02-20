package Chapter5;

import java.util.Scanner;

public class InstantCreditCheck {

    static int requiredSalary = 25000;
    static int requiredCreditScore = 700;
    static Scanner scanner = new Scanner(System.in);
    public static void main(String [] args){

        //Get what we dont know
        double s = getSalary();
        int c = getCreditScore();
        scanner.close();

        //Check if the user is qualified
        boolean qualified = isUserQualified(c, s);

        //Notify the user
        notifyUser(qualified);
    }
        public static double getSalary(){
            System.out.println("Enter your salary");
            Scanner scanner = new Scanner(System.in);
            double salary = scanner.nextDouble();
            return salary;
        }

        public static int getCreditScore (){
            System.out.println("Enter your credit score: ");
            int creditScore = scanner.nextInt();

            scanner.close();
            return creditScore;
        }

        public static boolean isUserQualified(int creditScore, double salary){
            return creditScore >= requiredCreditScore && salary >= requiredSalary;


        }

        public static void notifyUser(boolean isQualified){
        if (isQualified){
            System.out.println("Congrats ! you´ve been approved.");
        }
        else{
            System.out.println("Sorry. you´ve been declined.");
        }


        }

}


