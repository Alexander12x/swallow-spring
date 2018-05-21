package io.jovi.swallow.guava.string;

import com.google.common.base.Joiner;

/**
 * <p>
 * Title:
 * </p>
 * <p>
 * Description:
 * </p>
 * <p>
 * Copyright: Copyright (c) 2018
 * All rights reserved. 2018-05-21.
 * </p>
 *
 * @author MaoJiaWei
 * @version 1.0
 */
public class JoinerTest {
    public static void main(String[] args) {
        String str = Joiner.on(' ').join(1, 2, 3);
        System.out.println("str="+str);

        StringBuilder sb = new StringBuilder("result:");
        Joiner.on(" ").appendTo(sb, 1, 2, 3);
        System.out.println("sb="+sb);//result:1 2 3
    }
}
