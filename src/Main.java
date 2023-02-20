public class Main {
    public static void main(String[] args) {
        Car car = new Car("car1", 4);
        Car car2 = new Car("car2", 4);

        Truck truck = new Truck("truck1", 6);
        Truck truck2 = new Truck("truck2", 8);

        Bicycle bicycle = new Bicycle("bicycle1", 2);
        Bicycle bicycle2 = new Bicycle("bicycle2", 2);

        //ServiceStation.check(car, null, null);
        //ServiceStation.check(car2, null, null);
        //ServiceStation.check(null, bicycle, null);
        //ServiceStation.check(null, bicycle2, null);
        //ServiceStation.check(null, null, truck);
        //ServiceStation.check(null, null, truck2);
        ServiceStation.checkNew(car, bicycle, truck);
        ServiceStation.checkNew(car2, bicycle2, truck2);
    }
}