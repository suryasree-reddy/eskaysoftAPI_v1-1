package com.rest.eskaysoftAPI;

import java.io.IOException;

import javax.inject.Singleton;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.Provider;

@Singleton
@Provider
public class CORSResponseFilter implements   ContainerResponseFilter{

    @Override
    public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext)
            throws IOException {
        final int ACCESS_CONTROL_MAX_AGE_IN_SECONDS = 12 * 60 * 60;
        MultivaluedMap<String, Object> headers = responseContext.getHeaders();

        headers.add("Access-Control-Allow-Origin", "*");
        //headers.add("Access-Control-Allow-Origin","http://eskaysoft.org"); //allows CORS requests only coming fromabcd.org
        headers.add("Access-Control-Allow-Methods", "GET, POST, PUT,DELETE, OPTIONS, HEAD");
        headers.add("Access-Control-Allow-Headers", "access-control-allow-headers, access-control-allow-methods, access-control-allow-origin, authorization, content-type");
        headers.add("Access-Control-Max-Age",ACCESS_CONTROL_MAX_AGE_IN_SECONDS);

    }

}