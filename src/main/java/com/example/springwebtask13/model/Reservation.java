package com.example.springwebtask13.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Reservation {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String hotelName;
    private int numberOfPeople;
    private String standard;
    private double price;
    private LocalDate startDate;
    private LocalDate endDate;
}
