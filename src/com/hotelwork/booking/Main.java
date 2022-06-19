package com.hotelwork.booking;

import com.hotelwork.booking.bookingService.BookingService;
import com.hotelwork.booking.entity.Bill;
import com.hotelwork.booking.entity.Client;
import com.hotelwork.booking.entity.Hotel;
import com.hotelwork.booking.entity.Room;

public class Main {
    public static void main(String[] args) {
        Bill kutuBill = new Bill(10000);
        Client kutiClient = new Client("Kutubek","124134"
                ,"kutubek@gamil.com","Gaparov",kutuBill);

        Bill azaBill = new Bill(20000);
        Client azaClient = new Client("Azamat","12331123",
                "aza@gmail.com","Muratov",azaBill);

        Room[] californiaHotelRooms = new Room[]{new Room(2,2400,true),
                new Room(1,1400,true),new Room(3,3400,true)};

        Hotel californiaHotel = new Hotel("California",californiaHotelRooms);

        Room[] sanFranciscoHotelRooms = new Room[]{new Room(1,1200,true),
                new Room(2,2200,true),new Room(3,3000,true)};
        Hotel sanFranciscoHotel = new Hotel("SanFrancisco",sanFranciscoHotelRooms);

        BookingService bookingService = new BookingService();
        bookingService.book(californiaHotel,kutiClient,1);
        System.out.println("\n");
        bookingService.book(sanFranciscoHotel,azaClient,4);
    }
}
