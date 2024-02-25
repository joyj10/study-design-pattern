package facade.reservation;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // 예약 서비스 퍼사드 생성
        HotelReservationService hotelService = new HotelReservationServiceImpl();
        FlightReservationService flightService = new FlightReservationServiceImpl();
        ReservationServiceFacade facade = new ReservationServiceFacadeImpl(hotelService, flightService);

        // 호텔 예약
        facade.bookHotel("Hotel Seoul", LocalDate.now(), LocalDate.now().plusDays(3), 2);

        // 항공편 예약
        facade.bookFlight("Airline Korea", "BT001", LocalDate.now(), LocalDate.now().plusDays(5), 2);
    }
}
