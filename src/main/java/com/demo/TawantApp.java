package com.demo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TawantApp {
    public static void main(String[] args) {
        System.out.println("Hello");
        String s = "java scala ruby";
        String[] words = s.split(" ");
        Map<String, Integer> map = new HashMap();
        for (String k : words) {
            String[] o = k.split("");
            for (String p : o) {
                if (map.containsKey(p)) {
                    map.put(p, map.get(p) + 1);
                } else {
                    map.put(p, 1);
                }
            }
        }
        System.out.println(map);

        List<String> s1 = Arrays.asList("java scala ruby", "java react spring java");
        int size = s1.stream().flatMap(x -> Arrays.stream(x.split(" "))).filter(x -> x.equals("java")).collect(Collectors.toList()).size();
        System.out.println(size);

        List<Integer> x = Arrays.asList(1, 2, 3, 2);
        List<Integer> collect = x.stream().distinct().collect(Collectors.toList());
        System.out.println(collect);
    }
}
