package com.example.exercise2.hotelRooms.service;

import com.example.exercise2.hotelRooms.command.person.PersonDto;
import com.example.exercise2.hotelRooms.command.person.PersonDtoConverter;
import com.example.exercise2.hotelRooms.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class PersonService {

    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public List<PersonDto> getAllPerson() {
        return personRepository.findAll()
                .stream()
                .map(PersonDtoConverter::convertToDto)
                .collect(Collectors.toList());
    }
}
