
public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Book<String> book1 = new Book<>("The Great Gatsby");
        Book<String> book2 = new Book<>("1984");

        library.addBook(book1);
        library.addBook(book2);

        library.printInfo();
    }
}


