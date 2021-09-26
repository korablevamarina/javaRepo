package com.core.lesson1;

public class Main {
    public static void main(String[] args) {
        Team t = new Team("Java team");
        Course c = new Course();
        c.doIt(t);
        System.out.println("\nAll members of team " + t.getName());
        t.showAll();

        System.out.println("\nThe Winners are: " + t.getName());
        t.showComplete();
    }
}
