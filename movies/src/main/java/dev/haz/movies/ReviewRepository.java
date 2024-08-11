package dev.haz.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends MongoRepository<dev.haz.movieist.movies.Review, ObjectId> {
    dev.haz.movieist.movies.Review insert(dev.haz.movieist.movies.Review review);
}
