package com.example.sample.proxy_pattern.static_proxy.force;

/**
 * author: sundong
 * created at 2017/4/26 11:03
 */
public class Client {
    public static void main(String[] args){
//        /**
//         * 错误的访问方式
//         */
//        IGamePlayer gamePlayer = new GamePlayer("Lewish");
//        IGamePlayer gamePlayerProxy = new GamePlayerProxy(gamePlayer);
//        gamePlayerProxy.login("Lewish","pwd");

        IGamePlayer gamePlayer = new GamePlayer("Lewish");
        IGamePlayer gamePlayerProxy = gamePlayer.getProxy();
        System.out.println("-----游戏开始-----");
        gamePlayerProxy.login("Lewish","pwd");
        gamePlayerProxy.killBoss();
        gamePlayerProxy.upgrade();
        System.out.println("-----游戏结束-----");
    }
}
