package com.core.lesson1;

public class Team {
    private final String name;
    private final Member[] members = new Member[4];

    public Team(String name) {
        this.name = name;
        members[0] = new Member("Boris", 90);
        members[1] = new Member("Fedor", 100);
        members[2] = new Member("Efim", 110);
        members[3] = new Member("Vasiliy", 120);
    }

    public String getName() {
        return name;
    }

    public Member[] getMembers() {
        return members;
    }

    public void showComplete() {
        for (Member m : members) {
            if (m.getComplete()) System.out.println(m);
        }
    }

    public void showAll() {
        for (Member m : members) {
            System.out.println(m);
        }
    }
}

