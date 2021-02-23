package trainbookings;

public interface Coach {
    void book(String berth, int numberOfSeats);
    void cancel(String berth, int numberOfSeats);
    void getAvailableSeats();
}
