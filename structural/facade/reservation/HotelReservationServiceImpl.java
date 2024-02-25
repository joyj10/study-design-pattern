package facade.reservation;

import java.time.LocalDate;

public class HotelReservationServiceImpl implements HotelReservationService {
    @Override
    public void bookHotel(String hotelName, LocalDate checkInDate, LocalDate checkOutDate, int numberOfGuests) {
        // 호텔 예약 로직 구현
        System.out.println("Booked hotel = " + hotelName + " for " + numberOfGuests + " guests from "
                + checkInDate + " to " + checkOutDate);
    }
}
