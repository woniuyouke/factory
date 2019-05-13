package com.kk.factory;

public class LamCarFactory extends AbstractCarFactory {
    public ICar create() {
        return new Lamborghini();
    }
}
