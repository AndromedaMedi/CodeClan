import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Books book1;

    @Before
    public void before() {
        library = new Library(3);
        book1 = new Books("Title", "John", "Fiction");
    }

    @Test
    public void canGetBookCount() {
        assertEquals(0, library.getBookCount());
    }

    @Test
    public void canAddBook() {
        library.addBook(book1);
        assertEquals(1, library.getBookCount());
    }

    @Test
    public void libraryIsNotFull() {
        library.addBook(book1);
        library.addBook(book1);
        assertEquals(2, library.getBookCount());
    }

    @Test
    public void libraryIsFull() {
        library.addBook(book1);
        library.addBook(book1);
        library.addBook(book1);
        library.addBook(book1);
        assertEquals(3, library.getBookCount());
    }


}
