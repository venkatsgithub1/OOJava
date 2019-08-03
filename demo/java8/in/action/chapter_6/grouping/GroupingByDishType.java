package demo.java8.in.action.chapter_6.grouping;

import demo.java8.in.action.Dish;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GroupingByDishType {

    static List<Dish> dishes = Dish.menu;

    public static void main(String[] args) {
        System.out.println(dishes.stream().collect(Collectors.groupingBy(Dish::getType)));
    }
}
