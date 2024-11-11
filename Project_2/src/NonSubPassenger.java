public class NonSubPassenger extends Passenger{
private boolean discount ;

    public NonSubPassenger() {
    }

    public NonSubPassenger(String name, double tripeCost, Car car , boolean discount) {
        super(name, tripeCost, car);
        this.discount = discount ;
    }

    public boolean isDiscount() {
        return discount;
    }

    public void setDiscount(boolean discount) {
        this.discount = discount;
    }
    //    public double TripCost(Car c) {
//        if(getTripeCost() > 50){
//            System.out.println("discount 10%");
//            double dis = getTripeCost() * 0.10;
//            return c.route.getTripPrice()-dis;
//
//
//        }else{
//            System.out.println("no discount");
//            return c.route.getTripPrice() ;
//        }
//
//    }

    @Override
    public void info(Car c) throws Exception{

        if(discount == true) {
            setTripeCost(c.route.getTripPrice() - (c.route.getTripPrice() * 0.1));
            System.out.println("Trip cost is:" + getTripeCost() + "\n" + getCar().toString() + c.route.toString());
        }else{
            c.route.getTripPrice();
            System.out.println("Trip cost is:" + getTripeCost() + "\n" + getCar().toString() + c.route.toString());
        }

    }
}
