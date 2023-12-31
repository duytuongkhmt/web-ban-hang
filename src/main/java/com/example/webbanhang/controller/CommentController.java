package com.example.webbanhang.controller;

import com.example.webbanhang.DTO.CommentDTO;
import com.example.webbanhang.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")
@CrossOrigin("*")
@RequiredArgsConstructor
public class CommentController {


    private final CommentService commentService;

    @PostMapping("user/comments")
    public ResponseEntity<CommentDTO>  addComment(@RequestBody CommentDTO commentDTO){
       return ResponseEntity.status(HttpStatus.CREATED).body(commentService.create(commentDTO));
    }

    @GetMapping("user/comments")
    public ResponseEntity<List<CommentDTO>>  showComment(@RequestParam Integer idProduct){
        return ResponseEntity.ok(commentService.findAllByIdProduct(idProduct)) ;
    }

    @DeleteMapping("user/comments/{id}")
    public void deleteComment(@PathVariable Integer id){
        commentService.remove(id);
    }

    @PutMapping("user/comments")
    public CommentDTO updateComment(){
        return null;
    }
}
