package io.jovi.swallow.jdk8.functioninterface;/**
 * Created by jovi on 22/02/2018.
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
 * All rights reserved. 2018-02-22 10:29
 * </p>
 *
 * @author MaoJiaWei
 * @version 1.0
 */
public class TestFunctionInterfaceMain {
    public static void main(String[] args) {
        TestFunctionInterfaceMain main = new TestFunctionInterfaceMain();
        //lambda
        main.test(10,() -> System.out.println("A customed lambda Func"));
        //method reference
        main.test(10,main::customedFunc);
    }

    public void customedFunc(){
        System.out.println("A customed method reference");
    }

    public void  test(int x,Func func){
        System.out.println(x);
        func.run();
    }
}
