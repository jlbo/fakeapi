package edu.drexel.mqtt.fake.resources;

import javax.ws.rs.core.Response;

public class BasicResource
{
    /**
     * This method builds a response and returns it
     * @param status - response status code
     * @param entity - Object to be develivered in response
     * @return Response
     */
    public Response getResponse(Response.Status status, Object entity) {
        return Response.status(status).entity(entity).build();
    }

    /**
     * This method builds a response and returns it
     * @param status - response status code
     * @return Response
     */
    public Response getResponse(Response.Status status) {
        return Response.status(status).build();
    }
}
