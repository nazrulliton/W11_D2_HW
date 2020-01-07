import java.util.ArrayList;

public class Borrower {
    private String name;
    private ArrayList<Book> titleBorrowed;
    private String returnMonth;

    public Borrower( String name, String returnDate){
        this.name = name;
        this.returnMonth = returnMonth;
        this.titleBorrowed = new ArrayList<Book>();
    }

    public String getName() {
        return this.name;
    }
    public int countBook(){
        return this.titleBorrowed.size();
    }

    public void addBook(Book book) {
    titleBorrowed.add(book);
    }
}
