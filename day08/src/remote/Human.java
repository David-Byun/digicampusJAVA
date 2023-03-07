package remote;

public class Human {
    public static void main(String[] args) {
        //Remote remote = new TV();
        Remote remote = new Audio();
        remote.turnOFF();
        remote.turnOn();
    }
}
