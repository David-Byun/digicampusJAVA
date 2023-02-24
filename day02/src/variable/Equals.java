package variable;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Equals {
    public static void main(String[] args) {
        Map<Integer, String> hMap = new HashMap<Integer, String>();
        hMap.put(1, "가나다");
        hMap.put(2, "나다라");
        hMap.put(3, "마바사");
        System.out.println(hMap.toString());
        Map<Integer, String> hMap2 = new HashMap<Integer, String>();
        hMap2.putAll(hMap);
        System.out.println(hMap2.toString());

        // 이거는 Test 용 적요 입니다
        // 내용 수정했습니다.
   
        hMap.replace(2, "다다다", "라라라");
        hMap.replace(1, "나다다", "나라라");

        System.out.println(hMap.get(1));
        System.out.println(hMap.containsKey(1));
        System.out.println(hMap.containsValue("나나나"));

        Set<Map.Entry<Integer, String>> entrySet = hMap.entrySet();
    }
}
