package edu.asu.oop2.project;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class BookManager {

    String file;
    private static BookManager instance = new BookManager();
    Notification notifier = new Notification();
    BookFactory bookFactory;

    private BookManager() {
        file = "BookstoreCatalog.txt";
        notifier.subscribe(new FrmUpdateNotification());
    }

    public static BookManager getInstance() {
        return instance;
    }

    public void writeOnFile(Book book) throws IOException {
        FileWriter fw = new FileWriter(file, true);
        fw.append(book.getId() + "|" + book.getTitle() + "|"
                + book.getAuthor() + "|" + book.getYearOfPublication() + "|"
                + book.getPublisher() + "|" + book.getType() + "\n");
        fw.close();
    }

    public ArrayList<Book> viewBookCatalog() throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(file));
        ArrayList<Book> books = new ArrayList();
        for (String line : lines) {
            String[] book = line.split("\\|");
            bookFactory = chooseType(book[5]);
            Book tempBook = bookFactory.createBook();
            tempBook.setId(book[0]).setTitle(book[1]).setAuthor(book[2])
                    .setYearOfPublication(Integer.parseInt(book[3])).setPublisher(book[4]);
            books.add(tempBook);
        }
        return books;
    }

    public void addBook(String title, String id, String author, String yearOfPublication, String publisher, String type) throws IOException {
        bookFactory = chooseType(type);
        Book book = bookFactory.createBook();
        book.setTitle(title).setId(id).setYearOfPublication(Integer.parseInt(yearOfPublication))
                .setPublisher(publisher).setAuthor(author);
        writeOnFile(book);
        notifier.alert("Book added successully");
    }

    private BookFactory chooseType(String type) {
        if (type.equalsIgnoreCase("Physical")) {
            return new PhysicalBookCreator();
        } else {
            return new DigitalBookCreator();
        }
    }

    public void deleteBook(String bookInfo) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            StringBuilder newContent = new StringBuilder();
            String currentLine;
            while ((currentLine = br.readLine()) != null) {
                if (!currentLine.trim().equals(bookInfo.trim())) {
                    newContent.append(currentLine).append("\n");
                }
            }
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
                bw.write(newContent.toString());
            }
            notifier.alert("Book deleted successfully");
        } catch (IOException e) {
            e.printStackTrace();
            notifier.alert("Error updating book");
        }

    }

    public void updateBook(String bookInfo, String newInfo) {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            StringBuilder newContent = new StringBuilder();
            String currentLine;
            while ((currentLine = br.readLine()) != null) {
                if (currentLine.equals(bookInfo)) {
                    newContent.append(newInfo).append("\n");
                } else {
                    newContent.append(currentLine).append("\n");
                }
            }
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
                bw.write(newContent.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        notifier.alert("Book updated successfully");
    }

}
