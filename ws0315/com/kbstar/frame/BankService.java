package com.kbstar.frame;

import java.util.List;

/**
 * <V1> UserDTO
 * <V2> AccountDTO
 * <V3> TransactionDTO
 * <K> String id
 * <P> String pwd
 */
public interface BankService<V1, V2, V3, K, P> {
    public void register(V1 v) throws Exception;
    public V1 login(K K, P p) throws Exception;
    public V1 getUserInfo(K k) throws Exception;
    public void makeAccount(K k, double balance) throws Exception;
    public List<V2> getAllAccount(K k) throws Exception; // 내 계좌 조회
    public List<V3> getAllTr(String acc) throws Exception; // 내 거래 내역 조회
    public void transaction(String sendAcc, String receiveAcc, double balance, String desc) throws Exception;
}
