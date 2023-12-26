package com.boot.movieticketbooking.dto;

import com.boot.movieticketbooking.entity.Booking;
import com.boot.movieticketbooking.entity.Movie;
import com.boot.movieticketbooking.entity.User;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
@Data
@Component
public class BookingDto {
        private int booking_id;
        private User user;
        private Movie movie;
        private LocalDateTime bookingTime;


        public BookingDto(int booking_id, User user, Movie movie, LocalDateTime bookingTime) {
                this.booking_id = booking_id;
                this.user = user;
                this.movie = movie;
                this.bookingTime = bookingTime;
        }

        public BookingDto() {
        }

        public int getBooking_id() {
                return booking_id;
        }

        public void setBooking_id(int booking_id) {
                this.booking_id = booking_id;
        }

        public User getUser() {
                return user;
        }

        public void setUser(User user) {
                this.user = user;
        }

        public Movie getMovie() {
                return movie;
        }

        public void setMovie(Movie movie) {
                this.movie = movie;
        }

        public LocalDateTime getBookingTime() {
                return bookingTime;
        }

        public void setBookingTime(LocalDateTime bookingTime) {
                this.bookingTime = bookingTime;
        }

        private BookingDto mapToBookingDTO(Booking booking) {
                BookingDto bookingDto = new BookingDto();
                bookingDto.setBooking_id(booking.getBooking_id());
                bookingDto.setMovie(booking.getMovie());
                bookingDto.setUser(booking.getUser());
                bookingDto.setBookingTime(booking.getBookingTime());
                return bookingDto;
        }

}




