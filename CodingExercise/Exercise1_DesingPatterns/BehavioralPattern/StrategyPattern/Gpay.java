package StrategyPattern;


public class Gpay implements paymentStrategy {
    public void pay(int Amount)
    {
        System.out.println("Amount: "+Amount+" You paid in Gpay");
    }
}
