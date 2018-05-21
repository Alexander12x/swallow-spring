package io.jovi.swallow.guava.googlecontainers;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ListMultimap;

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
public class MutiMapTest {
    public static void main(String[] args) {

        ListMultimap<String,Long> multimap = ArrayListMultimap.create();
        multimap.put("a",1L);
        multimap.put("a",1L);
        multimap.put("a",1L);
        multimap.put("a",2L);
        multimap.put("a",3L);
        multimap.put("a",4L);

        System.out.println(multimap.get("a"));
    }
}
