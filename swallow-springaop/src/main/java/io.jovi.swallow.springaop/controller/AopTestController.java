package io.jovi.swallow.springaop.controller;/**
 * Created by jovi on 22/02/2018.
 */

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * Title:
 * </p>
 * <p>
 * Description:
 * </p>
 * <p>
 * Copyright: Copyright (c) 2016
 * All rights reserved. 2018-02-22 12:03
 * </p>
 *
 * @author MaoJiaWei
 * @version 1.0
 */
@RestController
@RequestMapping("/aop")
public class AopTestController {
    @RequestMapping("/testBeforeService.do")
    public String testBeforeService(String key,String value){

        return "key="+key+"  value="+value;
    }
}
