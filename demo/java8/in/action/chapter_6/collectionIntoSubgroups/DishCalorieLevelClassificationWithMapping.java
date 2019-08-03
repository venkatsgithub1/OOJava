package demo.java8.in.action.chapter_6.collectionIntoSubgroups;

import demo.java8.in.action.Dish;

import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class DishCalorieLevelClassificationWithMapping {
    static List<Dish> dishes = Dish.menu;

    public static void main(String[] args) {
        /*
        By default values of each key will be added to a list.
        If we want them to be saved to a set, we can use
        mapping to specify to save them to set.
         */
        System.out.println(dishes.stream().collect(Collectors.groupingBy(Dish::getType, Collectors.mapping(dish -> {
            if (dish.getCalories() <= 400) return DishCalorieLevel.DIET;
            else if (dish.getCalories() <= 700) return DishCalorieLevel.NORMAL;
            else return DishCalorieLevel.FAT;
        }, Collectors.toSet()))));


        /*
        Like above we can use mapping to save values of each key into HashSet.
         */
        System.out.println(dishes.stream().collect(Collectors.groupingBy(Dish::getType, Collectors.mapping(dish -> {
            if (dish.getCalories() <= 400) return DishCalorieLevel.DIET;
            else if (dish.getCalories() <= 700) return DishCalorieLevel.NORMAL;
            else return DishCalorieLevel.FAT;
        }, Collectors.toCollection(HashSet::new)))));
    }
}

enum DishCalorieLevel {
    DIET, NORMAL, FAT;
}