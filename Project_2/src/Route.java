public class Route {
    private String start_Address , destination_Address ;
    private double tripPrice ;

    public Route() {
    }

    public Route(String start_Address, String destination_Address, double tripPrice) {
        this.start_Address = start_Address;
        this.destination_Address = destination_Address;
        this.tripPrice = tripPrice;
    }

    public String getStart_Address() {
        return start_Address;
    }

    public void setStart_Address(String start_Address) {
        this.start_Address = start_Address;
    }

    public String getDestination_Address() {
        return destination_Address;
    }

    public void setDestination_Address(String destination_Address) {
        this.destination_Address = destination_Address;
    }

    public double getTripPrice() {
        return tripPrice;
    }

    public void setTripPrice(double tripPrice) {
        this.tripPrice = tripPrice;
    }


    @Override
    public String toString() {
        return "Route{" +
                "start_Address='" + start_Address + '\'' +
                ", destination_Address='" + destination_Address + '\'' +
                ", tripPrice=" + tripPrice +
                '}';
    }
}
