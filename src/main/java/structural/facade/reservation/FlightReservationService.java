package structural.facade.reservation;

import java.time.LocalDate;

public interface FlightReservationService {
    void bookFlight(String airline, String flightNumber, LocalDate departureDate, LocalDate returnDate, int numberOfPassengers);
}
