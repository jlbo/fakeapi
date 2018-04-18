package edu.drexel.mqtt.fake.resources;

import edu.drexel.mqtt.fake.gps.models.Coordinate;
import edu.drexel.mqtt.fake.gps.models.CoordinateHist;
import edu.drexel.mqtt.fake.gps.services.CoordHistoryService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/device")
public class DeviceResource extends BasicResource {

    public static CoordHistoryService coordHistoryService;

    public DeviceResource() {
        this.coordHistoryService = new CoordHistoryService();
    }

    @GET
    @Path("/{id}/coordhistory")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getCoordHistory(@PathParam("id") int id, @Context HttpHeaders headers) throws Exception {
        CoordinateHist coordHistory = coordHistoryService.getCoordHistory(id);
        return getResponse(Response.Status.OK, coordHistory);

    }
}
