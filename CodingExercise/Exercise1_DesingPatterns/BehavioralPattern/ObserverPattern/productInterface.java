package ObserverPattern;

public interface productInterface {
    public void subscribe(Customers c);
    public void unsubscribe(Customers c);
    public void notifyCustomer();

}