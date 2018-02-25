package io.jovi.swallow.jdk8.thread;/**
 * Created by jovi on 23/02/2018.
 */

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * <p>
 * Title:
 * </p>
 * <p>
 * Description:
 * </p>
 * <p>
 * Copyright: Copyright (c) 2016
 * All rights reserved. 2018-02-23 13:34
 * </p>
 *
 * @author MaoJiaWei
 * @version 1.0
 */
public class TicketMain {

    static transient int nums = 100;

    static Object lock = new Object();

    static ExecutorService executorService = Executors.newCachedThreadPool();

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            executorService.execute(() -> {
                while (true) {
                    if (nums <= 0) {
                        break;
                    }
                    synchronized (lock) {
                        if (nums <= 0) {
                            break;
                        }
                        System.out.println(Thread.currentThread().getName() + "在售出第" + nums-- + "票");
                    }
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
        executorService.shutdown();
    }
}

