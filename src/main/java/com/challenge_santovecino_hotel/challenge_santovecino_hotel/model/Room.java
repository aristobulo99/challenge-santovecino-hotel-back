package com.challenge_santovecino_hotel.challenge_santovecino_hotel.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "room")
@Getter
@Setter
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false, length = 20)
    private String name;

    @Column(name = "description", nullable = false, length = 500)
    private String description;

    @Column(name = "state", nullable = false)
    private Boolean state;

    public Room() {
    }

    public Room(Long id, String name, String description, Boolean state) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.state = state;
    }
}
