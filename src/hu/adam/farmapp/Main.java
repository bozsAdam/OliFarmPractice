package hu.adam.farmapp;

import hu.adam.Farm.Farm;
import hu.adam.food.Almond;
import hu.adam.food.Juniper;
import hu.adam.food.Spruce;

public class Main {

    public static void main(String[] args) {
        Farm farm = new Farm();
        for (int i = 0; i < 5; i++) {
            farm.addFood(new Spruce());
            farm.addFood(new Almond());
            farm.addFood(new Juniper());
        }

        for (int i = 0; i < 80; i++) {
            farm.stepOneMonth();
        }
    }
}
