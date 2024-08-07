package Lab_3.BookAPI;

public interface Readable {
    void read();

    void nextPage();

    void previousPage();

    default void readingStarted() {
        System.out.println("Reading started");
    }

    default void readingFinished() {
        System.out.println("Reading finished");
    }

}
