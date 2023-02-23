package com.codeclan.example.WhiskyTracker.controllers;

import com.codeclan.example.WhiskyTracker.models.Whisky;
import com.codeclan.example.WhiskyTracker.repositories.DistilleryRepository;
import com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class WhiskyController {

    @Autowired
    WhiskyRepository whiskyRepository;

    @Autowired
    DistilleryRepository distilleryRepository;

    @GetMapping(value = "/whiskies")
    public ResponseEntity<List<Whisky>> getAllWhiskies(
            @RequestParam Optional<Integer> whiskyYear,
            @RequestParam Optional<String> distilleryName,
            @RequestParam Optional<String> whiskyRegion,
            @RequestParam Optional<Integer> whiskyAge) {
        if (whiskyYear.isPresent()) {
            return new ResponseEntity<>(whiskyRepository.findByYear(whiskyYear.get()), HttpStatus.OK);
        }
        if (distilleryName.isPresent() && whiskyAge.isPresent()){
            return new ResponseEntity<>(whiskyRepository.findByDistilleryNameAndAge(distilleryName.get(), whiskyAge.get()), HttpStatus.OK);
        }
        else if (whiskyRegion.isPresent()) {
            return new ResponseEntity<>(whiskyRepository.findByDistilleryRegion(whiskyRegion.get()), HttpStatus.OK);
        }
        return new ResponseEntity<>(whiskyRepository.findAll(), HttpStatus.OK);
    }


}
