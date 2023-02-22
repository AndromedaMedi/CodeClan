package com.codeclan.example.files_and_folders.controllers;

import com.codeclan.example.files_and_folders.models.File;
import com.codeclan.example.files_and_folders.models.Person;
import com.codeclan.example.files_and_folders.repositories.FileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class FileController {

    @Autowired
    FileRepository fileRepo;


    @GetMapping(value = "/files")
    public ResponseEntity<List<File>> getAllFiles() {
        List<File> foundFiles = fileRepo.findAll();
        return new ResponseEntity<>(foundFiles, HttpStatus.OK);
    }

    @GetMapping(value = "/files/{id}")
    public ResponseEntity getAFile(@PathVariable Long id) {
        Optional<File> foundFile = fileRepo.findById(id);
        return new ResponseEntity(foundFile, HttpStatus.OK);
    }

    @PostMapping(value = "/files")
    public ResponseEntity<File> createFile(@RequestBody File file) {
        fileRepo.save(file);
        return new ResponseEntity<>(file, HttpStatus.CREATED);
    }
}
