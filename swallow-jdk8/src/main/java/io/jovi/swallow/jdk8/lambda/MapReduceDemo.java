package io.jovi.swallow.jdk8.lambda;/**
 * Created by jovi on 19/02/2018.
 */

import java.util.Arrays;
import java.util.List;

/**
 * <p>
 * Title:
 * </p>
 * <p>
 * Description:
 * </p>
 * <p>
 * Copyright: Copyright (c) 2016
 * All rights reserved. 2018-02-19 16:47
 * </p>
 *
 * @author MaoJiaWei
 * @version 1.0
 */
public class MapReduceDemo {
    private static List<Integer> costBeforeTax = Arrays.asList(100, 200, 300, 400, 500);

    public static void main(String[] args) {
        mapreduce();
    }
    //为每个订单加上12%的税
    private static void map(){

        costBeforeTax.stream().map((cost) -> cost + .12*cost).forEach(System.out::println);
    }

    //加税后进行整合
    private static void mapreduce(){
        double bill = costBeforeTax.stream().map((cost) -> cost + .12*cost).reduce((sum, cost) -> sum + cost).get();
        System.out.println("Total : " + bill);
    }
}
