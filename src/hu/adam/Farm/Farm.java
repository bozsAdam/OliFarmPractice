package hu.adam.Farm;

import hu.adam.food.Almond;
import hu.adam.food.Food;
import hu.adam.food.Juniper;
import hu.adam.food.Spruce;

import java.util.LinkedList;
import java.util.List;

public class Farm {
    private List<Food> foods = new LinkedList<>();
    private Integer producedFood = 0;
    private Integer currentMonth = 0;

    public void addFood(Food food){
        foods.add(food);
    }

    public void harvestFood(Food food){
        foods.remove(food);
    }

    public void stepOneMonth(){
        foods.forEach(food ->{
            food.stepOneMonth();
            this.producedFood += food.produce();
        });
        System.out.println("----------  " + currentMonth + "TH MONTH  ----------");
        System.out.println("----------  ALMONDS  ----------");
        foods.forEach(food ->{
            if (food instanceof Almond){
                System.out.println(food);
            }
        });
        System.out.println("----------  JUNIPER  ----------");
        foods.forEach(food ->{
            if (food instanceof Juniper){
                System.out.println(food);
            }
        });
        System.out.println("----------  SPRUCE  ----------");
        foods.forEach(food ->{
            if (food instanceof Spruce){
                System.out.println(food);
            }
        });

        System.out.println("----------  PRODUCED FOOD  ----------");
        System.out.println(this.producedFood + " unit food produced now");
        currentMonth++;
    }
}
