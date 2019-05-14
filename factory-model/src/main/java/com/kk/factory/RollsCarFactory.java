package com.kk.factory;

public class RollsCarFactory extends CarFactoryMethod {
    public  ICar create() {
        return new Rolls();
    }
}
