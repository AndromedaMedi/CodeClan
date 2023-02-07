import java.awt.print.Book;
import java.util.ArrayList;

public class Library {

    private ArrayList<Books> books;
    private int capacity;

    public Library(int capacity) {
        this.books = new ArrayList<>();
        this.capacity = capacity;
    }

    public int getBookCount() {
        return this.books.size();
    }

    public void addBook(Books book1) {
        if (getBookCount() == this.capacity) {
        } else {
            books.add(book1);
        }
    }

    public void removeBook(Books book1) {
        books.remove(book1);
    }
}


