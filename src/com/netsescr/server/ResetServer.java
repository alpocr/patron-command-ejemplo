/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netsescr.server;

/**
 *
 * @author cmaguinness
 */
public class ResetServer implements ICommand {

    private IServer server;

    public ResetServer(IServer server) {
        this.server = server;
    }

    @Override
    public void ejecutar() {
        getServer().reset();
    }

    /**
     * @return the server
     */
    public IServer getServer() {
        return server;
    }

    /**
     * @param server the server to set
     */
    public void setServer(IServer server) {
        this.server = server;
    }
}
