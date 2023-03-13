package com.kbstar.service;

import com.kbstar.dao.CustDaoImpl;
import com.kbstar.dto.Cust;
import com.kbstar.frame.DAO;

import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.SQLRecoverableException;
import java.util.List;

public class CustCRUDServiceImpl implements CRUDService<String, Cust>{

    DAO<String, String, Cust> dao;

    public CustCRUDServiceImpl() {
        dao = new CustDaoImpl();
    }

    @Override
    public void register(Cust v) throws Exception {
        // 데이터 검증
        // DB 입력
        try {
            dao.insert(v);
        } catch (Exception e) {
            if (e instanceof SQLIntegrityConstraintViolationException) {
                throw new Exception("ID가 중복되었습니다.");
            } else {
                throw new Exception("서버 에러가 발생했습니다.");
            }

        }
        // Email, SMS 전송

    }

    @Override
    public void modify(Cust v) throws Exception {
        // 데이터 검증
        // DB 입력
        try {
            dao.update(v);
        } catch (Exception e) {
            if (e instanceof SQLRecoverableException) {
                throw new Exception("시스템 장애");
            }
            throw new Exception("요청하신 아이디를 찾을 수 없어요!");
        }
        // Email, SMS 전송
    }

    @Override
    public void remove(String s) throws Exception {
        // 데이터 검증
        // DB 입력
        try {
            dao.delete(s);
        } catch (Exception e) {
            if (e instanceof SQLRecoverableException) {
                new Exception("시스템 장애");
            }
            throw new Exception("해당 ID가 존재하지 않습니다.");
        }
        // Email, SMS 전송
    }

    @Override
    public Cust get(String s) throws Exception {
        Cust cust = null;
        try {
            cust = dao.select(s);

        } catch (Exception e) {
            System.out.println("요청하신 고객을 찾을 수 없어요!");
        }
        return cust;
    }

    @Override
    public List<Cust> get() throws Exception {
        List<Cust> custList;
        try {
            custList = dao.selectAll();
        } catch (Exception e) {
            throw new Exception("전체 리스트를 찾을 수 없어요!");
        }
        return custList;
    }
}
