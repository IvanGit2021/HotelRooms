package com.example.exercise2.hotelRooms.command.room;

import com.example.exercise2.hotelRooms.model.Person;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class RoomDtoModel {

    private Integer roomNumber;
    private String hotelName;
    private List<Person> guests;
}