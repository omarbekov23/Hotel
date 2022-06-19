package com.hotelwork.booking.bookingService;

import com.hotelwork.booking.entity.Bill;
import com.hotelwork.booking.entity.Client;
import com.hotelwork.booking.entity.Hotel;
import com.hotelwork.booking.entity.Room;

public class BookingService {

    public void book(Hotel hotel, Client client, int numberOfPerson) {
        Room[] rooms = hotel.getRooms();
        boolean isFreeRooms = false;
        for (Room r : rooms) {
            if (r.isFree()) {
                isFreeRooms = true;
            }

            if (!isFreeRooms) {
                System.out.println("Свободных номеров в отеле: " + hotel.getName() + " нет.");
            }

        }
        bookRoom(client, numberOfPerson, rooms);
    }

    private void bookRoom(Client client, int numberOfPerson, Room[] rooms) {
        boolean success = false;
        String surName = client.getSurName();
        String clientName = client.getName();
        for (Room room : rooms) {
            if (room.getNumberOfPerson() == numberOfPerson) {
                success = true;
                System.out.println("Нашелся номер для клиента: " + clientName + " " + surName);
                if (client.getBill().getAmount() >= room.getCost()) {
                    Bill clientBill = client.getBill();
                    clientBill.setAmount(clientBill.getAmount() - room.getCost());
                    room.setFree(false);
                    System.out.println("Номер был успешно забронирован клиентом: " + clientName +
                            " " + surName);
                } else {
                    System.out.println("Не достаточно средств для бронирования номера, клиент: " + clientName
                            + " " + surName);
                }
            }
        }
        if (!success){
            System.out.println("Не нашлось подходящего номера для клиента: "+clientName
            + " "+ surName);
        }
    }
}
