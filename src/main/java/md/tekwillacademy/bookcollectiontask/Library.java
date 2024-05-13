package md.tekwillacademy.bookcollectiontask;

import java.util.ArrayList;
import java.util.List;

public class Library {

    String name;

    List<Book> bookStock;

    public Library(String name) {
        this.name = name;
        bookStock = new ArrayList<>();

    }

    public void addBook(Book formalParameterBook) {
        if (bookStock.add(formalParameterBook)) {
            System.out.println("The book has been added:" + formalParameterBook.getTitle());
        } else {
            // The code will never run because the book is always added with success,duplicates are not limited.
            System.out.println("The book has not been added:" + formalParameterBook);
        }
    }

    public int getTheNumberOfTheBooksInTheStock() {
        return bookStock.size();
    }

    public boolean containsBook(Book formalBook) {
        return bookStock.contains(formalBook);
    }

    public void prinTheBookTitles() {
        try {
            for (int i = 0; i <= bookStock.size(); i++) {
                System.out.println("The book number " + i + " title is:"
                        + bookStock.get(i).getTitle());

            }
        } catch (IndexOutOfBoundsException exception) {
            System.out.println("The number of index is not so big BRO! ");
            System.out.println(exception.getMessage());
            System.out.println("The show must go on");
        }


    }
}
