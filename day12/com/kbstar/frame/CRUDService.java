package com.kbstar.frame;

import java.util.List;

public interface CRUDService<K,V> {
    //서비스 레이어 : 업무에 대한 기능 추가(필요하면 DB, sms/email part 별로 나눠짐)
    //보다 서비스 관련 함수명으로 변경 필요
    public void register(V v) throws Exception;
    public void remove(K k) throws Exception;
    public void update(V v) throws Exception;
    public V get(K k) throws Exception;
    public List<V> getAll() throws Exception;

    public void clear() throws Exception;
}
