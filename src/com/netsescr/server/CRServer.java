/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netsescr.server;

/**
 *
 * @author cmaguinness
 */
public class CRServer implements IServer{

    @Override
    public void apagar() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void encender() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void reset() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getNombre() {
        return "CR Server";
    }
    
}
