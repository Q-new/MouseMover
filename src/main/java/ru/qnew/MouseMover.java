package ru.qnew;


import java.awt.*;
import java.io.IOException;

public class MouseMover {
    public static void main(String[] args) {
        try {
            Robot robot = new Robot();

            int wait = Integer.parseInt(args[0]);

            demonize();

            while(true) {
                Point location = MouseInfo.getPointerInfo().getLocation();
                robot.mouseMove(location.x + 1, location.y + 1);
                Thread.sleep(wait);
            }
        } catch (Exception e){
            //ignored
        }
    }

    public static void demonize(){
        System.out.close();
        try {
            System.in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
