package AdapterPattern;

//  OldCharger compatible with Target
public class Adapter implements Target {
    private OldCharger oldCharger;

    public Adapter(OldCharger oldCharger) {
        this.oldCharger = oldCharger;
    }

    @Override
    public void charge() {
        oldCharger.oldCharge();
    }
}

