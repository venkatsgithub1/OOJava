package demo.java8.in.action.chapter_6.collectionIntoSubgroups;

import demo.java8.in.action.Dish;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MaxCalorieDishInEachGroup {
    static List<Dish> dishes = Dish.menu;

    public static void main(String[] args) {
        System.out.println(dishes.stream().collect(Collectors.groupingBy(Dish::getType, Collectors.maxBy(Comparator.comparingInt(Dish::getCalories)))));
    }
}
