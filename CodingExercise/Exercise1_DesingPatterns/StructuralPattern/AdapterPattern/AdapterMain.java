package AdapterPattern;

public class AdapterMain {
    public static void main(String[] args) {
        OldCharger oldCharger = new OldCharger();
        Target target = new Adapter(oldCharger);
        target.charge();
    }
}

