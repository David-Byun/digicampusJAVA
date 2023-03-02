package aggregation;

public class Car {
    private String name;
    private String color;
    private int size;

    public Car(String name, String color, int size) {
        this.name = name;
        this.color = color;
        this.size = size;
    }

    void go() {
        System.out.println("갑니다");
    }

    void stop() {
        System.out.println("멈춥니다.");
    }

    public Car() {
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", size=" + size +
                '}';
    }
}
