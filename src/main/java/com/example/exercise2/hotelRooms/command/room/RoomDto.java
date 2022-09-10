package com.example.exercise2.hotelRooms.command.room;

import com.example.exercise2.hotelRooms.model.Person;
import lombok.Builder;
import lombok.Data;

import javax.persistence.OneToMany;
import java.util.List;

@Builder
@Data
public class RoomDto {

    private Integer roomNumber;
    private String hotelName;
    private Integer capacity;
    private List<Person> guests;
}
