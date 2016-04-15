/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ipn.app;

import com.ipn.app.service.AdministraUsuariosService;
import com.ipn.app.service.CustomerService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author dml
 */
public class CustomerServiceTest 
{
    protected final Log logger = LogFactory.getLog(getClass());
    
    private ApplicationContext ctx;
    
     @Before
    public void setUp() throws Exception {
        ctx = new ClassPathXmlApplicationContext("spring-customer.xml");
         Assert.assertNotNull(ctx );
        logger.debug("Inicio de la prueba unitaria");
    }
    
    //@Test
    public void testCustomer(){
        CustomerService cust = (CustomerService) ctx.getBean("customerService");
        this.imprimir(cust);
        //assertEquals(descripcion,"Lamp");
    }
    
    //@Test
    public void testCustomerProxy(){
        CustomerService cust = (CustomerService) ctx.getBean("customerServiceProxy");
        this.imprimir(cust);
    }
    
    @Test
    public void testUserProxy(){
        AdministraUsuariosService cust = (AdministraUsuariosService) ctx.getBean("usuarioServiceProxy");
        cust.agregarUsuario();
    }
    
    private void imprimir(CustomerService cust)
    {
        System.out.println("*************************");
        cust.printName();
        System.out.println("*************************");
        cust.printURL();
        System.out.println("*************************");
        try {
                cust.printThrowException();
        } catch (Exception e) {
            System.out.println("\n\n");
        }
    }
}
