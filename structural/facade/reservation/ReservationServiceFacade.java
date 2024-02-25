package facade.reservation;


import java.time.LocalDate;

public interface ReservationServiceFacade {
    void bookHotel(String hotelName, LocalDate checkInDate, LocalDate checkOutDate, int numberOfGuests);
    void bookFlight(String airline, String flightNumber, LocalDate departureDate, LocalDate returnDate, int numberOfPassengers);
}
