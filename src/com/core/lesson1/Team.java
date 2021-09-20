package com.core.lesson1;

public class Team {
    public String name;
    Member[] members = new Member[4];

    public Team(String name) {
        this.name = name;
        members[0] = new Member("Boris");
        members[1] = new Member("Fedor");
        members[2] = new Member("Efim");
        members[3] = new Member("Vasiliy");
    }

    public void showComplete() {
        for (Member m : members) {
            if (m.isComplete) System.out.println(m);
        }
    }

    public void showAll() {
        for (Member m : members) {
            System.out.println(m);
        }
    }
}

class Member {
    public String name;
    public Boolean isComplete;

    public Member(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                '}';
    }

}

class Course {
    public void doIt(Team t) {
        
    }
}