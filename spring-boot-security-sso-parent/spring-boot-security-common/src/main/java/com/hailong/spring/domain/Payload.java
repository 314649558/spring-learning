package com.hailong.spring.domain;


import java.util.Date;

/**
 * 为了方便后期获取token中的用户信息，将token中载荷部分单独封装成一个对象
 */
public class Payload<T> {
    private String id;
    private T userInfo;
    private Date expiration;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public T getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(T userInfo) {
        this.userInfo = userInfo;
    }

    public Date getExpiration() {
        return expiration;
    }

    public void setExpiration(Date expiration) {
        this.expiration = expiration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Payload<?> payload = (Payload<?>) o;

        if (!id.equals(payload.id)) return false;
        if (!userInfo.equals(payload.userInfo)) return false;
        return expiration.equals(payload.expiration);
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + userInfo.hashCode();
        result = 31 * result + expiration.hashCode();
        return result;
    }
}