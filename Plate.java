package ru.lesson6;

public class Plate {

    /**
     * Уровень количества еды
     */
    protected int food;

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public Plate(int food) {
        this.food = food;
    }

    /**
     * Добавить еду
     * @param food
     */
    public void addFood(int food) {
        this.food += food;
    }

    /**
     * Получить еду
     * @param food количество требуемой еды
     * @return
     */
    public boolean getFood(int food) {
        if(this.food >= food) {
            this.food -= food;
            return true;
        }
        return false;
    }
}
