package facade.reservation;

import java.time.LocalDate;

public class ReservationServiceFacadeImpl implements ReservationServiceFacade {
    private HotelReservationService hotelService;
    private FlightReservationService flightService;

    public ReservationServiceFacadeImpl(HotelReservationService hotelService, FlightReservationService flightService) {
        this.hotelService = hotelService;
        this.flightService = flightService;
    }

    @Override
    public void bookHotel(String hotelName, LocalDate checkInDate, LocalDate checkOutDate, int numberOfGuests) {
        hotelService.bookHotel(hotelName, checkInDate, checkOutDate, numberOfGuests);
    }

    @Override
    public void bookFlight(String airline, String flightNumber, LocalDate departureDate, LocalDate returnDate, int numberOfPassengers) {
        flightService.bookFlight(airline, flightNumber, departureDate, returnDate, numberOfPassengers);
    }
}
