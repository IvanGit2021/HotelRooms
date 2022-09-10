package com.example.exercise2.hotelRooms.service;

import com.example.exercise2.hotelRooms.command.room.RoomDto;
import com.example.exercise2.hotelRooms.command.room.RoomDtoConverter;
import com.example.exercise2.hotelRooms.command.room.RoomDtoModel;
import com.example.exercise2.hotelRooms.repository.RoomRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RoomService {

    private final RoomRepository roomRepository;

    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    public List<RoomDto> getAllRooms() {
        return roomRepository.findAll().stream()
                .map(RoomDtoConverter::convertToDto)
                .collect(Collectors.toList());
    }

    public RoomDto createRoom(RoomDtoModel roomDtoModel) {
        return RoomDtoConverter
                .convertToDto(roomRepository
                        .save(RoomDtoConverter
                                .convertToRoomModel(roomDtoModel)));
    }
}
