/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ipn.app.advice;

import java.util.Arrays;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 *
 * @author dml
 */
public class BitacoraAspectAround implements MethodInterceptor{

    public Object invoke(MethodInvocation methodInvocation) throws Throwable 
    {
        System.out.println("Method name : " + methodInvocation.getMethod().getName());
	System.out.println("Method arguments : " + Arrays.toString(methodInvocation.getArguments()));

	// same with MethodBeforeAdvice
	System.out.println("****** Before method hijacked! *******");

	try {
            // proceed to original method call
            Object result = methodInvocation.proceed();
            
            // same with AfterReturningAdvice
            System.out.println("****** Before after hijacked! *********");

            return result;
        } catch (IllegalArgumentException e) {
            // same with ThrowsAdvice
            System.out.println("********** Throw exception hijacked! *************");
            throw e;
	}
    }
    
}
