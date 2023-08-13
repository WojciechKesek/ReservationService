package com.example.springwebtask13.dto;

import com.example.springwebtask13.model.Reservation;
import lombok.Data;

import java.time.LocalDate;

@Data
public class ReservationDto {
    private String name;
    private String hotelName;
    private int numberOfPeople;
    private String standard;
    private double price;
    private LocalDate startDate;
    private LocalDate endDate;

    public ReservationDto(Reservation reservation) {
        this.name = reservation.getName();
        this.hotelName = reservation.getHotelName();
        this.numberOfPeople = reservation.getNumberOfPeople();
        this.standard = reservation.getStandard();
        this.price = reservation.getPrice();
        this.startDate = reservation.getStartDate();
        this.endDate = reservation.getEndDate();
    }
}
