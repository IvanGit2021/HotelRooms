package com.example.exercise2.hotelRooms.repository;

import com.example.exercise2.hotelRooms.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room, Integer> {
}
