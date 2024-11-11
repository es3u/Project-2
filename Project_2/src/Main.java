public class Main {
    public static void main(String[] args) {

        Route route1 = new Route("Location A", "Location B", 100);
        Route route2 = new Route("Location C", "Location D", 150);


        Car car1 = new Car("Car001", 2, route1);
        Car car2 = new Car("Car002",3 , route2);
        //Car car3 = new Car("Car003",0 , route2);


        Passenger subscriberPassenger = new SubPassenger("Alice",30, car2);
        Passenger nonSubscriberPassenger = new NonSubPassenger("Bob", 365,car1, true);



        Passenger[] passengers = {subscriberPassenger, nonSubscriberPassenger};


        for (Passenger p : passengers) {
            try {
                if(Car.maximum_Capacity ==0)
                    throw new Exception("\"Error for capacity 0\" ");
                else
                p.info(car1);


            } catch (Exception e) {
                System.out.println(e );
            }
        }

    }
}