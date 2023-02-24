package subject;

import java.util.*;

class A {
    int data;

    public A(int data) {
        this.data = data;
    }
}
public class P55 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하시오(10~100)");
        String cmd = sc.next();
        int anInt = Integer.parseInt(cmd);
        Random rand = new Random();

        // 10~100 사이의 정수를 입력받는다.
        // 1부터 입력 받은 숫자까지의 범위에서 랜덤한 숫자를 발생하시오

        System.out.println("랜덤한 난수 : " + rand.nextInt(anInt)+1);
        sc.close();

        List<Integer> aList1 = new ArrayList<Integer>();
        aList1.add(3);
        aList1.add(4);

        List<Integer> vector1 = new Vector<Integer>();

        Set<String> hSet1 = new HashSet<String>();
        hSet1.add("가");
        hSet1.add("나");

        Object[] objArray = hSet1.toArray();

        Set<String> treeSet = new TreeSet<String>();
        TreeSet<String> treeSe = new TreeSet<String>();
        //git 수정 추가

        //List<E> : ArrayList<E>, Vector<E>, LinkedList<E>
        //Queue<E>
        //Set<E> : HashSet<E>, LinkedHashSet<E>, TreeSet<E>
        //Map<K, V> : HashMap<K, V>, LinkedHashMap<K, V>, TreeMap<K, V>
        //put(key, value)
        //replace(key, value)
        //get(key)
        //containsKey(key)
        //containsValue(value)
        //remove(key)
        //remove(Object key, Object value)
    }
}
