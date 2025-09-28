package StrategyPattern;

public class payPal implements paymentStrategy {
    public void pay(int Amount)
    {
        System.out.println("Amount: "+Amount+" You paid in paypal");
    }
}
