public class Bicycle extends Transport{

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
}
