package edu.asu.oop2.project;

public class PhysicalBook extends Book {

    private String locationInStore;

    public PhysicalBook() {
        type = "Physical";
    }

    public String getLocationInStore() {
        return locationInStore;
    }

    public void setLocationInStore(String locationInStore) {
        this.locationInStore = locationInStore;
    }

}
