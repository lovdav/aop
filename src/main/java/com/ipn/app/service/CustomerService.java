/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ipn.app.service;

/**
 *
 * @author dml
 */
public class CustomerService 
{
    private String name;
    private String url;

    public void printName() {
            System.out.println("Customer name : " + this.getName());
    }

    public void printURL() {
            System.out.println("Customer website : " + this.getUrl());
    }

    public void printThrowException() {
        System.out.println("printThrowException");
            throw new IllegalArgumentException();
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url the url to set
     */
    public void setUrl(String url) {
        this.url = url;
    }
}
