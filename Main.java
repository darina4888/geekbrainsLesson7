package ru.lesson6;

public class Main {
    public static void main(String[] args) {

        Plate plate = new Plate(150);

        Cat[] cats = new Cat[5];
        cats[0] = new Cat("cat1",50);
        cats[1] = new Cat("cat2",30);
        cats[2] = new Cat("cat3",15);
        cats[3] = new Cat("cat4",25);
        cats[4] = new Cat("cat5",40);

        StringBuilder s = new StringBuilder();

        for (Cat cat : cats) {
            cat.eat(plate);

            if(cat.getSatiety()) s.append("Кот " + cat.getName() + " сыт\n");
            else s.append("Кот " + cat.getName() + " остался голодный\n");
        }

        System.out.println(s);

        plate.addFood(10);

        cats[4].eat(plate);
        
        if(cats[4].getSatiety()) System.out.println("Кот " + cats[4].getName() + " сыт");
        else System.out.println("Кот " + cats[4].getName() + " остался голодный");
    }
}


