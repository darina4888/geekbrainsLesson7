package ru.lesson6;

public class Animal {
    /**
     * Кличка животного
     */
    protected String name;

    /**
     * Уровень аппетита животного
     */
    protected int appetite;

    /**
     * Показатель сытости животного
     */
    protected boolean isSatiety = false;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getSatiety() {
        return isSatiety;
    }

    public void setSatiety(boolean satiety) {
        this.isSatiety = satiety;
    }

    public int getAppetite() {
        return appetite;
    }

    public Animal(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    /**
     * Прием пищи
     * @param plate
     */
    public void eat(Plate plate) {
        if(plate.getFood(appetite)) {
            setSatiety(true);
            System.out.println(this.name + " поел. Осталось еды : " + plate.getFood());
        } else System.out.println("Еды не хватило! Требуется " + this.appetite + ", осталось " + plate.getFood());
    }
}
