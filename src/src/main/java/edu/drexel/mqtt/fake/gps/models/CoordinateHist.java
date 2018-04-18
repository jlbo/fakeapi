package edu.drexel.mqtt.fake.gps.models;

import java.util.List;

public class CoordinateHist {

    private List<Coordinate> coordHistory;

    public List<Coordinate> getCoordHistory() {
        return coordHistory;
    }

    public void setCoordHistory(List<Coordinate> coordHistory) {
        this.coordHistory = coordHistory;
    }
}
