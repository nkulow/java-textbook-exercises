public class Loan {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private java.util.Date loanDate;

    // default constructor //
    public Loan(){
        this(2.5,1,1000);

    // constructor for loan with specified annual interest rate, number of years, and loan amount //
    }
    public Loan (double annualInterestRate, int numberOfYears, double loanAmount){
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        loanDate = new java.util.Date();

    // return annual interest rate //
    }
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }

    // return number of years //
    public int getNumberOfYears(){
        return numberOfYears;
    }

    // return loan amount //
    public double getLoanAmount(){
        return loanAmount;
    }

    // return loan date //
    public java.util.Date getLoanDate(){
        return loanDate;
    }

    // set a new annaual interest rate //
    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }

    // set a new number of years //
    public void setNumberOfYears(int numberOfYears){
        this.numberOfYears = numberOfYears;
    }

    // set a new loan amount //
    public void setLoanAmount(double loanAmount){
        this.loanAmount = loanAmount;
    }

    // get monthly payment //
    public double getMonthlyPayment(){
        double monthlyInterestRate = annualInterestRate / 1200;
        double monthlyPayment = loanAmount * monthlyInterestRate / (1 - (1 / Math.pow(1 + monthlyInterestRate,
                numberOfYears * 12)));
        return monthlyPayment;
    }

    // get total payment //
    public double getTotalPayment(){
        double totalPayment = getMonthlyPayment() * 12 * numberOfYears;
        return totalPayment;
    }

}
