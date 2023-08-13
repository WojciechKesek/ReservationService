package com.example.springwebtask13.service;

import com.example.springwebtask13.model.Reservation;
import com.example.springwebtask13.repository.ReservationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ReservationService {
    private final ReservationRepository repository;

    public String addReservation(Reservation reservation){
        repository.save(reservation);
        return "Reservation added succesfully";
    }

    public String updateReservation(Long id, Reservation reservation){
        Reservation existingReservation = repository.findById(id).orElseThrow(() -> new RuntimeException("Cant find reservation"));
        existingReservation.setName(reservation.getName());
        existingReservation.setHotelName(reservation.getHotelName());
        existingReservation.setNumberOfPeople(reservation.getNumberOfPeople());
        existingReservation.setStandard(reservation.getStandard());
        existingReservation.setPrice(reservation.getPrice());
        existingReservation.setStartDate(reservation.getStartDate());
        existingReservation.setEndDate(reservation.getEndDate());
        repository.save(existingReservation);
        return "Reseravation updated succesfully";
    }

    public List<Reservation> getReservations(){
        return repository.findAll();
    }
    public List<Reservation> getReservationByName(String name){
        return repository.findAllByName(name);
    }

    public String deleteReservation(Long id){
        repository.deleteById(id);
        return "Reservation deleted succesfully";
    }

    public List<Reservation> getReservationOnDate(LocalDate date){
        return repository.findAllByEndDateGreaterThanEqualAndStartDateGreaterThanEqual(date,date);
    }
}
