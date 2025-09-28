package ObserverPattern;

public class ObserverPatternMain {

    public static void main(String[] args) {
        iphone product1=new iphone("iphone 17");
        Customers c1= new Users("Dinesh");
        Customers c2= new Users("Deeraj");
        Customers c3= new Users("Aravind");
        Customers c4=new Users("Divahar");
        product1.subscribe(c1);
        product1.subscribe(c2);
        product1.subscribe(c3);
        product1.subscribe(c4);
        product1.unsubscribe(c3);
        product1.notifyCustomer();



    }

}