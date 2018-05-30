package io.jovi.swallow.guava.option;


import com.google.common.base.Optional;

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
public class OptionTest {

    private static Long optionForLong(Long a){
        return Optional.fromNullable(a).or(0L);
    }

    public static void testOptional() throws Exception {
        Optional<Integer> possible=Optional.of(6);
        Optional<Integer> absentOpt=Optional.absent();
        Optional<Integer> NullableOpt=Optional.fromNullable(null);
        Optional<Integer> NoNullableOpt=Optional.fromNullable(10);
        if(possible.isPresent()){
            System.out.println("possible isPresent:"+possible.isPresent());
            System.out.println("possible value:"+possible.get());
        }
        if(absentOpt.isPresent()){
            System.out.println("absentOpt isPresent:"+absentOpt.isPresent()); ;
        }
        if(NullableOpt.isPresent()){
            System.out.println("fromNullableOpt isPresent:"+NullableOpt.isPresent()); ;
        }
        if(NoNullableOpt.isPresent()){
            System.out.println("NoNullableOpt isPresent:"+NoNullableOpt.isPresent()); ;
        }
    }

    public static void main(String[] args) throws Exception  {
        Long count = 10L;
        Long b = Optional.fromNullable(count).or(0L);
        System.out.println("b="+b);
    }
}
