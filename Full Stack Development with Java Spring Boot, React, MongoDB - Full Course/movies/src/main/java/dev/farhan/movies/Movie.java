package dev.farhan.movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection = "movies")
@Data // Instead of writing Getters, Setters and toString methods
@AllArgsConstructor // Takes all the private fields as arguments and creates a constructor
@NoArgsConstructor // Constructor that takes no parameters
public class Movie {
    @Id // Unique identifier for each movie in the database
    private ObjectId id;

    private String imdbId;

    private String title;

    private String releaseDate;

    private String trailerLink;

    private String poster;

    private List<String> genres;

    private String backdrops;

    @DocumentReference // Will cause to store only the id's of the reviews, and the reviews will be in a separate collection
    private List<Review> reviewsIds;
}
