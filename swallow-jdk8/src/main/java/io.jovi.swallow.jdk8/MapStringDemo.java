package io.jovi.swallow.jdk8;/**
 * Created by jovi on 19/02/2018.
 */
import java.util.Arrays;
import java.util.List;
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
 * All rights reserved. 2018-02-19 16:57
 * </p>
 *
 * @author MaoJiaWei
 * @version 1.0
 */
public class MapStringDemo {
    public static void main(String[] args) {
        // 将字符串换成大写并用逗号链接起来
        List<String> G7 = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.","Canada");
        String G7Countries = G7.stream().map(x -> x.toUpperCase()).collect(Collectors.joining(", "));
        System.out.println(G7Countries);
    }
}
