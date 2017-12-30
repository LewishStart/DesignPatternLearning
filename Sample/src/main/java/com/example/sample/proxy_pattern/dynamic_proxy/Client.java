package com.example.sample.proxy_pattern.dynamic_proxy;

/**
 * author: sundong
 * created at 2017/4/26 11:02
 */

public class Client {
    public static void main(String[] args){
        /**
         * 通常写法
         */
//        //定义一个玩家
//        IGamePlayer gamePlayer = new GamePlayer("Lewish");
//        //定义一个handler
//        InvocationHandler gamePlayerHandler = new GamePlayerHandler(gamePlayer);
//
//        System.out.println("-----游戏开始-----");
//        //获取类的ClassLoader
//        ClassLoader gamePlayerClassLoader = gamePlayer.getClass().getClassLoader();
//        //动态产生一个代理者
//        IGamePlayer gamePlayerProxy = (IGamePlayer) Proxy.newProxyInstance(gamePlayerClassLoader,new Class[]{IGamePlayer.class},gamePlayerHandler);
//        gamePlayerProxy.login("Lewish","pwd");
//        gamePlayerProxy.killBoss();
//        gamePlayerProxy.upgrade();
//        System.out.println("-----游戏结束-----");

        /**
         * 封装一下
         */
        IGamePlayer gamePlayer = new GamePlayer("Lewish");
        IGamePlayer proxy = new DynamicProxy<IGamePlayer>().bind(gamePlayer);
        System.out.println("-----游戏开始-----");
        proxy.login("Lewish","pwd");
        proxy.killBoss();
        proxy.upgrade();
        System.out.println("-----游戏结束-----");
    }
}
