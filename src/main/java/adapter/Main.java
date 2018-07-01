package adapter;

public class Main {
    public static void main(String[] args) {
        User user = new User("Paweł", "Cwik", "32131212");

        LibraryAPIv2 libraryAPIv2 = new LibraryAPIv2Implementation();

        APIAdapter apiAdapter = new APIAdapter(user, libraryAPIv2);

        BookConnector connector = new BookConnector(user, apiAdapter);

        connector.checkAviability("Harry Potter i Zakon Feniksa");
    }
}
