package com.core.lesson1;

public class Member {
    private final String name;
    private int stamina;
    private boolean isComplete;

    public Member(String name, int stamina) {
        this.name = name;
        this.stamina = stamina;
    }

    public String getName() {
        return name;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public void decreaseStamina(int decStamina) {
        stamina -= decStamina;
    }

    public Boolean getComplete() {
        return isComplete;
    }

    public void setComplete(Boolean complete) {
        isComplete = complete;
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                " stamina=" + stamina +
                '}';
    }

}
