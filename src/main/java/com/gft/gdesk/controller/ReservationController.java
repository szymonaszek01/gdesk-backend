package com.gft.gdesk.controller;

import com.gft.gdesk.dto.Desk;
import com.gft.gdesk.dto.Reservation;
import com.gft.gdesk.service.ReservationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api/v1/reservation")
@RestController
public class ReservationController {

    private ReservationService reservationsService;

    public ReservationController(ReservationService reservationsService) {
        this.reservationsService = reservationsService;
    }

    @GetMapping("/all-reservations")
    public List<Reservation> getReservations() {
        return reservationsService.getAllReservations();
    }

    @GetMapping("/free-desks")
    public List<Desk> getFreeDesks() {
        return reservationsService.getFreeDesks();
    }

}
