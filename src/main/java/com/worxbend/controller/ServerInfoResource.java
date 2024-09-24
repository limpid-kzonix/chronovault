package com.worxbend.controller;

import com.worxbend.dto.request.ServerInfo;
import io.smallrye.mutiny.Uni;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.jboss.resteasy.reactive.RestStreamElementType;

import java.util.function.Supplier;

@Path("/information")
public class ServerInfoResource {

    @GET
    @Path("server")
    @Produces(MediaType.APPLICATION_JSON)
    @RestStreamElementType(MediaType.APPLICATION_JSON)
    public Uni<ServerInfo> getServerInfo() {
        return Uni.createFrom().item(() -> new ServerInfo(
                        "http://localhost",
                        "http://localhost",
                        "1",
                        "",
                        "",
                        ""
                )
        );
    }

    @GET
    @Path("jvm")
    @Produces(MediaType.TEXT_PLAIN)
    public Uni<String> getJvmInfo() {
        return Uni.createFrom().item("Hello from Quarkus REST");
    }

}
