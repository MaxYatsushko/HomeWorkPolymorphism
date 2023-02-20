public class Car extends Transport{

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void checkTrailer() {
        System.out.println("Машины без прицепа");
    }

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

}
