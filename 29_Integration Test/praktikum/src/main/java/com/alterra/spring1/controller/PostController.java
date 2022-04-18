package com.alterra.spring1.controller;

import com.alterra.spring1.entity.Posts;
import com.alterra.spring1.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/posts")
public class PostController {
    @Autowired
    private PostRepository postRepository;

    @GetMapping
    public ResponseEntity<MbaseResponse<List<Posts>>> getAllPosts(){
        MbaseResponse mbaseResponse = new MbaseResponse();
        mbaseResponse.setSuccess(true);
        mbaseResponse.setMessage("Berhasil");
        mbaseResponse.setData(postRepository.findAll());
        return new ResponseEntity<>(mbaseResponse, HttpStatus.BAD_REQUEST);
    }

    @GetMapping("{id}")
    public MbaseResponse<List<Posts>> getPostById(@PathVariable Long id){
        MbaseResponse mbaseResponse = new MbaseResponse();
        mbaseResponse.setSuccess(true);
        mbaseResponse.setMessage("Berhasil");
        mbaseResponse.setData(postRepository.findById(id));
        return mbaseResponse;
    }

    @PostMapping
    public MbaseResponse<List<Posts>> createPost(@RequestBody Posts payload){
        MbaseResponse mbaseResponse = new MbaseResponse();
        mbaseResponse.setSuccess(true);
        mbaseResponse.setMessage("Berhasil");
        mbaseResponse.setData(postRepository.save(payload));
        return mbaseResponse;
    }

    @PutMapping("{id}")
    public MbaseResponse<List<Optional<Posts>>> updatePost(@PathVariable Long id, @RequestBody Posts post){
        MbaseResponse mbaseResponse = new MbaseResponse();
        mbaseResponse.setSuccess(true);
        mbaseResponse.setMessage("Berhasil");
        Optional<Posts> postById = postRepository.findById(id);
        postById.ifPresent(res ->{
            res.setName(post.getName());
            res.setDescription(post.getDescription());

            mbaseResponse.setData(postRepository.save(res));
        });
        return mbaseResponse;
    }

    //delete, pake void. karena tidak ada yang di return
    @DeleteMapping("{id}")
    public void deletePost(@PathVariable Long id){
        Optional<Posts> postById = postRepository.findById(id);
        postById.ifPresent(res ->{
            postRepository.delete(res);
        });
    }
}
