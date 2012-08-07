/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netsescr.server;

/**
 *
 * @author cmaguinness
 */
public class Invocador {

    private ICommand command;

    public Invocador(ICommand command) {
        this.command = command;

    }

    public void correr() {
        getCommand().ejecutar();
    }

    /**
     * @return the command
     */
    public ICommand getCommand() {
        return command;
    }

    /**
     * @param command the command to set
     */
    public void setCommand(ICommand command) {
        this.command = command;
    }
}
