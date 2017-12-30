package com.example.sample.proxy_pattern.static_proxy.normal;

/**
 * author: sundong
 * created at 2017/4/26 11:03
 */
public class Client {
    public static void main(String[] args){
        //定义一个玩家
        IGamePlayer gamePlayer = new GamePlayer("Lewish");
        //定义一个代练
        IGamePlayer gamePlayerProxy = new GamePlayerProxy(gamePlayer);
        //开始打游戏
        System.out.println("-----游戏开始-----");
        gamePlayerProxy.login("Lewish","qwd");
        gamePlayerProxy.killBoss();
        gamePlayerProxy.upgrade();
        System.out.println("-----游戏结束-----");
    }
}
