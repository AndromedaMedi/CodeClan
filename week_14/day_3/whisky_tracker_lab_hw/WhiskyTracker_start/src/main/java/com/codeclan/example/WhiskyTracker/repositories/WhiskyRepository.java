package com.codeclan.example.WhiskyTracker.repositories;

import com.codeclan.example.WhiskyTracker.models.Distillery;
import com.codeclan.example.WhiskyTracker.models.Whisky;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WhiskyRepository extends JpaRepository<Whisky, Long> {

    List<Whisky> findByYear(int year);

    List<Whisky> findByDistillery(Distillery distillery);

    List<Whisky> findByDistilleryNameAndAge(String name, int age);
//    Or
//    List<Whisky> findByDistilleryIdAndAge(Long distIdl, int age);
//    Or  (not preferable)
//    List<Whisky> findByDistilleryAndAge(Distillery dist, int age);

    List<Whisky> findByDistilleryRegion(String region);
}
