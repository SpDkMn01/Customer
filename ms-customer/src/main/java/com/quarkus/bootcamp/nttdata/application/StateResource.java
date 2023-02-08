package com.quarkus.bootcamp.nttdata.application;

import com.quarkus.bootcamp.nttdata.domain.entity.State;
import com.quarkus.bootcamp.nttdata.domain.services.StateService;
import io.smallrye.mutiny.Uni;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("/state")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@ApplicationScoped
public class StateResource {

    @Inject
    StateService service;
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Response hello() {
        return Response.ok(service.getAll()).build();
    }
}
