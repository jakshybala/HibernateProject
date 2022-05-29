package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

	// write your code here
        List<Integer> numbers = Arrays.asList(1,5,11,3,4);

        Integer min = numbers.stream().reduce(Integer.MAX_VALUE, (left, rigth) -> left < rigth ? left : rigth);
        System.out.println("Minumum of Integer: " + min);
        Integer max = numbers.stream().reduce(Integer.MIN_VALUE,(left, right) -> left > right ? left : right);
        System.out.println("Maximum of integer: " + max);
        Integer max2 = numbers.stream().max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println(max2);









    }
}
