package com.example.sample.proxy_pattern.static_proxy.force;

/**
 * author: sundong
 * created at 2017/4/26 11:03
 */
public interface IGamePlayer {
    public void login(String userName, String userPwd);
    public void killBoss();
    public void upgrade();
    public IGamePlayer getProxy();
}
