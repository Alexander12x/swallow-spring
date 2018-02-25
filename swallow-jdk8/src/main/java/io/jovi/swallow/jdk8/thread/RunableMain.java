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
 * All rights reserved. 2018-02-23 14:10
 * </p>
 *ru
 * @author MaoJiaWei
 * @version 1.0
 */
public class RunableMain implements Runnable{
    private String name;

    public RunableMain(String name) {
        this.name=name;
    }
    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            int sleep = new Random().nextInt(10)+1;
            System.out.println(name + "运行  :  " + i+",睡眠时间:"+sleep);
            try {
                Thread.sleep(sleep);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new Thread(new RunableMain("C")).start();
        new Thread(new RunableMain("D")).start();
    }
}
