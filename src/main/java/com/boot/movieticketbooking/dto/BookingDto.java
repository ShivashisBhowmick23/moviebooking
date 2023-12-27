package com.boot.movieticketbooking.dto;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Component
public class BookingDto {
        private int booking_id;
        private String user_name;
        private String user_email;
        private String movie_name;

        private List<String> movie_timings;
        private LocalDateTime bookingTime;

}

