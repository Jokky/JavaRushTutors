package com.javarush.task.task13.task1328;

public class Robot extends AbstractRobot {
    private String name;

    public Robot(String name) {
        this.name = name;
    }

    @Override
    public BodyPart attack() {
        return super.attack();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
