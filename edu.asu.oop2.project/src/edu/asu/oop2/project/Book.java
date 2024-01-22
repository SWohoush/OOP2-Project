package edu.asu.oop2.project;

public class Book {

    private String title;
    private String id;
    private String author;
    private int yearOfPublication;
    private String publisher;
    protected String type;

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public Book setTitle(String title) {
        this.title = title;
        return this;
    }

    public Book setId(String id) {
        this.id = id;
        return this;
    }

    public Book setAuthor(String author) {
        this.author = author;
        return this;
    }

    public Book setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
        return this;
    }

    public Book setPublisher(String publisher) {
        this.publisher = publisher;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public String getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public String getPublisher() {
        return publisher;
    }

    @Override
    public String toString() {
        return "Book{" + "Title:" + title + ", Id:" + id + ", Author:" + author
                + ", Year of publication:" + yearOfPublication + ", Publisher:"
                + publisher + '}';
    }

}
