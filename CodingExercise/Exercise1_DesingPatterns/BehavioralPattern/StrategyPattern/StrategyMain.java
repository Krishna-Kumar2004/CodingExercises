package StrategyPattern;


public class StrategyMain {

    public static void main(String[] args) {
        paymentService serv=new paymentService(new Gpay());
        serv.payAmount(-500);
        serv.ChangePaymentmethod(new phonePay());
        serv.payAmount(1000);
        serv.ChangePaymentmethod(new payPal());
        serv.payAmount(2000);

    }

}