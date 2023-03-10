package com.kbstar.frame;

import java.util.List;
import java.util.Objects;

public interface DAO<K,V> {
    public void insert(V v) throws Exception;
    public void delete(K k) throws Exception;
    public void update(V v) throws Exception;
    public V select(K k) throws Exception;
    public List<V> select() throws Exception;

    public void clear() throws Exception;
    public List<V> search(Objects obj) throws Exception;
}
