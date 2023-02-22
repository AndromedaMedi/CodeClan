package com.codeclan.example.files_and_folders.controllers;

import com.codeclan.example.files_and_folders.models.Person;
import com.codeclan.example.files_and_folders.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {

    @Autowired
    PersonRepository personRepo;

    @GetMapping("/people")
    public ResponseEntity<List<Person>> getAllPeople() {
        return new ResponseEntity<>(personRepo.findAll(), HttpStatus.OK);
    }

    @GetMapping("/people/{id}")
    public ResponseEntity getAPerson(@PathVariable Long id) {
        return new ResponseEntity(personRepo.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/people")
    public ResponseEntity<Person> createFile(@RequestBody Person person) {
        personRepo.save(person);
        return new ResponseEntity<>(person, HttpStatus.CREATED);
    }
}
