package com.javaCore.level_4.lecture_6.task_1;

public class UkrainianHen extends Hen {
    @Override
    int getCountOfEggsPerMonth() {
        return 1000;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + String.format(" Моя страна - %s. Я несу %d яиц в месяц.", Country.UKRAINE, getCountOfEggsPerMonth());
    }
}
