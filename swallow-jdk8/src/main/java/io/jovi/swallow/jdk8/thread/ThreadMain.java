package io.jovi.swallow.jdk8.thread;/**
 * Created by jovi on 23/02/2018.
 */

import java.util.Random;

/**
 * <p>
 * Title:
 * </p>
 * <p>
 * Description:
 * </p>
 * <p>
 * Copyright: Copyright (c) 2016
 * All rights reserved. 2018-02-23 12:31
 * </p>
 *
 * @author MaoJiaWei
 * @version 1.0
 */

public class ThreadMain extends Thread {
    private String name;

    public ThreadMain(String name) {
        this.name=name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            int sleep = new Random().nextInt(10)+1;
            System.out.println(name + "运行  :  " + i+",睡眠时间:"+sleep);
            try {
                sleep(sleep);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
    public static void main(String[] args) {
        ThreadMain mTh1=new ThreadMain("A");
        ThreadMain mTh2=new ThreadMain("B");
        mTh1.start();
        mTh2.start();

    }

}
