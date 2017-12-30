package com.example.sample.factory_pattern.factory_method;

/**
 * author: sundong
 * created at 2017/4/19 16:07
 */

public class ImprovedBMWFactory {
    private static class SingletonHolder {
        private static final ImprovedBMWFactory INSTANCE = new ImprovedBMWFactory();
    }

    public static ImprovedBMWFactory getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public <T extends BMW> T createBMW(Class<T> clazz) {
        BMW bmw = null;
        try {
            bmw = (BMW) Class.forName(clazz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T) bmw;
    }
}
