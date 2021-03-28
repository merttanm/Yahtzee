/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.yahtzeegameserver;

/**
 *
 * @author MERT
 */
public class RunMain {

    public static void main(String[] args) {
        Server myServer = new Server(5000);
        myServer.Listen();
    }

}
