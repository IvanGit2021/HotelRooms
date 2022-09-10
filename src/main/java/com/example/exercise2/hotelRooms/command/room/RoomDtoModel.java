package com.example.exercise2.hotelRooms.command.room;

import com.example.exercise2.hotelRooms.model.Person;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Builder
@Data
public class RoomDtoModel {

    @NotBlank(message = "Room number is mandatory")
    @Min(value = 0, message = "Room Number must be bigger than 0")
    private Integer roomNumber;
    @NotBlank(message = "Room must have a hotel name")
    private String hotelName;
    private List<Person> guests;
}