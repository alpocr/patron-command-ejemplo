/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netsescr.server;

/**
 *
 * @author cmaguinness
 */
public class PanamaServer implements IServer{
    

    @Override
    public void apagar() {
        System.out.println("Apagando "+getNombre());
    }

    @Override
    public void encender() {
        System.out.println("Encendiendo "+getNombre());
    }

    @Override
    public void reset() {
        System.out.println("Reset "+getNombre());
    }

    @Override
    public String getNombre() {
        return "Panama Server";
    }
    
}
