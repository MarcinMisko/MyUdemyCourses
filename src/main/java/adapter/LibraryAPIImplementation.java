package adapter;

import java.time.LocalDate;

public class LibraryAPIImplementation implements LibraryAPI {


    public boolean isAviable(String bookTitle) {
        System.out.println("Sprawdzam dostepnosc " + bookTitle);
        return true;
    }

    public LocalDate dueDate(String bookTitle, String pesel) {
        System.out.println("Sprawdzam date zwrotu dla " + bookTitle);
        return LocalDate.now();
    }

    public boolean reserve(String bookTitle, String pesel) {
        System.out.println("Rezerwuje " + bookTitle);
        return true;
    }
}
