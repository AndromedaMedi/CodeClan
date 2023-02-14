import attractions.Attraction;
import behaviours.IReviewed;
import stalls.Stall;

import java.util.ArrayList;

public class ThemePark implements IReviewed{

    public ArrayList<Attraction> attractions;
    public ArrayList<Stall> stalls;

    public ThemePark() {
        this.attractions = new ArrayList<Attraction>();
        this.stalls = new ArrayList<Stall>();
    }

    public void addAttraction(Attraction attraction) {
        this.attractions.add(attraction);
    }

    public void addStall(Stall stall) {
        this.stalls.add(stall);
    }

    public int getAttractionCount() {
        return attractions.size();
    }

    public int getStallListCount() {
        return stalls.size();
    }

    public ArrayList<IReviewed> getReviewed() {
        ArrayList<IReviewed> reviewed = new ArrayList<>();
        reviewed.addAll(this.attractions);
//        reviewed.addAll(this.stalls);
        return reviewed;
    }

    @Override
    public int getRating() {
        return 0;
    }

    @Override
    public String getName() {
        return null;
    }


//    public String getAttractionName(Attraction attraction) {
//        return attraction.name;
//    }
//
//    public int getAttractionRating(Attraction attraction) {
//        return attraction.rating;
//    }

}
