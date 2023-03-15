package com.kbstar.dto;

import com.kbstar.frame.MakeItemNumber;

import java.util.Date;

public class Cart {
    private String id;
    private String userId;
    private String itemId;
    private int cnt;
    private Date regdate;


    public Cart(String userId, String itemId, int cnt) {
        this.userId = userId;
        this.itemId = itemId;
        this.cnt = cnt;
    }


    public Cart(String id, String userId, String itemId, int cnt, Date regdate) {
        this.id = id;
        this.userId = userId;
        this.itemId = itemId;
        this.cnt = cnt;
        this.regdate = regdate;
    }

    public Cart(String id, String userId, String itemId, int cnt) {
        this.id = id;
        this.userId = userId;
        this.itemId = itemId;
        this.cnt = cnt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public int getCnt() {
        return cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }

    public Date getRegdate() {
        return regdate;
    }

    public void setRegdate(Date regdate) {
        this.regdate = regdate;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "id='" + id + '\'' +
                ", userId='" + userId + '\'' +
                ", itemId='" + itemId + '\'' +
                ", cnt=" + cnt +
                ", regdate=" + regdate +
                '}';
    }
}
