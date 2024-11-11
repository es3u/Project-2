public abstract class Passenger {
    private String name ;
    private double tripeCost;
    private Car car ;

    public Passenger() {
    }

    public Passenger(String name, double tripeCost, Car car) {
        this.name = name;
        this.tripeCost = tripeCost;
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTripeCost() {
        return tripeCost;
    }

    public void setTripeCost(double tripeCost) {
        this.tripeCost = tripeCost;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    //public abstract void reserveCar(Car car) throws Exception;
    public abstract void info(Car c) throws Exception;


    @Override
    public String toString() {
        return "Passenger{" +
                "name='" + name + '\'' +
                ", price_tripe=" + tripeCost +
                ", car=" + car +
                '}';
    }
}
