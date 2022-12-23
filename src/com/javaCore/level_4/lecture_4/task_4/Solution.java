package com.javaCore.level_4.lecture_4.task_4;

/*
Давай напишем программу, которая создает мышонка.
Для этого инициализируй объект obj таким классом, чтобы метод main() выполнился без ошибок.

Требования:
•	Класс GrayMouse должен наследоваться от класса Mouse.
•	Класс Jerry должен наследоваться от класса GrayMouse.
•	В переменной obj должен храниться объект, который будет одновременно являться и Mouse, и GrayMouse, и Jerry.
•	Метод main должен вызывать метод printClasses.
 */
public class Solution {
    public static void main(String[] args) {
        Object obj = new Jerry();

        Mouse mouse = (Mouse) obj;
        GrayMouse grayMouse = (GrayMouse) mouse;
        Jerry jerry = (Jerry) grayMouse;

        printClasses(obj, mouse, grayMouse, jerry);

    }

    public static void printClasses(Object obj, Mouse mouse, GrayMouse grayMouse, Jerry jerry) {
        System.out.println(jerry.getClass().getSimpleName());
        System.out.println(grayMouse.getClass().getSimpleName());
        System.out.println(mouse.getClass().getSimpleName());
        System.out.println(obj.getClass().getSimpleName());
    }

    static class Mouse {
    }

    static class GrayMouse extends Mouse {
    }

    static class Jerry extends GrayMouse {
    }
}
