package oop;

public class Car {
    // 속성
    private String name;
    private String color;
    private int size;

    // 생성자(constructor)
    public Car() {
        this.name = "k1";
        this.color = "red";
        this.size = 1000;
    }

    public Car(String name, String color, int size) {
        this.name = name;
        this.color = color;
        this.size = size;
    }

    // 오퍼레이션
    public void go() {
        System.out.printf("%s, %s Go Car...", this.name, this.color);
    }

    public void stop() {
        System.out.printf("%s, %s Stopp Car", this.name, this.color);
    }

}
