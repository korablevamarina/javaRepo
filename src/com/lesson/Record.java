package com.lesson;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Record {
    private final String lastname;
    private final List<String> phones = new LinkedList<>();

    public Record(String lastname, String phonNumber) {
        this.lastname = lastname;
        phones.add(phonNumber);
    }

    public void addNumber(String phonNumber) {
        phones.add(phonNumber);
    }

    public String getLastname() {
        return lastname;
    }

    public List<String> getPhones() {
        return new LinkedList<>(phones);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Record record = (Record) o;
        return lastname.equals(record.lastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastname);
    }

    @Override
    public String toString() {
        return lastname + " : " + phones;
    }
}
