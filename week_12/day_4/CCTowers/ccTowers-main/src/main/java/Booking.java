public class Booking {

    private Bedroom bedroom;
    int numNights;

    public Booking(Bedroom bedroom, int numNights){
        this.bedroom = bedroom;
        this.numNights = numNights;
    }

    public Bedroom getBedroom() {
        return bedroom;
    }

    public int getNumNights() {
        return numNights;
    }

    public void setNumNights(int numNights) {
        this.numNights = numNights;
    }

    public int getTotal(){
        int total = numNights * bedroom.getRate();
        return total;
    }

}
