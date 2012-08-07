/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netsescr.server;

/**
 *
 * @author cmaguinness
 */
public class ApagarServer implements ICommand{
    
    private IServer server;
    
    public ApagarServer(IServer server){
        this.server = server;
    }

    @Override
    public void ejecutar() {
        server.apagar();
        
    }
    
}
