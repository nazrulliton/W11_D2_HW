import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    private Library library;
    private Book book;
    private Book book1;

    @Before
    public void before(){
        library = new Library(3);
        book = new Book("Harry P", "JK", "Fantasy");
        book1 = new Book("Jack Ryan", "Lee Child", "Factual");
    }
    @Test
    public void canAddBooks(){
        library.addBook(book);
        library.addBook(book1);
        assertEquals(2, library.bookCount());
    }
}
