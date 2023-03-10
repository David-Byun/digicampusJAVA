package statics;

public class Car {
    private String name;
    private String maker;

    //클래스 변수지 객체 영역 영향 없는 변수(객체 생성할때 관여하지 않는다)
    //여러 클래스들이 필요에 따라 static 함수를 사용하겠다.
    //static 함수 내에서 사용하는 변수는 static 붙여서 사용
    //static은 객체 생성될 때 관여 X
    public static String makerName = "HD";

    public Car() {
    }

    public Car(String name, String maker) {
        this.name = name;
        this.maker = maker;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", maker='" + maker + '\'' +
                '}';
    }
}
