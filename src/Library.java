import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<LibraryCard<Integer, Book<?>>> cards = new ArrayList<>();

    public void addBook(Book<?> book) {
        int cardNumber = cards.size() + 1;
        LibraryCard<Integer, Book<?>> card = new LibraryCard<>(cardNumber, book);
        cards.add(card);
    }

    public void printInfo() {
        for (LibraryCard<Integer, Book<?>> card : cards) {
            System.out.println(card);
        }
    }
}
