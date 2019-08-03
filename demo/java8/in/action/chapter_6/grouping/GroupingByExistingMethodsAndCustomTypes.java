package demo.java8.in.action.chapter_6.grouping;

import demo.java8.in.action.Dish;

import java.util.List;
import java.util.stream.Collectors;

public class GroupingByExistingMethodsAndCustomTypes {

    static List<Dish> dishes = Dish.menu;

    public static void main(String[] args) {
        System.out.println(dishes.stream().collect(Collectors.groupingBy(Dish::getType, Collectors.groupingBy(dish -> {
            if (dish.getCalories() <= 400) return DishCalorieLevel.DIET;
            else if (dish.getCalories() <= 700) return DishCalorieLevel.NORMAL;
            else return DishCalorieLevel.FAT;
        }))));
    }
}
