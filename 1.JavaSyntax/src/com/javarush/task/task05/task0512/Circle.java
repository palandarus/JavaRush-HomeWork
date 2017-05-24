package com.javarush.task.task05.task0512;

/* 
Создать класс Circle
*/

public class Circle {
    private int centerX = 0;
    private int centerY = 0;
    private int radius = 0;
    private int width = 0;
    private int color = 0;
    public void initialize(int centerX, int centerY, int radius) {
        this.centerX=centerX;
        this.centerY=centerY;
        this.radius=radius; }
    public void initialize(int centerX, int centerY, int radius, int width) {
        initialize(centerX, centerY, radius);
        this.width=width; }
    public void initialize(int centerX, int centerY, int radius, int width, int color) {
        initialize(centerX, centerY, radius, width);
        this.color=color; }

    public static void main(String[] args) {

    }
}
