package com.practice.puzzle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Sourav Suman - 05-01-2025
 */
/*
Given a list of transactions (with id, amount, and type), write a program to:

Filter transactions with an amount greater than 1000.
Group transactions by their type.
Find the total amount for each type.
 */
public class Puzzle21 {
    public static void main(String[] args) {
        Puzzle21 puzzle21 = new Puzzle21();
        List<Transaction> transactionList = new ArrayList<>();
        transactionList.add(new Transaction(1, 500, "Food"));
        transactionList.add(new Transaction(2, 1500, "Shopping"));
        transactionList.add(new Transaction(3, 2000, "Transport"));
        transactionList.add(new Transaction(4, 800, "Food"));
        transactionList.add(new Transaction(5, 1200, "Shopping"));
        transactionList.add(new Transaction(6, 3000, "Transport"));
        transactionList.add(new Transaction(7, 700, "Food"));
        transactionList.add(new Transaction(8, 1800, "Food"));
        System.out.println(puzzle21.totalForEachTransactionTypeGreaterThan1000(transactionList));
        List<Transaction> transactions = Arrays.asList(
                new Transaction(1, 1200, "Food"),
                new Transaction(2, 500, "Transport"),
                new Transaction(3, 2500, "Shopping"),
                new Transaction(4, 800, "Food"),
                new Transaction(5, 3000, "Shopping"),
                new Transaction(6, 1500, "Transport")
        );
        System.out.println(puzzle21.totalForEachTransactionTypeGreaterThan1000(transactions));

    }

    private Map<String, Long> totalForEachTransactionTypeGreaterThan1000(List<Transaction> transactionList) {
        return transactionList.stream()
                .filter(transaction -> transaction.getAmount() > 1000)
                .collect(Collectors.groupingBy(Transaction::getType, Collectors.summingLong(Transaction::getAmount)));
    }
}

class Transaction {
    private int id;
    private int amount;
    private String type;

    public Transaction(int id, int amount, String type) {
        this.id = id;
        this.amount = amount;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public int getAmount() {
        return amount;
    }

    public String getType() {
        return type;
    }
}
