package com.springBootApp.VoJson;

import lombok.Data;

/**
 * Created by luis on 4/28/2017.
 */


public class Shop {

    private String name;
    private String []locations;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getLocations() {
        return locations;
    }

    public void setLocations(String[] locations) {
        this.locations = locations;
    }
}
