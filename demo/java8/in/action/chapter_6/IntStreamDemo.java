package demo.java8.in.action.chapter_6;

import demo.java8.in.action.Dish;

import java.util.List;

public class IntStreamDemo {
    static List<Dish> dishes = Dish.menu;

    public static void main(String[] args) {
        /*
        Using mapToInt to get IntStream.
         */
        int caloriesSum = dishes.stream().mapToInt(Dish::getCalories).sum();

        System.out.println(caloriesSum);
    }
}
