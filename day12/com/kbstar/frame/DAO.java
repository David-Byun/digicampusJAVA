package com.kbstar.frame;

import java.util.List;

public interface DAO<K,V> {
    public void insert(V v) throws Exception;
    public void delete(K k) throws Exception;
    public void update(V v) throws Exception;
    public V select(K k) throws Exception;
    public List<V> select()throws Exception;
    public List<V> search(Object obj) throws Exception; // 사용자 정보(ID) 조회시 계좌조회, 계좌 정보 조회시 거래내역 조회

}