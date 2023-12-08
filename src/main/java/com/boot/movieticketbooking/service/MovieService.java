package com.boot.movieticketbooking.service;

import com.boot.movieticketbooking.entity.Movie;
import com.boot.movieticketbooking.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MovieService {
        @Autowired
        private MovieRepository movieRepository;

        public List<Movie> getAllMovies() {
            return movieRepository.findAll();
        }

        public Movie getMovieById(int id) {
            return movieRepository.findById(id).orElse(null);
        }

        public Movie createMovie(Movie movie) {
            return movieRepository.save(movie);
        }
}
