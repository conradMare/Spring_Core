package dev.farhan.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MovieService {

    @Autowired // To instantiate the class for us
    private MovieRepository movieRepository;

    public  List<Movie> allMovies() {
        return movieRepository.findAll();
    }
}
