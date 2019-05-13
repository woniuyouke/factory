package com.kk.factory;

import com.kk.factory.LamCarFactory;
import com.kk.factory.RollsCarFactory;

/**
 * 工厂方法
 */
public class AbstractCarTest {
    public static void main(String[] args) {
        LamCarFactory lamCarFactory = new LamCarFactory();
        lamCarFactory.create().feature();
        RollsCarFactory rollsCarFactory = new RollsCarFactory();
        rollsCarFactory.create().feature();
    }
}
