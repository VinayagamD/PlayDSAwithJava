package com.vinaylogics.playdsawithjava.streams;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindNumberOccurrence {

    public static void main(String[] args) {
        List<Integer> data = new ArrayList<>();
                IntStream.rangeClosed(1,100).forEach(i->
                        data.add(ThreadLocalRandom.current().nextInt(1,100)));
                Map<Integer, List<Integer>> groupData = data.stream().collect(Collectors.groupingBy(Integer::intValue));
        System.out.println(groupData);
    }
}
