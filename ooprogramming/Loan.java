package examples.ooprogramming;
public class Loan {
    String name;
    double amount, rate;
    int years;

    public void setName(String n) {
        name = n;
    }
    public void setAmount(double a) {
        amount = a;
    }
    public void setRate(double r) {
        rate = r;
    }
    public void setYears(int y) {
        years = y;
    }
    public String getName() {
        return name;
    }
    public double getAmount() {
        return amount;
    }
    public double getRate() {
        return rate;
    }
    public int getYears() {
        return years;
    }
}