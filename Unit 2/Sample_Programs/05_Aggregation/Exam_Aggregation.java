package sample_programs.aggregation;

class Library {
    private String name;
    private Book currentLentBook; // Aggregation

    Library(String name) { this.name = name; }
    
    void lendBook(Book b) { this.currentLentBook = b; }
    Book getLentBook() { return currentLentBook; }
}

class Book {
    String title;
    Book(String title) { this.title = title; }
}

/**
 * AIM: Demonstrate dynamic aggregation links via setters (Exam-Oriented).
 */
public class Exam_Aggregation {
    public static void main(String[] args) {
        Library lib = new Library("Central Library");
        Book book = new Book("Java Programming");
        lib.lendBook(book);
        System.out.println("Lent book: " + lib.getLentBook().title);
    }
}
