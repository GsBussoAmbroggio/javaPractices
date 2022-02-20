package Chapter5;

import javax.swing.*;

public class TestPhoneBill extends PhoneBill {
    public static void main(String[] args){
        PhoneBill bill1 = new PhoneBill();

        //All Sets (Inputs)
        bill1.setId (Integer.parseInt(JOptionPane.showInputDialog("Enter Your id here")));
        bill1.setPlanPhone(Integer.parseInt(JOptionPane.showInputDialog("Enter Your Phone plan")));
        bill1.setMinutesPlan (Integer.parseInt(JOptionPane.showInputDialog("Enter the minutes of your plan")));
        bill1.setMinutesUsed (Integer.parseInt(JOptionPane.showInputDialog("Enter the minutes that you used")));
        
        //All Gets
        int id;
        id = bill1.getId();
        int phonePlan;
        phonePlan = (int) bill1.getPlanPhone();
        int debt;
        debt = (int) bill1.getPayment();



        //PhoneBill Method´s
        int overageM;
        overageM = (int) bill1.calculateOverageM();
        int subTotal;
        subTotal = (int) bill1.subTotalOverageMC();
        int totalWithTax;
        totalWithTax = (int) bill1.totalWithTax();


        /*Display Construction:
          1. First step The Bill
          2. Second step paid Bill
          3. Third step if the user not payment the total bill the program show that.
         */
        
        //1. First step The Bill (Display)
        JOptionPane.showMessageDialog(null,"PHONE BILL"+"\n"+"ID: N°"+ id +"\n"+ "Your Plan: $" + phonePlan + "\n" + "your overage minutes are: "+ overageM + "\n" +  "subtotal: $" + subTotal + "\n" + "total with tax: $" + totalWithTax );
        
        //2. Second step paid Bill (Display)
        bill1.setPayment (Integer.parseInt(JOptionPane.showInputDialog("Enter how much do you want to pay:")));
                if (debt>=0){
                    JOptionPane.showMessageDialog(null,"your payment was successful");
                }

        //3. Third step if the user not payment the total bill the program show that. (Display)
                else{
                    JOptionPane.showMessageDialog(null,"\n" +
                            "your payment was not successful"+"\n"+ "your debt is: $"+ debt);
                }



}
}
