package com.java.joblisting.Controller;


import com.java.joblisting.Models.Post;
import com.java.joblisting.Repo.PostRepo;
import com.java.joblisting.Repo.SearchRepo;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

import static java.awt.SystemColor.text;

@RestController
public class PostController {

    @Autowired
    PostRepo repo;

    @Autowired
    SearchRepo srepo;

    @RequestMapping(value = "/")
    public void redirect(HttpServletResponse response) throws IOException {
        response.sendRedirect("/swagger-ui/index.html");
    }

    @GetMapping("/posts")
    public List<Post> getAllPosts() {
        return repo.findAll();
    }

    @PostMapping("/post")
    public  Post addPost(@RequestBody Post post){
       return  repo.save(post);
    }

    @GetMapping("/posts/{text}")
    public List<Post> search(@PathVariable  String text){
        return  srepo.findByText(text);
    }

}
