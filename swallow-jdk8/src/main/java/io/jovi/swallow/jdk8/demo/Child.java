package io.jovi.swallow.jdk8.demo;/**
 * Created by jovi on 25/02/2018.
 */

/**
 * <p>
 * Title:
 * </p>
 * <p>
 * Description:
 * </p>
 * <p>
 * Copyright: Copyright (c) 2016
 * All rights reserved. 2018-02-25 22:33
 * </p>
 *
 * @author MaoJiaWei
 * @version 1.0
 */
public class Child extends Father {
    static {
        System.out.println("B");
    }

    public Child(){
        System.out.println("CHILD");
    }

    public static void main(String[] args) {
        //Child child = new Child();
        /*
         * A
         * B
         * FATHER
         * CHILD
         */
        Father father = new Child();


    }
}
