package com.boot.movieticketbooking.controller;

import com.boot.movieticketbooking.dto.BookingDto;
import com.boot.movieticketbooking.entity.Booking;
import com.boot.movieticketbooking.service.BookingService;
import com.boot.movieticketbooking.urls.URLConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(URLConstants.BOOKING_REST_URL)
public class BookingController {
    @Autowired
    BookingService bookingService;

    private BookingDto mapToBookingDTO(Booking booking) {
        BookingDto bookingDto = new BookingDto();
        bookingDto.setBooking_id(booking.getBooking_id());
        bookingDto.setMovie_name(booking.getMovie().getMovie_name());
        bookingDto.setMovie_timings(booking.getMovie().getMovie_timings());
        bookingDto.setUser_email(booking.getUser().getUser_email());
        bookingDto.setUser_name(booking.getUser().getUser_name());
        bookingDto.setBookingTime(booking.getBookingTime());
        return bookingDto;
    }

    @PostMapping(URLConstants.BOOKING_ADD_BOOKING)
    public BookingDto saveMovie(@RequestBody Booking booking) {
        Booking newBooking = bookingService.createBooking(booking);
        BookingDto newBookingDto = mapToBookingDTO(newBooking);
        return newBookingDto;

    }
}