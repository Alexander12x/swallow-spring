package io.jovi.swallow.springaop.monitor;/**
 * Created by jovi on 21/02/2018.
 */

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
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
 * All rights reserved. 2018-02-21 16:07
 * </p>
 *
 * @author MaoJiaWei
 * @version 1.0
 */
@Aspect
@Component
public class ServiceMonitor {
    @AfterReturning("execution(* sample..*Service.*(..))")
    public void logServiceAccess(JoinPoint joinPoint) {
        System.out.println("Completed: " + joinPoint);
    }
}
