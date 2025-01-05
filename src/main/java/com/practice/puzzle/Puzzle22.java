package com.practice.puzzle;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Sourav Suman - 05-01-2025
 */
/*
Create a Stream pipeline to read a file line by line, filter lines containing a specific word, and collect those lines into a new list.
 */
public class Puzzle22 {
    public static void main(String[] args) {
        Puzzle22 puzzle22 = new Puzzle22();
        System.out.println(puzzle22.getLinesContainingWord("specific"));
    }

    private List<String> getLinesContainingWord(String s) {
        try {
            Path path = Paths.get("E:\\java-practice\\src\\main\\resources\\files\\puzzle22-file");
            return Files.lines(path)
                    .filter(line -> line.contains(s))
                    .collect(Collectors.toList());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
