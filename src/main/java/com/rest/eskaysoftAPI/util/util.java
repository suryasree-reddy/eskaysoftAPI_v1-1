package com.rest.eskaysoftAPI.util;

import javax.ws.rs.core.Response;

public class util {

	 /**
     * Create a Response instance from the current ResponseBuilder with the supplied status
     * 
     * @param statusCode
     * @param entity
     * @return Response
     * @throws Exception
     */
    public static Response buildErrorResponse(int statusCode, Object entity) {
        return Response.status(statusCode).entity(entity).header("Access-Control-Allow-Origin", "*")
                .header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT, PATCH, OPTIONS").header("content-type", "application/json; charset=utf-8").build();
    }

    /**
     * Create a Response instance from the current ResponseBuilder. The builder is reset to a blank state equivalent to
     * calling the ok method
     * 
     * @param entity
     * @return Response
     */
    public static Response buildResponse(Object entity) {
        return Response.ok().entity(entity).header("Access-Control-Allow-Origin", "*").header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT, PATCH, OPTIONS")
                .header("content-type", "application/json; charset=utf-8").build();
    }
}
