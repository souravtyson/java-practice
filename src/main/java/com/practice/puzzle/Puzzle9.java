package com.practice.puzzle;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

/**
 * @author Sourav Suman - 05-01-2025
 */
/*
You are given a folder containing multiple text files. Your task is to design and implement a Java program to:
1. Process these files efficiently.
2. Dynamically find the top nthand bottom nth most frequent words across all files.
 */


public class Puzzle9 {
    public static void main(String[] args) {
        System.out.println(getNthOccurenceOfWord(1, true));
        System.out.println(getNthOccurenceOfWord(2, false));
    }

    private static List<String> getNthOccurenceOfWord(int rank, boolean highest) {
        Path path = Paths.get("E:\\java-practice\\src\\main\\resources\\files");
        try {
            List<Path> paths = Files.walk(path)
                    .filter(Files::isRegularFile)
                    .collect(Collectors.toList());
            Map<String, Long> occurrence = new ConcurrentHashMap<>();

            ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

            for (Path p : paths) {
                executorService.execute(() -> {
                    try {
                        Files.lines(p)
                                .flatMap(line -> Arrays.stream(line.split("\\W+")))
                                .forEach(word -> {
                                    occurrence.merge(word.toLowerCase(), 1L, (a, b) -> Long.sum(a, b));
//                                    System.out.println(Thread.currentThread().getName());
                                });
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                });
            }

            executorService.shutdown();
            Thread.sleep(1000);
            System.out.println(occurrence);

            Map<Long, List<String>> wordListMap =
                    occurrence.entrySet().stream().collect(Collectors.groupingBy(Map.Entry::getValue,
                    Collectors.mapping(Map.Entry::getKey, Collectors.toList())));

            System.out.println(wordListMap);

            ArrayList<Long> frequency = new ArrayList<>(wordListMap.keySet());

            frequency.sort(highest ? Comparator.reverseOrder() : Comparator.naturalOrder());
            System.out.println(frequency);
            if(rank < 0 || rank > frequency.size()) {
                throw new IllegalArgumentException("Rank out of range");
            }

            return wordListMap.getOrDefault(frequency.get(rank - 1), Collections.emptyList());

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
