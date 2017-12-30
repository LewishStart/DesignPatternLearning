package com.example.sample.proxy_pattern.dynamic_proxy;

/**
 * author: sundong
 * created at 2017/4/26 11:02
 */
public class GamePlayer implements IGamePlayer {
    private String userName;
    private boolean isLogin;
    public GamePlayer(String userName) {
        this.userName = userName;
    }

    @Override
    public void login(String userName,String userPwd) {
        if(userName.endsWith(this.userName)) {
            System.out.println("用户:"+userName+",登陆成功。");
            isLogin = true;
        }
    }

    @Override
    public void killBoss() {
        if(isLogin) {
            System.out.println(this.userName+"杀掉了Boss。");
        }else {
            System.out.println("请先登录");
        }
    }

    @Override
    public void upgrade() {
        if(isLogin) {
            System.out.println(this.userName+"升级啦！");
        }else {
            System.out.println("请先登录");
        }
    }
}
