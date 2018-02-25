package io.jovi.swallow.jdk8.thread;/**
 * Created by jovi on 23/02/2018.
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
 * All rights reserved. 2018-02-23 13:23
 * </p>
 *
 * @author MaoJiaWei
 * @version 1.0
 */
public class ThreadJoinMain implements Runnable {
    String name;
    int i=0;
    public  ThreadJoinMain(String name){
        this.name=name;
    }

    private String getName(){

        return name;
    }

    @Override
    public void run() {

        while (i<5) {
            System.out.println( getName()+"----"+(++i));
        }
    }
    public static void main(String[] args) {
        try {

            Thread thread=new Thread(new ThreadJoinMain("线程1"));
            thread.start();
            thread.join();

            Thread thread2=new Thread(new ThreadJoinMain("线程2"));
            thread2.start();
            thread2.join();

            Thread thread3=new Thread(new ThreadJoinMain("线程3"));
            thread3.start();
            thread3.join();

        } catch (Exception e) {

        }

    }
}



