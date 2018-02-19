package io.jovi.swallow.spring5.controller;/**
 * Created by jovi on 19/02/2018.
 */

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * <p>
 * Title:
 * </p>
 * <p>
 * Description:
 * </p>
 * <p>
 * Copyright: Copyright (c) 2016
 * All rights reserved. 2018-02-19 21:35
 * </p>
 *
 * @author MaoJiaWei
 * @version 1.0
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public Mono<String> sayHelloWorld() {
        return Mono.just("Hello World addd");
    }
}
