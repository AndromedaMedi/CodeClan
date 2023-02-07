import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BooksTest {

    private Books book;

    @Before
    public void before() {
        book = new Books("Title", "John", "Fiction");
    }

    @Test
    public void bookHasTitle() {
        assertEquals("Title", book.getTitle());
    }

    @Test
    public void bookHasAuthor() {
        assertEquals("John", book.getAuthor());
    }

    @Test
    public void bookHasGenre() {
        assertEquals("Fiction", book.getGenre());
    }

}
