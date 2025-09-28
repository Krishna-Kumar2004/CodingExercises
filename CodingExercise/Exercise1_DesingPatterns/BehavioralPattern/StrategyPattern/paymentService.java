package StrategyPattern;

public class paymentService {
    private paymentStrategy paymentMethod;
    public paymentService(paymentStrategy paymentMethod)
    {
        this.paymentMethod=paymentMethod;
    }
    public void ChangePaymentmethod(paymentStrategy paymentMethod)
    {
        this.paymentMethod=paymentMethod;
    }
    public void payAmount(int amount)
    {
        paymentMethod.pay(amount);
    }
}