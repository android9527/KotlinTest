package com.android9527.interfacetest;

/**
 * Created by chenfeiyue on 18/2/6.
 * Description:
 */
public interface IDriverJava {

    int AGE = 25;

    void drive();

    default void getName() {
        System.out.println("default fun getName()");
    }
}
