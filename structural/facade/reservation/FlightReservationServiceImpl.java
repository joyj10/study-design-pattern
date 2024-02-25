package facade.reservation;

import java.time.LocalDate;

public class FlightReservationServiceImpl implements FlightReservationService {
    @Override
    public void bookFlight(String airline, String flightNumber, LocalDate departureDate, LocalDate returnDate, int numberOfPassengers) {
        // 항공편 예약 로직 구현
        System.out.println("Booked flight = " + airline + " " + flightNumber + " for " + numberOfPassengers + " passengers on "
                + departureDate + " and return on " + returnDate);
    }
}
