package frame;

public interface DAO<K,V> {
    //인터페이스에 변경할 수 없는 변수를 선언할 수 있다.
    String ip = "127.0.0.1";
    public void insert(V v);
    public void update(V v);
    public void delete(K k);

    default void connect() {
        System.out.println(ip + "에 접속하였습니다.");
    }

    default void disconnect() {
        System.out.println(ip + "에서 해제되었습니다.");
    }
}
