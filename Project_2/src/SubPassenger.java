public class SubPassenger extends Passenger{


    public SubPassenger() {
    }



    public SubPassenger(String name, double tripeCost, Car car) {
        super(name, tripeCost, car);
    }

    


//    public double TripCost(Car c) {
//        double dis = c.route.getTripPrice() * 0.5 ;
//        return c.route.getTripPrice() -dis ;
//    }

    @Override
    public void info(Car c)throws Exception {

        setTripeCost(c.route.getTripPrice() - (c.route.getTripPrice() * 0.5));
        System.out.println("Trip cost is:" + getTripeCost() + "\n" + getCar().toString() + c.route.toString());



    }
}
