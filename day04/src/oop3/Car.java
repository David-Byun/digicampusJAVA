package oop3;


public class Car {

    // 속성
    private String name;
    private String color;
    private int size;
    private int fsize; // 기름 통 사이즈
    private int cfsize; // 현재 기름 양

    // 생성자(constructor)
    public Car() {
    }

    public Car(String name, String color, int size, int fsize) {
        this.name = name;
        this.color = color;
        this.size = size;
        this.fsize = fsize;
    }

    public Car(String name, String color, int size, int fsize, int cfsize) {
        this(name, color, size, fsize);
        this.cfsize = cfsize;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", size=" + size +
                ", fsize=" + fsize +
                ", cfsize=" + cfsize +
                '}';
    }

    // 기름을 넣는다.
    // 기름통보다 많은 기름이 들어가면 못들어 간다
    // - 값이 들어가면 다시 넣어주세요
    public void setCfsize(int size) {
        if (size <= 0) {
            System.out.println("0보다 적은 기름은 들어갈 수 없어요!");
            return;
        }
        if (cfsize + size > fsize) {
            System.out.println("기름 통보다 많은 기름은 들어가지 않아요");
        } else {
            cfsize += size;
            System.out.println("현재 기름은 " + cfsize + "L에요");
        }
    }

    // 주행을 한다.
    // 1리터당 10km를 주행할 수 있다.
    public void go(int distance) {
        if (cfsize < 0 || cfsize < (distance/10)) {
            System.out.println("기름이 없어서 출발할 수 없어요");
            return;
        }
        System.out.println("가는데 사용되는 기름의 양은 "+ distance / 10+ "L에요");
        cfsize = cfsize - (distance / 10);
        System.out.println("출발합니다!");
    }

    // 멈춘다.
    public void stop() {
        System.out.printf("%s Stop ...", this.name);
    }
}
