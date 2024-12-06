package CodingTest_2;


import java.util.ArrayList;
import java.util.List;

public class Library {
    String name;
    List<Book> books = new ArrayList<>();

    public Library(String name) {
        this.name = name;
    }


    void addBook(Book book) {
        books.add(book);
        System.out.println("책 등록:" + book.title);

    }

    void displayBooks() {

    }

    void lendBook(String title) {
        for (Book book : books) {
            if (book instanceof PrintedBook) {
               ((PrintedBook) book).lend();
            }
            else if (book instanceof EBook){
                ((EBook) book).access();
        }

        }

    }
    void returnBook(String title){
            for (Book book : books){
                if (book instanceof PrintedBook) {
                    ((PrintedBook) book).returnBook();
                }
            }
    }

}
