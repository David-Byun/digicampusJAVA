package remote;

public class TV implements Remote {
    @Override
    public void turnOn() {
        System.out.println("Turn On TV");
    }

    @Override
    public void turnOFF() {
        System.out.println("Turn Off TV");
    }
}
