package com.codeclan.example.WhiskyTracker;

import com.codeclan.example.WhiskyTracker.models.Distillery;
import com.codeclan.example.WhiskyTracker.models.Whisky;
import com.codeclan.example.WhiskyTracker.repositories.DistilleryRepository;
import com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import javax.jws.Oneway;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@ActiveProfiles("test") //Indicates it's a test profile so will not run DataLoader
@SpringBootTest
public class WhiskyTrackerApplicationTests {

	@Autowired
	WhiskyRepository whiskyRepository;

	@Autowired
	DistilleryRepository distilleryRepository;
	@Test
	public void contextLoads() {
	}

	@Test
	public void canGetWhiskiesForYear() {
		List<Whisky> foundWhiskies = whiskyRepository.findByYear(1995);
		assertEquals(1, foundWhiskies.size());
	}

	@Test
	public void canGetDistilleryForRegion() {
		List<Distillery> foundDistilleries = distilleryRepository.findByRegion("Highland");
		assertEquals(3, foundDistilleries.size());
	}

	@Test
	public void canGetWhiskiesForDistilleryForAge() {
		List<Whisky> foundWhiskies = whiskyRepository.findByDistilleryNameAndAge("Macallan", 25);
		assertEquals(1, foundWhiskies.size());
	}

	@Test
	public void canGetWhiskiesForRegion() {
		List<Whisky> foundWhiskies = whiskyRepository.findByDistilleryRegion("Highland");
		assertEquals(7, foundWhiskies.size());
	}

	@Test
	public void canGetDistilleriesForWhiskeyAge() {
		List<Distillery> foundWhiskies = distilleryRepository.findByWhiskiesAge(12);
		assertEquals(6, foundWhiskies.size());
	}

}
