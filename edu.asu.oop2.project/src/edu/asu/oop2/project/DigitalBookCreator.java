package edu.asu.oop2.project;


public class DigitalBookCreator implements BookFactory{

    @Override
    public Book createBook() {
        return new DigitalBook();
    }
    
}
