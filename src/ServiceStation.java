public class ServiceStation {
    /*public static void check(Car car, Bicycle bicycle, Truck truck) {
        if (car != null) {
            System.out.println("Обслуживаем " + car.getModelName());
            for (int i = 0; i < car.getWheelsCount(); i++) {
                car.updateTyre();
            }
            car.checkEngine();
        } else if (truck != null) {
            System.out.println("Обслуживаем " + truck.getModelName());
            for (int i = 0; i < truck.getWheelsCount(); i++) {
                truck.updateTyre();
            }
            truck.checkEngine();
            truck.checkTrailer();
        } else if (bicycle != null) {
            System.out.println("Обслуживаем " + bicycle.getModelName());
            for (int i = 0; i < bicycle.getWheelsCount(); i++) {
                bicycle.updateTyre();
            }
        }
    }*/

    public static void checkNew(Car car, Bicycle bicycle, Truck truck) {
        printUpdateTyre(car);
        car.checkEngine();

        printUpdateTyre(bicycle);

        printUpdateTyre(truck);
        truck.checkEngine();
        truck.checkTrailer();

    }
    private static void printUpdateTyre(Transport obj){
        if (obj != null) {
            System.out.println("Обслуживаем " + obj.getModelName());
            for (int i = 0; i < obj.getWheelsCount(); i++) {
                obj.updateTyre();
            }
        }
    }
}
