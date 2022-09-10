package com.example.exercise2.hotelRooms.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@Builder
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Integer roomNumber;
    private String hotelName;
    private Integer capacity;
    @OneToMany(mappedBy = "room")
    private List<Person> guests;

    public Room() {
    }
}
