public class Bicycle extends Transport{
    @Override
    public void checkEngine() {
        System.out.println("Двигатель в велосипеде отсутствует");
    }

    @Override
    public void checkTrailer() {
        System.out.println("Прицеп у велосипеда отсутствует");
    }

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
}
