package Chapter5;

public class PhoneBill {

    //Attributes
    private double planPhone;
    private int id;
    private double minutesPlan;
    private double minutesUsed;
    private double overageMinutes;
    private double subTotal;
    double totalWithTax;
    private double payment;
    private double debt;

    //PhoneBill default values
    public PhoneBill(){
        planPhone = 1000;
        id = 1;
        minutesPlan = 1;
        minutesUsed = 2;
        overageMinutes = 3;
        payment = 0;
        debt = totalWithTax-payment;

    }

    //Methods for this objet
    public double calculateOverageM(){
        return overageMinutes = minutesUsed-minutesPlan;
    }
    public double subTotalOverageMC(){
        double costOverageM = 1.15;
        return subTotal = planPhone + overageMinutes* costOverageM;
    }
    public double totalWithTax(){
        //Attributes immovable
        double tax = 1.25;
        return totalWithTax = subTotal* tax;
    }

    public double getPlanPhone() {
        return planPhone;
    }
    public void setPlanPhone(double planPhone) {
        this.planPhone = planPhone;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public void setMinutesPlan(double minutesPlan) {
        this.minutesPlan = minutesPlan;
    }

    public void setMinutesUsed(double minutesUsed) {
        this.minutesUsed = minutesUsed;
    }
    public double getPayment() {
        return this.payment;
    }
    public void setPayment(double payment) {
        this.payment = payment;
    }

}
