/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ipn.app.advice;

import java.lang.reflect.Method;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.MethodBeforeAdvice;

/**
 *
 * @author dml
 */
public class HijackBeforeMethod implements MethodBeforeAdvice
{
    private final Log logger = LogFactory.getLog(getClass());
    
    public void before(Method method, Object[] args, Object target) throws Throwable {
        logger.info("HijackBeforeMethod : Before method hijacked!" );
        System.out.println("HijackBeforeMethod : Before method hijacked!" );
    }
    
}
