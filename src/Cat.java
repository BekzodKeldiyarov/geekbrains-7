public class Cat {

    private String name;
    private boolean isHungry;
    private int appetite;

    // Конструктор

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.isHungry = true;
    }

    // Геттеры
    public int getAppetite() {
        return appetite;
    }

    public boolean getIsHungry() {
        return isHungry;
    }

    public String getName() {
        return name;
    }

    // Сеттеры

    public void setHungry(boolean hungry) {
        isHungry = hungry;
    }


    public void eat(Plate p) {
        if (p.decreaseFood(appetite)) {
            System.out.println(this.getName() + " поел и сытый сейчас");
            this.isHungry = false;
        } else {
            System.out.println("Для " + this.getName() + " не хватило еды. Лучше чуть еды положить в тарелочку");
        }
    }

}
