public class Plate {
    private int food;

    public Plate(int food) {
        if (food >= 0) {
            this.food = food;
        } else {
            throw new IllegalArgumentException("Еда в тарекле не может быть меньше 0");
        }
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        if (food >= 0) {
            this.food = food;
        } else {
            System.out.println("Еда в тарелке не может быть меньше 0.");
        }
    }

    public void addFood(int food) {
        if (food >= 0) {
            this.food += food;
        } else {
            System.out.println("Добавьте >0 количество еды.");
        }
    }

    public void info() {
        System.out.println("Plate: " + food);
    }

    public boolean decreaseFood(int amountToDecrease) {
        if (this.food >= amountToDecrease) {
            this.food -= amountToDecrease;
            return true;
        }
        return false;
    }
}
