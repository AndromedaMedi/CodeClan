import attractions.Attraction;
import attractions.Dodgems;
import attractions.Playground;
import attractions.Rollercoaster;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;
import stalls.HotDogStall;
import stalls.ParkingSpot;
import stalls.TobaccoStall;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;
    Rollercoaster rollercoaster;
    Dodgems dodgems;
    Playground playground;
    HotDogStall hotDogStall;
    TobaccoStall tobaccoStall;
    Visitor visitor;



    @Before
    public void before() {
        themePark = new ThemePark();
        rollercoaster = new Rollercoaster("Red Dragon", 8);
        dodgems = new Dodgems("Bumper Cars", 7);
        playground = new Playground("Monkey Pit", 5);
        hotDogStall = new HotDogStall("Bread Bangers", "John Dog", 6, ParkingSpot.B2);
        tobaccoStall = new TobaccoStall("Smoke Cloud", "Dean Smoke", 3, ParkingSpot.B2);
    }

    @Test
    public void themeParkCanAttractionsToList() {
        themePark.addAttraction(dodgems);
        assertEquals(1, themePark.getAttractionCount());
    }

    @Test
    public void themeParkCanAddStallsToList() {
        themePark.addStall(hotDogStall);
        assertEquals(1, themePark.getStallListCount());
    }




}
