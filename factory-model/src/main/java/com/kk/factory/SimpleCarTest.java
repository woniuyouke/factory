package com.kk.factory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 简单工厂
 */
public class SimpleCarTest {

    static Logger logger = LoggerFactory.getLogger(SimpleCarTest.class);

    public static void main(String[] args) {
        logger.info("开始");
        SimpleCarFactory carFactory = new SimpleCarFactory();
        ICar lam = carFactory.create(Lamborghini.class);
        lam.feature();
        /*ICar ro = carFactory.create(Rolls.class);
        ro.feature();*/
        logger.info("结束");
    }
}
