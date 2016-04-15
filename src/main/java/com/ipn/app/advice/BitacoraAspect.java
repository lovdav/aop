/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ipn.app.advice;

import java.lang.reflect.Method;
import org.springframework.aop.AfterReturningAdvice;

/**
 *
 * @author dml
 */
public class BitacoraAspect implements AfterReturningAdvice
{
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("Despues de correr el metodo");
        System.out.println("Método: " + method);
        System.out.println("Objeto cargado: " + target);
    }
    
}
