package Chapter5;

import javax.swing.JOptionPane;


public class phoneBillCalculator {
    public static void main(String[]args) {
        //input the plan fee
        String inputPlan = JOptionPane.showInputDialog("Enter your plan");
        Integer.parseInt(inputPlan);

        //input overage minutes
        String inputMinutes = JOptionPane.showInputDialog("Enter you overage minutes");
        Integer.parseInt(inputMinutes);

        //Calculate Total
        double overage;
        overage = (Integer.parseInt(inputMinutes)* 0.25);
        double total = (overage) + (Integer.parseInt(inputPlan));

        //Calculate Total with Tax
        double totalWithTax = total*1.15;
        double tax = totalWithTax - total;
        System.out.println("your plan is: $" + inputPlan + "\n" + "your overage minutes is: " + inputMinutes +"\n"+ "your tax is: $" + tax+ "\n"+ "your total with tax is: $" + totalWithTax  );

        }

    }






