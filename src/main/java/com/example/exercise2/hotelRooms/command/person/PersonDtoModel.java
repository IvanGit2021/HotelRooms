package com.example.exercise2.hotelRooms.command.person;

import com.example.exercise2.hotelRooms.model.Room;
import lombok.Builder;
import lombok.Data;

import javax.persistence.ManyToOne;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Builder
@Data
public class PersonDtoModel {


    private Integer id;
    @NotBlank(message = "Name is mandatory")
    private String name;
    @NotBlank(message = "Age is mandatory")
    @Min(value = 0, message = "Age must be bigger than 0")
    private Integer age;
    @NotBlank(message = "City is mandatory")
    private String city;
    private Room room;
}
