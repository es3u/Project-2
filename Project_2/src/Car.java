public class Car {
    private String code ;
     static int maximum_Capacity   ;
    Route route ;

    public Car() {
        maximum_Capacity--;
    }

    public Car(String code, int maximum_Capacity, Route route) {
        this.code = code;
        this.maximum_Capacity = maximum_Capacity;
        this.route = route;

        maximum_Capacity--;
    }

    public int getMaximum_Capacity() {
        return maximum_Capacity;
    }

    public void setMaximum_Capacity(int maximum_Capacity) {
        this.maximum_Capacity = maximum_Capacity;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    @Override
    public String toString() {
        return "Car{" +
                "code='" + code + '\'' +
                ", maximum_Capacity=" + maximum_Capacity +
                ", route=" + route +
                '}';
    }
}
