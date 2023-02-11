public class CabinCrewMember {

    private String name;
    private CabinCrewMemberRank rank;

    public CabinCrewMember(String name, CabinCrewMemberRank rank) {
        this.name = name;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public CabinCrewMemberRank getRank() {
        return rank;
    }

    public String speakToPassengers() {
        return "Welcome to our flight!";
    }
}
