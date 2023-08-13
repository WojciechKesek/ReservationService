package com.example.springwebtask13.repository;

import com.example.springwebtask13.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {
    List<Reservation> findAllByName(String name);
    List<Reservation> findAllByStandardAndPrice(String standard, double price);

    List<Reservation> findAllByEndDateGreaterThanEqualAndStartDateGreaterThanEqual(LocalDate start, LocalDate end);
}
