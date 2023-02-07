import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;

    private Library library;
    private Books book1;



    @Before
    public void before() {
        borrower = new Borrower();
        library = new Library(5);
        book1 = new Books("Title", "John", "Fiction");
    }

    @Test
    public void canGetCollectionCount() {
        assertEquals(0, borrower.getCollectionCount());
    }

    @Test
    public void canAddBookToCollection() {
        library.addBook(book1);
        borrower.getBookFromLibrary(library, book1);
        assertEquals(1, borrower.getCollectionCount());
    }
}
