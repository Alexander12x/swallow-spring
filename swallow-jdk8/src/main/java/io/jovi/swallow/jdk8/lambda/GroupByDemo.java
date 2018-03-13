package io.jovi.swallow.jdk8.lambda;/**
 * Created by jovi on 13/03/2018.
 */

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * <p>
 * Title:
 * </p>
 * <p>
 * Description:
 * </p>
 * <p>
 * Copyright: Copyright (c) 2016
 * All rights reserved. 2018-03-13 20:53
 * </p>
 *
 * @author MaoJiaWei
 * @version 1.0
 */
public class GroupByDemo {

    public static void main(String[] args) {
        //3 apple, 2 banana, others 1
        //3 apple, 2 banana, others 1
        List<String> items =
                Arrays.asList("apple", "apple", "banana",
                        "apple", "orange", "banana", "papaya");

        Map<String, Long> result = items.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(result);

    }
}


