package com.example.sample.proxy_pattern.dynamic_proxy;

/**
 * author: sundong
 * created at 2017/4/26 11:02
 */

public interface IGamePlayer {
    public void login(String userName, String userPwd);
    public void killBoss();
    public void upgrade();
}
