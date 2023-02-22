package com.example.codeclan.pirateservice;

import com.example.codeclan.pirateservice.models.Pirate;
import com.example.codeclan.pirateservice.models.Raid;
import com.example.codeclan.pirateservice.models.Ship;
import com.example.codeclan.pirateservice.repository.PirateRepository;
import com.example.codeclan.pirateservice.repository.RaidRepository;
import com.example.codeclan.pirateservice.repository.ShipRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@ActiveProfiles("test") //Indicates it's a test profile so will not run DataLoader
@SpringBootTest
public class PirateserviceApplicationTests {

	@Autowired
	PirateRepository pirateRepository;

	@Autowired
	ShipRepository shipRepository;

	@Autowired
	RaidRepository raidRepository;

	@Test
	public void contextLoads() {
	}

	@Ignore
	@Test
	public void createPirateAndShipThenSave(){

		Ship dutchman = new Ship("The Flying Dutchman");
		shipRepository.save(dutchman);
		Pirate jack = new Pirate("jack", "sparrow", 32, dutchman);
		pirateRepository.save(jack);
	}

	@Ignore
	@Test
	public void createPirateAndRaidThenSave(){
		Ship pineapple = new Ship("The Flying Pineapple");
		shipRepository.save(pineapple);
		Pirate spongeBob = new Pirate("SpongeBob", "SquarePants", 8, pineapple);
		pirateRepository.save(spongeBob);

		Raid raid = new Raid("Tortuga", 100);
		raidRepository.save(raid);

		spongeBob.addRaid(raid);
		raid.addPirate(spongeBob);
		raidRepository.save(raid);

	}

	@Test
	public void canFindPiratesOver30() {
		List<Pirate> foundPirates = pirateRepository.findByAgeGreaterThan(30);
		assertTrue(foundPirates.size() > 0);
		assertEquals(7, foundPirates.size());
	}

	@Test
	public void canFindPirateByFirstName() {
		List<Pirate> foundPirate = pirateRepository.findByFirstName("Horatio");
		assertEquals(1, foundPirate.size());
	}

	@Test
	public void canFindRaidByLocation() {
		List<Raid> foundRaid = raidRepository.findByLocation("Tortuga");
		assertTrue(foundRaid.size() > 0);
		assertEquals(1, foundRaid.size());
		assertEquals("Tortuga", foundRaid.get(0).getLocation());
	}

	@Test
	public void canCountPiratesOver30() {
		long countOfPirates = pirateRepository.countByAgeGreaterThan(30);
		assertEquals(7, countOfPirates);
	}

	@Test
	public void canFindPiratesByRaidId() {
		List<Pirate> foundPirates = pirateRepository.findByRaidsId(2L);
		assertEquals(2, foundPirates.size());

	}

	@Test
	public void canFindShipsByPirateFirstName() {
		List<Ship> foundShips = shipRepository.findByPiratesFirstName("Henry");
		assertEquals(1, foundShips.size());
		assertEquals("Fancy", foundShips.get(0).getName());
		assertEquals(Long.valueOf(7), foundShips.get(0).getId());
	}

	@Test
	public void canFindRaidsByPirateShipName() {
		List<Raid> foundRaids = raidRepository.findByPiratesShipName("Fancy");
		assertEquals(1, foundRaids.size());
	}

	@Test
	public void canFindRaidsByPirateShip() {
		Ship ship = shipRepository.getById(7L);
		List<Raid> raids = raidRepository.findByPiratesShip(ship);
		assertEquals(1, raids.size());
		assertEquals("Port Royal", raids.get(0).getLocation());
	}

}