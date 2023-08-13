package com.example.springwebtask13.controller;

import com.example.springwebtask13.model.Reservation;
import com.example.springwebtask13.service.ReservationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class ReservationController {
    private final ReservationService service;
    @PostMapping
    public String addReservation(@RequestBody Reservation reservation){
        return service.addReservation(reservation);
    }

    @PutMapping("/{id}")
    public String updateReservation(@PathVariable Long id, @RequestBody Reservation reservation){
        return service.updateReservation(id, reservation);
    }

    @GetMapping
    public List<Reservation> getReservations(){
        return service.getReservations();
    }

    @GetMapping("/{name}")
    public List<Reservation> getReservationByName(@PathVariable String name){
        return service.getReservationByName(name);
    }

    @DeleteMapping("/{id}")
    public String deleteReservation(@PathVariable Long id){
        return service.deleteReservation(id);
    }

    @GetMapping
    public List<Reservation> getReservationOnDate(@RequestParam LocalDate date){
        return service.getReservationOnDate(date);
    }
}
