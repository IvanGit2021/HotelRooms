package com.example.exercise2.hotelRooms.command.person;

import com.example.exercise2.hotelRooms.model.Room;
import lombok.Builder;
import lombok.Data;

import javax.persistence.ManyToOne;

@Builder
@Data
public class PersonDtoModel {

    private Integer id;
    private String name;
    private Integer age;
    private String city;
    private Room room;
}
