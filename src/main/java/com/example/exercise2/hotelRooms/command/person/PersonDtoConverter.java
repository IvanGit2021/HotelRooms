package com.example.exercise2.hotelRooms.command.person;

import com.example.exercise2.hotelRooms.model.Person;

public class PersonDtoConverter {

    public static PersonDto convertToDto (Person person) {
        return PersonDto.builder()
                .name(person.getName())
                .age(person.getAge())
                .city(person.getCity())
                .build();
    }

    public static Person convertToPersonModel (PersonDtoModel person) {
        return Person.builder()
                .name(person.getName())
                .age(person.getAge())
                .city(person.getCity())
                .room(person.getRoom())
                .build();
    }
}
