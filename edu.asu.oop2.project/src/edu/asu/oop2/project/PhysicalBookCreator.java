package edu.asu.oop2.project;


public class PhysicalBookCreator implements BookFactory{

    @Override
    public Book createBook() {
        return new PhysicalBook();
    }
    
}
