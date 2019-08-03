package demo.java8.in.action.chapter_6.collectionIntoSubgroups;

import demo.java8.in.action.Dish;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class AdaptingCollectorToDifferentType {

    private static List<Dish> dishes = Dish.menu;

    public static void main(String[] args) {
        /*
        Since optional returned by collectors maxby is not useful,
        using collectingAndThen to get Optional and call get method
        to get actual value.
        groupingBy lazily adds the data to group only if data is present, else
        it won't create group also, so optional is not so much useful.
         */
        System.out.println(dishes.stream().collect(Collectors.groupingBy(Dish::getType, Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingInt(Dish::getCalories)), Optional::get))));
    }
}
