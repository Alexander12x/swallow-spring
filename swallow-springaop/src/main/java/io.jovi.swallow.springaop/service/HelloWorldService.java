package io.jovi.swallow.springaop.service;/**
 * Created by jovi on 21/02/2018.
 */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * <p>
 * Title:
 * </p>
 * <p>
 * Description:
 * </p>
 * <p>
 * Copyright: Copyright (c) 2016
 * All rights reserved. 2018-02-21 16:06
 * </p>
 *
 * @author MaoJiaWei
 * @version 1.0
 */
@Component
public class HelloWorldService {
    @Value("${name:World}")
    private String name;

    public String getHelloMessage() {
        return "Hello " + this.name;
    }
}
