import org.junit.Before;

public class LibraryTest {
    private Library library;
    private Book book;
    private Book book1;

    @Before
    public void before(){
        library = new Library();
        book = new Book("Harry P", "JK", "Fantasy");
        book1 = new Book("Jack Ryan", "Lee Child", "Factual");
    }
}
