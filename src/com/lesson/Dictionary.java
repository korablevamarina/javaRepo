package com.lesson;

import java.util.HashSet;

public class Dictionary {
    private final HashSet<Record> records = new HashSet<>();

    public void addRecord(String lastName, String phoneNumber) {
        Record record = find(lastName);
        if (record != null && !record.getPhones().contains(phoneNumber)) {
            record.addNumber(phoneNumber);
        } else {
            records.add(new Record(lastName, phoneNumber));
        }
    }

    public Record find(String lastName) {
        for (Record rec : records) {
            if (rec.getLastname().equals(lastName))
                return rec;
        }
        return null;
    }
    @Override
    public String toString() {
        return records.toString();
    }
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();
        dictionary.addRecord("Ivanov", "123");
        dictionary.addRecord("Petrov", "456");
        dictionary.addRecord("Sidorov", "789");
        dictionary.addRecord("Ivanov", "234");
        dictionary.addRecord("Petrov", "567");
        System.out.println(dictionary);
    }
}

