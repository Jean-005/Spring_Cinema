package com.example.Spring_Cinema.services;

import com.example.Spring_Cinema.models.Movie;
import com.example.Spring_Cinema.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    MovieRepository movieRepository;

    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    public Movie getMovieById(long id) {
        return movieRepository.findById(id).get();
    }

    public Movie addNewMovie(Movie movie) {
        movieRepository.save(movie);
        return movie;
    }

    public Movie updateMovie(Movie movie) {
        movieRepository.save(movie);
        return movie;
    }

    public void deleteMovie(Long id) {
        movieRepository.deleteById(id);
    }


}
