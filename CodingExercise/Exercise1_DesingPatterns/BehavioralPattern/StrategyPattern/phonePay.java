package StrategyPattern;

public class phonePay implements paymentStrategy {
    public void pay(int Amount)
    {
        System.out.println("Amount: "+Amount+" You paid in phone pay");
    }
}