package com.example.sample.memento_pattern;

/**
 * author: sundong
 * created at 2017/5/16 17:31
 */

public class CallOfDutyGame {
    private int mCheckPoint = 1;
    private int mLifeValue = 100;
    private String mWeapon = "沙漠之鹰";

    public void playGame(){
        System.out.println("------------开始游戏-------------");
        System.out.println(toString());
        System.out.println("第"+mCheckPoint+"关，奋战杀敌中。");
        mLifeValue-=10;
        System.out.println("升级啦！到达第"+(++mCheckPoint)+"关");
        System.out.println("---------------------------------");
    }

    public void quitGame(){
        System.out.println("----------准备退出游戏-----------");
        System.out.println("退出前游戏属性："+toString());
        System.out.println("-----------已退出游戏------------");
    }

    public Memoto createMemoto(){
        Memoto memoto = new Memoto();
        memoto.setmCheckPoint(mCheckPoint);
        memoto.setmLifeValue(mLifeValue);
        memoto.setmWeapon(mWeapon);
        System.out.println("-----------游戏保存完毕-----------");
        return memoto;
    }

    public void restoreMemoto(Memoto memoto){
        mCheckPoint = memoto.getmCheckPoint();
        mLifeValue = memoto.getmLifeValue();
        mWeapon = memoto.getmWeapon();
        System.out.println("-----------游戏已恢复存档-----------");
    }
    @Override
    public String toString() {
        return "CallOfDutyGame{" +
                "mCheckPoint=" + mCheckPoint +
                ", mLifeValue=" + mLifeValue +
                ", mWeapon='" + mWeapon + '\'' +
                '}';
    }
}
