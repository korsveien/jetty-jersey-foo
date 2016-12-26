package com.example;

import com.example.viewmodel.FooViewModel;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public class FooResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public FooViewModel getIt() {
        FooViewModel model = new FooViewModel();
        model.id = 1;
        model.foo = "foo";
        return model;
    }
}
