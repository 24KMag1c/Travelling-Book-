package item;
public class Flight {
    private String flightNum;
    private int price;
    private int numSeats;
    private int numAvail;
    private String fromCity;
    private String arivCity;

    public Flight(String flightNum, int price, int numSeats, int numAvail, String fromCity, String arivCity) {
        this.flightNum = flightNum;
        this.price = price;
        this.numSeats = numSeats;
        this.numAvail = numAvail;
        this.fromCity = fromCity;
        this.arivCity = arivCity;
    }
    public Flight() {
        this.flightNum = null;
        this.price = 0;
        this.numSeats = 0;
        this.numAvail = 0;
        this.fromCity = null;
        this.arivCity = null;
    }
    public String getFlightNum() {
        return flightNum;
    }
    public void setFlightNum(String flightNum) {
        this.flightNum = flightNum;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public int getNumSeats() {
        return numSeats;
    }
    public void setNumSeats(int numSeats) {
        this.numSeats = numSeats;
    }

    public int getNumAvail() {
        return numAvail;
    }

    public void setNumAvail(int numAvail) {
        this.numAvail = numAvail;
    }
    public String getFromCity() {
        return fromCity;
    }
    public void setFromCity(String fromCity) {
        this.fromCity = fromCity;
    }
    public String getArivCity() {
        return arivCity;
    }
    public void setArivCity(String arivCity) {
        this.arivCity = arivCity;
    }
}

