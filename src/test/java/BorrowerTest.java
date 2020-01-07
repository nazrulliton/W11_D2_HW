import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {
    private Borrower borrower;
    private Book book;

    @Before
    public void before(){
        borrower = new Borrower("Steve Nash", "Feb");
        book = new Book("Harry Potter", "JK", "Fantasy");
    }
    @Test
    public void hasName(){
        assertEquals("Steve Nash", borrower.getName());
    }
    @Test
    public void canAddBook(){
        borrower.addBook(book);
        assertEquals(1, borrower.countBook());
    }
}
