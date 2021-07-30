package com.mohsinkd786.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RequestMapping("/home")
@RestController
public class HomeResource {

    @GetMapping
    public ResponseEntity<String> message(){
        return ResponseEntity.ok("Spring Jenkins ");
    }

    @GetMapping("/greetings")
    public ResponseEntity<List<String>> messages(){
        return ResponseEntity.ok(Arrays.asList("Hello","Hola","Hi"));
    }
}
