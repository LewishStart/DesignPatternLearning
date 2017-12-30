package com.example.sample.proxy_pattern.static_proxy.normal;


import com.example.sample.proxy_pattern.static_proxy.IEarnMoney;

/**
 * author: sundong
 * created at 2017/4/26 11:03
 */
public class GamePlayerProxy implements IGamePlayer,IEarnMoney {
    private IGamePlayer gamePlayer;

    public GamePlayerProxy(IGamePlayer gamePlayer) {
        this.gamePlayer = gamePlayer;
    }

    @Override
    public void login(String userName, String userPwd) {
        gamePlayer.login(userName,userPwd);
    }

    @Override
    public void killBoss() {
        gamePlayer.killBoss();
    }

    @Override
    public void upgrade() {
        gamePlayer.upgrade();
    }

    @Override
    public void makeProfit() {
        System.out.println("------共赚15元------");
    }
}
