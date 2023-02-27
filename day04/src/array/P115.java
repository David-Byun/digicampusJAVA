package array;


import java.util.HashMap;

class A {
    String name;

    A(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof A) {
            if (this.name == ((A) obj).name) {
                return true;
            }
        }
        return false;
    }


    @Override
    public String toString() {
        return name;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
class C {
    int a;
    final int b;

    C() {
        a= 3;
        b =5;
    }
}

public class P115 {
    public static void main(String[] args) {

        String strs[] = new String[3];
        strs[0] = "abc";
        strs[1] = "def";
        strs[2] = "ghi";

        HashMap<Integer, String> hm1 = new HashMap<>();
        hm1.put(1, "haha");
        hm1.put(2, "hoho");
        System.out.println("hm1 = " + hm1);

        HashMap<A, String> hm2 = new HashMap<>();
        hm2.put(new A("haha"), "haha1");
        hm2.put(new A("hoho"), "hoho2");
        System.out.println("hm2 = " + hm2);
        

    }
}
