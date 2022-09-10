package com.example.exercise2.hotelRooms.command.room;

import com.example.exercise2.hotelRooms.command.person.PersonDto;
import com.example.exercise2.hotelRooms.command.person.PersonDtoModel;
import com.example.exercise2.hotelRooms.model.Person;
import com.example.exercise2.hotelRooms.model.Room;
import lombok.Builder;
import lombok.Data;

import javax.persistence.OneToMany;
import java.util.List;


public class RoomDtoConverter {

    public static RoomDto convertToDto (RoomDtoModel room) {
        return RoomDto.builder()
                .roomNumber(room.getRoomNumber())
                .hotelName(room.getHotelName())
                .guests(room.getGuests())
                .build();
    }

    public static Room convertToRoomModel (RoomDtoModel room) {
        return Room.builder()
                .roomNumber(room.getRoomNumber())
                .hotelName(room.getHotelName())
                .guests(room.getGuests())
                .build();
    }


}
