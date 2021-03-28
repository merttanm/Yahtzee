/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.yahtzeegameserver;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MERT
 */
public class Server {

    public ServerSocket socket;
    public ListenThread ListenThread;
    public int port;

    public Server(int port) {

        try {
            this.port = port;
            this.socket = new ServerSocket(port);
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void Listen() {
        while (!this.socket.isClosed()) {
            try {
                System.out.println("Listening");
                Socket nClint = this.socket.accept();
                System.out.println("Clint Connected");
                ObjectOutputStream cOutput = new ObjectOutputStream(nClint.getOutputStream());
                ObjectInputStream cInput = new ObjectInputStream(nClint.getInputStream());

                Object obj = cInput.readObject();
                System.out.println(obj.toString());
                
                cOutput.writeObject("Aleykümselam");

            } catch (IOException ex) {
                Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }
}

class ListenThread extends Thread {

    private ServerSocket socket;

    public ListenThread(ServerSocket socket) {
        //    this.socket = socket;

    }

    @Override
    public void run() {

        while (!this.socket.isClosed()) {
            try {
                Socket nClint = this.socket.accept();
                ObjectOutputStream cOutput = new ObjectOutputStream(nClint.getOutputStream());
                ObjectInputStream cInput = new ObjectInputStream(nClint.getInputStream());

                Object obj = cInput.readObject();
                System.out.println(obj.toString());

                cOutput.writeObject("Aleykümselam");

            } catch (IOException ex) {
                Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

}
