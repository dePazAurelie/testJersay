/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testws.coding.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mycompany.testws.coding.Toto;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author mchinchole
 */
@Path("todos")
public class TodoConstroller {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getHello() {
        Toto t = new Toto();
        t.setLine("tre");
        final GsonBuilder builder = new GsonBuilder();
        final Gson gson = builder.create();
        return Response.ok().entity(gson.toJson(t))
                .header("Access-Control-Allow-Origin", "*")
                .header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT")
                .allow("OPTIONS")
                .build();
        //response.addHeader("Access-Control-Allow-Origin", "*"); 
        //return t;
    }
}
