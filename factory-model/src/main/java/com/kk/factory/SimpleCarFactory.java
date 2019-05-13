package com.kk.factory;

public class SimpleCarFactory {
    public ICar create(Class clazz){
        if(clazz != null){
            try {
                return (ICar) clazz.newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
