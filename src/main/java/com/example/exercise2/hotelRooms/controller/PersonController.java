package com.example.exercise2.hotelRooms.controller;

import com.example.exercise2.hotelRooms.command.person.PersonDto;
import com.example.exercise2.hotelRooms.service.PersonService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping // get all person
    public ResponseEntity<List<PersonDto>> getAllPerson () {
        List<PersonDto> personList = personService.getAllPerson();
        return personList.isEmpty() ? new ResponseEntity<>(HttpStatus.NO_CONTENT) :
                new ResponseEntity<>(personList, HttpStatus.OK);
    }
}
