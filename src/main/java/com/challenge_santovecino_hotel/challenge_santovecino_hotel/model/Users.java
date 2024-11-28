package com.challenge_santovecino_hotel.challenge_santovecino_hotel.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "users")
@Getter
@Setter
public class Users {

    @Id
    @Column(name = "cc", nullable = false, length = 20)
    private String cc;

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "phone", nullable = false , length = 20)
    private Long phone;

    public Users() {
    }

    public Users(String cc, String name, String email, Long phone) {
        this.cc = cc;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }
}
