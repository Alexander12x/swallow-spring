package io.jovi.swallow.springaop;/**
 * Created by jovi on 21/02/2018.
 */

import io.jovi.swallow.springaop.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <p>
 * Title:
 * </p>
 * <p>
 * Description:
 * </p>
 * <p>
 * Copyright: Copyright (c) 2016
 * All rights reserved. 2018-02-21 16:02
 * </p>
 *
 * @author MaoJiaWei
 * @version 1.0
 */
@SpringBootApplication
@EnableAutoConfiguration
public class SpringaopController implements CommandLineRunner {

    @Autowired
    private HelloWorldService helloWorldService;

    @Override
    public void run(String... strings) throws Exception {
        System.out.println(this.helloWorldService.getHelloMessage());
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringaopController.class, args);
    }
}
