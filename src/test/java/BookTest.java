import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {
    private Book book;

    @Before
    public void before(){
        book = new Book ("Harry Potter", "JK", "Fantasy");
    }
    @Test
    public void hasTitle(){
        assertEquals("Harry Potter", book.getTitle());
    }  @Test
    public void hasAuthor(){
        assertEquals("JK", book.getAuthor());
    }  @Test
    public void hasGenre(){
        assertEquals("Fantasy", book.getGenre());
    }


}
