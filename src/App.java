public class App {

    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 15);
        Plate plate = new Plate(150);

        Cat[] cats = new Cat[6];

        cats[0] = cat;
        cats[1] = new Cat("Ponchik", 25);
        cats[2] = new Cat("Whiskey", 45);
        cats[3] = new Cat("Melkiy", 12);
        cats[4] = new Cat("Rijiy", 1000);
        cats[5] = new Cat("Xvostik", 5);


        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
            System.out.printf("В тарелке осталось %d еды\n", plate.getFood());
            System.out.println("___________________________________");
        }

//        plate.addFood(100);
//        plate.setFood(9999);
    }
}
