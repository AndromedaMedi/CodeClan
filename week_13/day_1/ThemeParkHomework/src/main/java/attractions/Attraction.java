package attractions;

import behaviours.IReviewed;

import java.util.ArrayList;

public abstract class Attraction implements IReviewed {

    public String name;

    public int rating;
    public int visitCount;

    public Attraction(String name, int rating) {
        this.name = name;
        this.rating = rating;
        this.visitCount = 0;
    }

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }

    public int getVisitCount() {
        return visitCount;
    }
}
