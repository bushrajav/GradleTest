package org.example;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
class House{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private String name;

    public House(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
//https://jnaapti.com/downloads/demo.zip