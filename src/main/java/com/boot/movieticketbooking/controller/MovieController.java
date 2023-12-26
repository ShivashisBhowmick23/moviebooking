package com.boot.movieticketbooking.controller;

import com.boot.movieticketbooking.entity.Movie;
import com.boot.movieticketbooking.service.MovieService;
import com.boot.movieticketbooking.urls.URLConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(URLConstants.MOVIE_REST_URL)
public class MovieController {
@Autowired
    MovieService movieService;
    @PostMapping(URLConstants.MOVIE_ADD_MOVIE)
    public ResponseEntity<Movie> saveMovie(@RequestBody  Movie movie){
        Movie newMovie = movieService.createMovie(movie);
        return new ResponseEntity<>(newMovie, HttpStatus.OK);
    }
}
