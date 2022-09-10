package com.example.exercise2.hotelRooms.controller;

import com.example.exercise2.hotelRooms.command.person.PersonDto;
import com.example.exercise2.hotelRooms.command.room.RoomDto;
import com.example.exercise2.hotelRooms.command.room.RoomDtoModel;
import com.example.exercise2.hotelRooms.service.RoomService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/room")
public class RoomController {

    private final RoomService roomService;

    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    @GetMapping // get all rooms
    public ResponseEntity<List<RoomDto>> getAllRooms () {
        List<RoomDto> roomList = roomService.getAllRooms();
        return roomList.isEmpty() ? new ResponseEntity<>(HttpStatus.NO_CONTENT) :
                new ResponseEntity<>(roomList, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<RoomDto> createRoom(@Valid @RequestBody RoomDtoModel roomDtoModel, BindingResult result) {
        if (roomService.getAllRooms().stream()
                .map(RoomDto::getRoomNumber)
                .toList()
                .contains(roomDtoModel.getRoomNumber())) {
            return new ResponseEntity<>(HttpStatus.ALREADY_REPORTED);
        }
        if (result.hasErrors()) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(roomService.createRoom(roomDtoModel), HttpStatus.CREATED);
    }
}
