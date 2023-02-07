import org.jetbrains.annotations.NotNull;

import java.awt.print.Book;
import java.util.ArrayList;

public class Borrower {

    private Library library;

    private ArrayList<Books> collection;

    public Borrower() {
        this.collection = new ArrayList<>();
    }

    public int getCollectionCount() {
        return this.collection.size();
    }

    public void getBookFromLibrary(@NotNull Library library, Books book1) {
        library.removeBook(book1);
        this.collection.add(book1);
    }

}
