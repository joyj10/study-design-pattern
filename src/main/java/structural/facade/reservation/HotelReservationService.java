package structural.facade.reservation;

import java.time.LocalDate;

public interface HotelReservationService {
    void bookHotel(String hotelName, LocalDate checkInDate, LocalDate checkOutDate, int numberOfGuests);
}
