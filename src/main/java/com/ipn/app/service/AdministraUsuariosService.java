/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ipn.app.service;

import com.ipn.app.bean.UsuarioBean;

/**
 *
 * @author dml
 */
public class AdministraUsuariosService 
{
    private UsuarioBean usuario;
    
    public void agregarUsuario(){
        System.out.println("Usuario agregado: " + this.usuario.getNombre() + " " + this.usuario.getApPaterno() + " " + this.usuario.getApMaterno());
    }

    /**
     * @return the usuario
     */
    public UsuarioBean getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(UsuarioBean usuario) {
        this.usuario = usuario;
    }
    
}
