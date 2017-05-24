package com.javarush.task.task14.task1413;

/**
 * Created by pdv on 25.04.2017.
 */
public class Computer {

    private Keyboard keyboard;
    private Mouse mouse;
    private Monitor monitor;

    public Computer(Keyboard keyboard, Mouse mouse, Monitor monitor) {
        this.keyboard = keyboard;
        this.mouse = mouse;
        this.monitor = monitor;
    }

    public Monitor getMonitor() {
        return monitor;
    }



    public Keyboard getKeyboard() {
        return keyboard;
    }



    public Mouse getMouse() {
        return mouse;
    }


}
