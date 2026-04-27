package com.java.joblisting.Repo;

import com.java.joblisting.Models.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepo extends MongoRepository<Post,String> {

}
