public class App {

    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 5);
        Plate plate = new Plate(100);

        plate.info();
        cat.eat(plate);
//        plate.setFood(plate.getFood() - cat.getAppetite());
//        cat.eat(plate);
        plate.info();
    }
}
