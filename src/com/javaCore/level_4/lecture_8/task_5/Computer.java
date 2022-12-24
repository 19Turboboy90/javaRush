package com.javaCore.level_4.lecture_8.task_5;

public class Computer {
    private Keyboard keyboard;
    private Mouse mouse;
    private Monitor monitor;


    public Computer(Keyboard keyboard, Mouse mouse, Monitor monitor) {
        this.keyboard = keyboard;
        this.mouse = mouse;
        this.monitor = monitor;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Mouse getMouse() {
        return mouse;
    }
}
