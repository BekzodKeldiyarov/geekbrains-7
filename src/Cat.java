public class Cat {

    private String name;
    private int appetite;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public int getAppetite() {
        return appetite;
    }

    public void eat(Plate p){
//        p.getFood() = this.getAppetite();

        p.decreaseFood(appetite);
    };
}
