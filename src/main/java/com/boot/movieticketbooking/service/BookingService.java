package com.boot.movieticketbooking.service;

import com.boot.movieticketbooking.dto.BookingDto;
import com.boot.movieticketbooking.entity.Booking;
import com.boot.movieticketbooking.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class BookingService {
    @Autowired
    BookingRepository bookingRepository;



    public Booking createBooking(Booking booking) {
        booking.setBookingTime(LocalDateTime.now());
        return bookingRepository.save(booking);
    }

    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }

    public Booking getBookingById(int id) {

        return bookingRepository.findById(id).orElse(null);
    }
}
