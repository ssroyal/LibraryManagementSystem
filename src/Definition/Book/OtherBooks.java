package Definition.Book;

public class OtherBooks extends Book {
    private String bookType;
    private String language;

    public OtherBooks(String name, String author, int noOfCopies, int bookId, String bookType, String language) {
        super(name, author, noOfCopies, bookId);
        this.bookType = bookType;
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public String getBookType() {
        return bookType;
    }

    @Override
    public String toString() {
        return "[Book Type -:" + this.getBookType() + super.toString() + " Language:- " + this.getLanguage() + "]\n";
    }
}
