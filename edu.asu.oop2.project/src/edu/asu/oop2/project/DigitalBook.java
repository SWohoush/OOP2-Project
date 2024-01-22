package edu.asu.oop2.project;

public class DigitalBook extends Book {

    private String eBookPlatform;

    public DigitalBook() {
        type = "Digital";
    }

    public String geteBookPlatform() {
        return eBookPlatform;
    }

    public void seteBookPlatform(String eBookPlatform) {
        this.eBookPlatform = eBookPlatform;
    }

}
