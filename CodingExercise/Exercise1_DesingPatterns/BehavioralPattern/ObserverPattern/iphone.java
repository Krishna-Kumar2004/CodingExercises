package ObserverPattern;
import java.util.*;
public class iphone implements productInterface {
    private String productname;
    public iphone(String productname)
    {
        this.productname=productname;
    }
    List <Customers> customer= new ArrayList<>();
    public void subscribe(Customers c)
    {
        customer.add(c);
    }
    public void unsubscribe(Customers c)
    {
        customer.remove(c);

    }
    public void notifyCustomer()
    {
        for(Customers i: customer)
        {
            new Thread(() -> i.Notify(productname)).start();
        }
    }
}