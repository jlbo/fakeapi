package edu.drexel.mqtt.fake.gps.services;

import edu.drexel.mqtt.fake.gps.models.Coordinate;
import edu.drexel.mqtt.fake.gps.models.CoordinateHist;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CoordHistoryService {

    List<Coordinate> coordHistory;
    public CoordHistoryService() {
        coordHistory = new ArrayList<>();
        Coordinate coord1 = new Coordinate();
        Coordinate coord2 = new Coordinate();

        coord1.setLatitude(39.956631);
        coord1.setLongitude(-75.190741);
        coord1.setTime(new Date());
        coord2.setLatitude(39.957092);
        coord2.setLongitude(-75.189409);
        coord2.setTime(new Date(coord1.getTime().getTime() - 180000)); // - 3min

        coordHistory.add(coord1);
        coordHistory.add(coord2);

    }
    public List<Coordinate> getCoordHistory() {
        return coordHistory;
    }
}
