/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testws.coding;

import com.mycompany.testws.coding.controller.TodoConstroller;
import com.sun.net.httpserver.HttpServer;
import java.net.URI;
import javax.ws.rs.core.UriBuilder;
import org.glassfish.jersey.jdkhttp.JdkHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

/**
 *
 * @author mchinchole
 */
public class Main {

    public static void main(String args[]) {
        URI baseUri = UriBuilder.fromUri("http://localhost/").port(9090).build();
        ResourceConfig config = new ResourceConfig(TodoConstroller.class);
        HttpServer server = JdkHttpServerFactory.createHttpServer(baseUri, config);
    }

}
