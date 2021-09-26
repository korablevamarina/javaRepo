package com.core.lesson1;

public class Course {
    private final Let[] lets;

    public Course() {
        Let dirt = new Let(10);
        Let water = new Let(30);
        Let pit = new Let(20);
        Let rock = new Let(40);
        this.lets = new Let[]{dirt, rock, water, pit};
    }

    public void doIt(Team t) {
        for (Member member : t.getMembers()) {
            doIt(member);
        }
    }

    private void doIt(Member member) {
        for (Let let : lets) {
            member.decreaseStamina(let.getNeedStamina());
            if (member.getStamina() < 0) {
                System.out.println(member.getName() + " is out of stamina!");
                return;
            }
        }
        System.out.println(member.getName() + " is complete the course!");
        member.setComplete(true);
    }
}
