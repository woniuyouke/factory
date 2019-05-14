package com.kk.factory;

public class LamCarFactory extends CarFactoryMethod {
    public ICar create() {
        return new Lamborghini();
    }
}
