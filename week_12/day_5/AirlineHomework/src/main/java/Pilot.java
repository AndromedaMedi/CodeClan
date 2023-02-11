public class Pilot {

    private String name;
    private CabinCrewMemberRank rank;

    public Pilot(String name, CabinCrewMemberRank rank) {
        this.name = name;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public CabinCrewMemberRank getRank() {
        return rank;
    }

    public String fly() {
        return "I love flying!";
    }
}
