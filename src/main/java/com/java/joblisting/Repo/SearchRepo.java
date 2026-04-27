package com.java.joblisting.Repo;

import com.java.joblisting.Models.Post;

import java.util.List;

public interface SearchRepo {

     List<Post> findByText(String text);
}
