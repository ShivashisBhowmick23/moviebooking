package com.boot.movieticketbooking.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
@Data
@Entity(name = "booking_tbl")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int booking_id;

    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "user_id")
            private User user;
    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "movie_id")
    private Movie movie;

    private LocalDateTime bookingTime;
}
