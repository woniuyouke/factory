package com.kk.factory;

public class RollsCarFactory extends AbstractCarFactory {
    public  ICar create() {
        return new Rolls();
    }
}
