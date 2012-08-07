/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netsescr;

import com.netsescr.server.CRServer;
import com.netsescr.server.EncenderServer;
import com.netsescr.server.ICommand;
import com.netsescr.server.Invocador;

/**
 *
 * @author cmaguinness
 */
public class Probador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        ICommand command = new EncenderServer(new CRServer());
        Invocador adminServer = new Invocador(command);
        
        
        adminServer.correr();
        
    }
}
