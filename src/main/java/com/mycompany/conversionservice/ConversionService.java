/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.conversionservice;
import java.util.Locale;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
      
/**
 *
 * @author Rowen
 */
@Path("/conversions")
public class ConversionService {
    
    @GET
    @Path("test")
    @Produces(MediaType.APPLICATION_JSON)
    public String test() {
        return "test";
    }
    
    @GET
    @Path("ktoc/{kelvin}")
    @Produces(MediaType.APPLICATION_JSON)
    public String ktoc(@PathParam("kelvin") double kelvin) {
        return String.format(Locale.US,"%.2f", kelvin - 273.15);
    }
    
    @GET
    @Path("ctok/{celsius}")
    @Produces(MediaType.APPLICATION_JSON)
    public String ctok(@PathParam("celsius") double celsius) {
        return String.format(Locale.US,"%.2f", celsius + 273.15);
    }
    
    @GET
    @Path("mtok/{mile}")
    @Produces(MediaType.APPLICATION_JSON)
    public String mtok(@PathParam("mile") double mile) {
        return String.format(Locale.US,"%.2f",(mile * 1.609344));
    }
    
    @GET
    @Path("ktom/{km}")
    @Produces(MediaType.APPLICATION_JSON)
    public String ktom(@PathParam("km") double km) {
        return String.format(Locale.US,"%.2f",(km / 1.609344));
    }
}
